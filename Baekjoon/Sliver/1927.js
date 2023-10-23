const fs = require("fs");
let input = fs.readFileSync("./input.txt").toString();
input = input.split("\n").map((el) => parseInt(el));
let N = input.shift();

let heap = [];
let heapsize = 0;
heap.push(0); // 편의상 맨 앞 칸 비우기
let output = [];

for (let i = 0; i < N; i++) {
  //console.log(i + '번째');
  if (input[i] === 0) {
    //console.log(heap);
    if (heapsize === 0) {
      output.push(0);
    } else {
      // 요소 삭제
      output.push(heap[1]);
      heap[1] = heap[heapsize];
      heapsize--;
      heap.pop();

      // 요소 정렬
      let idx = 1;
      while (idx * 2 <= heapsize) {
        let leftChild = idx * 2;
        let rightChild = idx * 2 + 1;
        let smallerChild = leftChild;
        
        if (rightChild <= heapsize && heap[leftChild] > heap[rightChild])
          smallerChild = rightChild;

        if (heap[smallerChild] >= heap[idx])
          break;

        [heap[idx], heap[smallerChild]] = [heap[smallerChild], heap[idx]];
        idx = smallerChild;
      }
      //console.log(heap);
    }
  } else {
    // 요소 삽입
    heapsize++;
    heap.push(input[i]);

    // 요소 정렬
    let idx = heapsize;
    while (idx > 1) {
      let parentIdx = Math.floor(idx / 2);
      if (heap[parentIdx] <= heap[idx]) {
        break;
      }
      [heap[parentIdx], heap[idx]] = [heap[idx], heap[parentIdx]];
      idx = parentIdx;
    }
    //console.log(heap);
  }
}

console.log(output.join('\n'));

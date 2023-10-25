## 1, 2차원 배열 탐색

### 1. 큰 수 출력하기
```js
function solution(words) {
  let answer = [words[0]];

  for (let i = 1; i < words.length; i++) {
    if (words[i] > words[i - 1]) answer.push(words[i]);
  }

  return answer;
}

let input = [7, 3, 9, 5, 6, 12];
console.log(solution(input));
```
<br>

### 2. 보이는 학생
```js
function solution(students) {
  let answer = 0;

  let max = students[0];
  for (let i = 1; i < students.length; i++) {
    if (students[i] >= max) {
      answer++;
      max = students[i];
    }
  }

  return answer;
}

let input = [130, 135, 148, 140, 145, 150, 150, 153];
console.log(solution(input));
```
<br>

### 3. 가위 바위 보
```js
function solution(a, b) {
  let answer = [];

  for (let i = 0; i < a.length; i++) {
    if (a[i] === 1) {
      if (b[i] === 1) answer.push("D");
      else if (b[i] === 2) answer.push("B");
      else answer.push("A");
    } else if (a[i] === 2) {
      if (b[i] === 1) answer.push("A");
      else if (b[i] === 2) answer.push("D");
      else answer.push("B");
    } else {
      if (b[i] === 1) answer.push("B");
      else if (b[i] === 2) answer.push("A");
      else answer.push("D");
    }
  }

  return answer;
}

let a = [2, 3, 3, 1, 3];
let b = [1, 1, 2, 2, 3];
console.log(solution(a, b));
```
<br>

### 4. 점수 계산
```js
function solution(arr) {
  let answer = 0;

  let prev = 0;
  for (let i = 0; i < arr.length; i++) {
    if (i === 0 && arr[i] === 1) {
      answer = 1;
      prev = 1;
      continue;
    }

    if (arr[i] === 0) {
      prev = 0;
    } else {
      prev++;
      answer += prev;
    }
  }

  return answer;
}

let arr = [1, 0, 1, 1, 1, 0, 0, 1, 1, 0];
console.log(solution(arr));
```

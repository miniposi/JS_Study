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

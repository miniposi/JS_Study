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
<br>

### 5. 등수 구하기
```js
function solution(arr) {
  let answer = [];
  let sortArr = [...arr];
  sortArr.sort((a, b) => b - a);

  for (let i = 0; i < arr.length; i++) {
    console.log(sortArr[i] + " " + arr[i]);
    answer.push(sortArr.indexOf(arr[i]) + 1);
  }

  return answer;
}

let arr = [87, 89, 92, 100, 76];
console.log(solution(arr));
```
<br>

### 6. 격자판 최대합
```js
function solution(arr) {
  let answer = 0;

  let sum;
  for (let i = 0; i < 5; i++) {
    // 각 행의 합
    sum = 0;
    for (let j = 0; j < 5; j++) {
      sum += arr[i][j];
    }
    if (sum > answer) answer = sum;

    // 각 열의 합
    sum = 0;
    for (let j = 0; j < 5; j++) {
      sum += arr[j][i];
    }
    if (sum > answer) answer = sum;
  }

  // 대각선의 합
  sum = 0;
  for (let i = 0; i < 5; i++) {
    sum += arr[i][i];
  }
  if (sum > answer) answer = sum;
  sum = 0;
  for (let i = 0; i < 5; i++) {
    sum += arr[i][4 - i];
  }
  if (sum > answer) answer = sum;

  return answer;
}

let arr = [
  [10, 13, 10, 12, 15],
  [12, 39, 30, 23, 11],
  [11, 25, 50, 53, 15],
  [19, 27, 29, 37, 27],
  [19, 13, 30, 13, 19],
];
console.log(solution(arr));
```
<br>

### 7. 봉우리
```js
function solution(arr) {
  let answer = 0;

  // 확장 배열 생성
  let N = arr.length + 1;
  let exArr = [];
  for (let i = 0; i <= N; i++) {
    exArr[i] = [];
    for (let j = 0; j <= N; j++) {
      if (i === 0 || i === N || j === 0 || j === N) {
        exArr[i][j] = 0;
      } else {
        exArr[i][j] = arr[i - 1][j - 1];
      }
    }
  }

  // 봉우리 개수 찾기
  for (let i = 1; i < N; i++) {
    for (let j = 1; j < N; j++) {
      let current = exArr[i][j];
      if (
        current > exArr[i - 1][j] &&
        current > exArr[i][j - 1] &&
        current > exArr[i + 1][j] &&
        current > exArr[i][j + 1]
      )
        answer++;
    }
  }

  return answer;
}

let arr = [
  [5, 3, 7, 2, 3],
  [3, 7, 1, 6, 1],
  [7, 2, 5, 3, 4],
  [4, 3, 6, 4, 1],
  [8, 7, 3, 5, 2],
];
console.log(solution(arr));
```


## 문자열 탐색

### 1. 회문 문자열
```js
function solution(arr) {
  let answer = "YES";
  let size = arr.length - 1;
  arr = arr.toLowerCase();
  for (let i = 0; i < size / 2; i++) {
    if (arr[i] !== arr[size - i]) {
      answer = "NO";
      break;
    }
  }

  return answer;
}

let str = "gooG";
console.log(solution(str));
```
<br>

### 2. 팰린드롬
```js
function solution(str) {
  let answer = "YES";
  str = str.replace(/[^a-zA-Z]/g, "").toLowerCase();
  let size = str.length - 1;
  for (let i = 0; i < size / 2; i++) {
    if (str[i] !== str[size - i]) {
      answer = "NO";
      break;
    }
  }

  return answer;
}

let str = "found7, time: study; _Yduts; emit, 7Dnuof";
console.log(solution(str));
```
<br>

### 3. 숫자만 추출
```js
function solution(str) {
  let answer = "YES";
  str = str.replace(/[^0-9]/g, "");

  return parseInt(str);
}

let str = "g0en2T0s8eSoft";
console.log(solution(str));
```
<br>

### 4. 문자거리
```js

```
<br>

### 5. 문자열 압축
```js

```

# 섹션 1 문제 풀이

### 1. 세 수 중 최솟값
``` js
function solution(a, b, c){
  let answer = (a < b) ? a : b;
  answer = (answer < c) ? answer : c;

  return answer;
}

console.log(solution(6, 5, 11));
```
<br>

### 2. 삼각형 판별하기
1. 주어진 세 개의 수 중에서 가장 큰 값(biggest)를 구한다.
2. 나머지 두 수의 합이 biggest보다 크면 YES를 출력한다.
``` js
function solution(a, b, c){
  let answer = "NO";
  let biggest = (a > b) ? a : b;
  biggest = (biggest > c) ? biggest : c;
  if (a + b + c - biggest > biggest)
    answer = "YES";

  return answer;
}

console.log(solution(13, 33, 17));
```
<br>

### 3. 연필 개수
**solution**
N명을 12개로 나눠서 올림하면 되는 문제
``` js
function solution(N){
  let answer = Math.ceil(N / 12);
  return answer;
}

console.log(solution(178));
```
<br>

### 4. 1부터 N까지의 합
``` js
function solution(N){
  let answer = N * (N - 1) / 2;
  return answer;
}

console.log(solution(6));
```
<br>

### 5. 최솟값 구하기
``` js
function solution(a, b, c, d, e, f, g){
  let answer = a;
  let nums = [ b, c, d, e, f, g ];
  for (let i = 0; i < 6; i++) {
    if (answer > nums[i])
      answer = nums[i];
  }

  return answer;
}

console.log(solution(5, 3, 7, 11, 2, 15, 17));
```
<br>

### 6. 홀수
``` js
function solution(a, b, c, d, e, f, g){
  let sum = 0;
  let min;
  let nums = [ a, b, c, d, e, f, g ];
  for (let i = 0; i < 7; i++) {
    if (nums[i] % 2 !== 0) {
      sum += nums[i];
      if (min === undefined || min > nums[i])
        min = nums[i];
    }
  }

  console.log(sum);
  console.log(min);
}

solution(12, 77, 38, 41, 53, 92, 85);
```
<br>

### 7. 10부제
``` js
function solution(date, cars){
  let answer = 0;
  
  for (let car of cars) {
  if (car % 10 === date)
    answer++;
  }
  
  return answer;
}
  
let cars = [25, 23, 11, 47, 53, 17, 33]
console.log(solution(3, cars));
```
<br>

### 8. 일곱난쟁이
``` js
function solution(cans){
  let answer = [...cans];
  let sum = 0;
  cans.forEach((can) => {	sum += can;	});
  console.log(sum);
  for (let i = 0; i < 8; i++) {
    for (let j = i + 1; j < 9; j++) {
      if ((sum - (cans[i] + cans[j])) === 100) {
        answer.splice(i, 1);
        answer.splice(j - 1, 1);
        return answer;
      }
    }
  }
}

let height = [20, 7, 23, 19, 10, 15, 25, 8, 13]
console.log(solution(height));
```
<br>

### 9. A를 #dmfh
``` js
function solution(words){
  let answer = [...words];
  for (let i = 0; i < words.length; i++) {
    if (words[i] === "A")
      answer.splice(i, 1, "#");
  }

  return answer.join('');
}

console.log(solution("BANANA"));
```
<br>

### 10. 문자 찾기
``` js
function solution(list, word) {
  let answer = 0;
  
  for (let each of list) {
    if (each === word) answer++;
  }
  
  return answer;
}

console.log(solution("COMPUTERPROGRAMMING", "R"));
```
<br>

### 11. 대문자 찾기
``` js
function solution(list) {
  let answer = 0;

  for (let each of list) {
    if (each.charCodeAt(0) < 97) answer++;
  }

  return answer;
}

console.log(solution("KoreaTimeGood"));
```
<br>

### 12. 대문자로 통일
``` js
function solution(list) {
  return list.toUpperCase();
}

console.log(solution("ItisTimeToStudy"));
```
<br>

### 13. 대소문자 변환
``` js
function solution(list) {
  let answer = "";
  for (let word of list) {
    if (word >= "a") {
      answer += word.toUpperCase();
    } else {
      answer += word.toLowerCase();
    }
  }

  return answer;
}

console.log(solution("StuDY"));
```
<br>

### 14. 가장 긴 문자열
``` js
function solution(arrs) {
  let answer = arrs[0];
  for (let i = 1; i < arrs.length; i++) {
    if (answer.length < arrs[i].length) answer = arrs[i];
  }

  return answer;
}

let inputs = ["teacher", "time", "student", "beautiful", "good"];
console.log(solution(inputs));
```
<br>

### 15. 가운데 문자 출력
``` js
function solution(words) {
  let answer;
  let size = words.length - 1;
  if (size % 2 !== 0) {
    answer = words.substring(size / 2, size / 2 + 2);
  } else {
    answer = words[size / 2];
  }

  return answer;
}

console.log(solution("study"));
```
<br>

### 16. 중복문자 제거
``` js

```
<br>

### 17. 중복단어 제거
``` js
```

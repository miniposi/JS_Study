const readline = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
let N;

readline.on("line", function (line) {
  input.push(line.trim());
}).on("close", function () {
  N = input.shift();
  solution();
});

function solution() {
  let stack = [];
  let output = [];

  for (let i = 0; i < N; i++) {
    input[i] = input[i].trim();

    switch (input[i]) {
      case 'pop':
        if (stack.length === 0) {
          output.push(-1);
        } else {
          output.push(stack.pop());
        }
        break;
      case 'size':
        output.push(stack.length);
        break;
      case 'empty':
        if (stack.length === 0) {
          output.push(1);
        } else {
          output.push(0);
        }
        break;
      case 'top':
        if (stack.length === 0) {
          output.push(-1);
        } else {
          output.push(stack[stack.length - 1]);
        }
        break;
      default:
        stack.push(input[i].split(' ')[1]);
    }
  }

  console.log(output.join('\n'));
}

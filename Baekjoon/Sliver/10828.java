import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = scanner.nextInt();
		scanner.nextLine();
		String[] inst = new String[N];
		for (int i = 0; i < N; i++)
			inst[i] = scanner.nextLine();
		
		Stack<Integer> stack = new Stack<Integer>();
		int num;
		for (int i = 0; i < N; i++) {
			if (inst[i].equals("top")) {
				if (stack.empty())
					sb.append(-1).append('\n');
				else
					sb.append(stack.peek()).append('\n');
			}
			else if (inst[i].equals("pop")) {
				if (stack.empty())
					sb.append(-1).append('\n');
				else
					sb.append(stack.pop()).append('\n');
			}
			else if (inst[i].equals("size"))
				sb.append(stack.size()).append('\n');
			else if (inst[i].equals("empty")) {
				if (stack.empty())
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
			}
			else {
				num = Integer.parseInt(inst[i].substring(5));
				stack.push(num);
			}
		}
		System.out.println(sb);
	}
}

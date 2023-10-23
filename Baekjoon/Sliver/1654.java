import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long answer = 0;
		
		int k = scanner.nextInt();
		long n = scanner.nextInt();
		int[] list = new int[k];
		int min = Integer.MAX_VALUE;
		long sum = 0;
		for (int i = 0; i < k; i++) {
			list[i] = scanner.nextInt();
			if (list[i] < min)
				min = list[i];
			sum += list[i];
		}
		
		long left = 0; // n개로 만들 수 있는 최소 길이
		long right = sum / n; // n개로 만들 수 있는 최대 길이
		long mid;
		long num;
		while (left <= right) {
			if (left + right < 2) {
				answer = 1;
				break;
			}
			mid = (left + right) / 2;
			num = 0;
			for (int i = 0; i < k; i++) {
				num += list[i] / mid;
			}
			if (num >= n) { // n개 이상 만들 수 있다면
				answer = mid;
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		
		System.out.println(answer);
	}
	
}

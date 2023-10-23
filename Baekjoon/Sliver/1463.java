import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] dp = new int[N+1]; // [0] index에 1이 들어
		
		dp[0] = 0;
		dp[1] = 0;
		int min;
		for (int i = 2; i < N+1; i++) {
			min = dp[i-1] + 1; // (i-1) + 1
			if (i % 3 == 0) {
				if (min > dp[i/3] + 1) // (i%3) * 3
					min = dp[i/3] + 1;
			}
			if (i % 2 == 0) {
				if (min > dp[i/2] + 1) // (i%2) * 2
					min = dp[i/2] + 1;
			}
			dp[i] = min;
		}
		System.out.println(dp[N]);
	}
}

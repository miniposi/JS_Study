import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer;
		
		int N = scanner.nextInt();
		int[] wine = new int[N];
		for (int i = 0; i < N; i++) {
			wine[i] = scanner.nextInt();
		}
		
		if (N == 1) {
			answer = wine[0];
			System.out.println(answer);
			return;
		}
		
		int[][] dp = new int[N][3];
		dp[0] = new int[3];
		dp[0][0] = wine[0];
		dp[0][1] = wine[0];
		dp[0][2] = 0;
			
		
		dp[1] = new int[3];
		dp[1][0] = wine[0] + wine[1];
		dp[1][1] = wine[1];
		dp[1][2] = wine[0];
		for (int i = 2; i < N; i++) {
			dp[i] = new int[3];
			dp[i][0] = dp[i-1][1] + wine[i];
			dp[i][1] = dp[i-1][2] + wine[i];
			dp[i][2] = Math.max(Math.max(dp[i-1][0], dp[i-1][1]), dp[i-1][2]);
		}
		
		answer = Math.max(Math.max(dp[N-1][0], dp[N-1][1]), dp[N-1][2]);
		System.out.println(answer);
	}
}

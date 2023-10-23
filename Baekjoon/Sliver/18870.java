import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		HashMap<Integer, Integer> answer = new HashMap<>();
		int[] arrX = new int[N];
		Set<Integer> sorted = new HashSet<>();
		for (int i = 0; i < N; i++) {
			arrX[i] = scanner.nextInt();
			sorted.add(arrX[i]);
		}
		ArrayList<Integer> list = new ArrayList<>(sorted);
		Collections.sort(list);
		
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			answer.put(list.get(i), i);
		}
		for (int i = 0; i < N; i++) {
			sb.append(answer.get(arrX[i])).append(" ");
		}
		
		System.out.println(sb);
	}
}

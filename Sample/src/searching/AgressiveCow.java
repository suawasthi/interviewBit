package searching;

import java.util.Arrays;

public class AgressiveCow {

	public static void main(String[] args) {
		int c[] = { 1, 2, 3, 4, 5 };
		int d[] = { 82, 61, 38, 88, 12, 7, 6, 12, 48, 8, 31, 90, 35, 5, 88, 2, 66, 19, 5, 96, 84, 95 };
		System.out.println(solve(d, 8));

	}

	static int no_of_cows;

	public static int solve(int[] A, int B) {
		no_of_cows = B;
		Arrays.sort(A);
		int low = Integer.MAX_VALUE;
		for (int i = 1; i < A.length; i++) {
			int sub = A[i] - A[i - 1];
			if (low > sub) {
				low = sub;
			}
		}

		int high = Arrays.stream(A).max().getAsInt() - Arrays.stream(A).min().getAsInt();
		int lastmid = high;
		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (isPossible(A, mid)) {
				low = mid + 1;
				lastmid = mid;
			} else {
				high = mid - 1;
			}
		}
		return lastmid;
	}

	private static boolean isPossible(int[] C, int mid) {

		int count = 1;
		Arrays.sort(C);
		int sum = C[0] + mid;
		for (int i = 1; i < C.length; i++) {
			if (sum <= C[i]) {
				count++;
				sum = C[i] + mid;

			}
			/*
			 * if (sum == 0 && i !=C.length-1) { count++; sum = mid;
			 * 
			 * 
			 * }
			 */
		}

		if (count >= no_of_cows) {
			return true;
		} else {
			return false;
		}

	}
}

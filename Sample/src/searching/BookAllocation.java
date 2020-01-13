package searching;

import java.util.Arrays;

public class BookAllocation {
	public static void main(String[] args) {
		int[] A = { 31, 14, 19, 75 };
		int B = 12;
		System.out.println(books(A, B));
	}

	static int no_of_books;

	public static int books(int[] A, int B) {
		if (A.length < B) 
            return -1;
		
		
		no_of_books = B;
		int low = 0;
		int high = Arrays.stream(A).sum();
		int lastMid = 0;
		int result = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (isPossible(A, mid)) {
				high = mid - 1;
				result = Math.min(result, mid);
			} else {
				low = mid + 1;
			}

		}
		return result == Integer.MAX_VALUE ? -1 : result;
	}

	private static boolean isPossible(int[] C, int mid) {

		int count = 1;
		int sum = 0;
		for (int i = 0; i < C.length; i++) {

			if (C[i] > mid) {
				return false;
			}
			if (sum + C[i] > mid) {
				count++;
				sum = mid;
				sum = C[i];

			} else {
				sum = sum + C[i];
			}

			if (count > no_of_books) {
				return false;
			} 	

		}
		return true;

	}

}

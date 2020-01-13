package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * iven three sorted arrays A, B and Cof not necessarily same sizes. 
 * Calculate the minimum absolute difference between the maximum and minimum number 
 * from the triplet a, b, c such that a, b, c belongs arrays A, B, C respectively. 
 * i.e. minimize | max(a,b,c) - min(a,b,c) |.
 */
public class AbsoluteDifference {

	public static void main(String[] args) {

		Integer[] A = { 1, 4, 5, 8, 10 };
		Integer[] B = { 6, 9, 10};
		Integer[] C = { 2, 3, 6, 10 };
		solve(Arrays.asList(A), Arrays.asList(B), Arrays.asList(C));
	}

	public static int solve(List<Integer> A, List<Integer> B, List<Integer> C) {

		int localMax = Integer.MAX_VALUE;
		int size = min(A.size(), B.size(), C.size());
		int a = 0, b = 0, c = 0;
		while (size != 0 && a < A.size() && b < B.size() && c < C.size()) {
			int max = max(A.get(a), B.get(b), C.get(c));
			int min = min(A.get(a), B.get(b), C.get(c));

			int diffrence = Math.abs(max - min);
			if (diffrence == 0) {
				return 0;
			}
			localMax = Math.min(localMax, diffrence);
			if (A.get(a) <= B.get(b) && A.get(a) <= C.get(c) && a + 1 <= A.size()) {
				a++;
			} else if (B.get(b) <= A.get(a) && B.get(b) <= C.get(c) && b + 1 <= B.size()) {
				b++;
			} else if (C.get(c) <= B.get(b) && C.get(c) <= A.get(a) && c + 1 <= C.size()) {
				c++;
			}

		}
		System.out.println(localMax);
		return localMax;
	}

	private static int min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	private static int max(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}
}

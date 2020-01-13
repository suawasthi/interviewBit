package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumDifference {

	public static void main(String[] args) {

		Integer[] A = { 70, 21, 7, 64, 44, 79, 50, 89, 68, 23, 20, 50, 65, 64, 48, 3, 46, 87 };
		Integer[] C= {1, 2, 3, 4, 5};
		Integer[] B= {5, 17, 100, 11};
		System.out.println(solve(Arrays.asList(C), 2));
	}

	public static int solve(List<Integer> A, int B) {

		Collections.sort(A);
		int sum1 = 0;
		int sum2 = 0;
		int end1 = 0;
		int endj = 0;
		int i = 0;
		int j = 0;
		if (B > A.size() / 2) {
			i = 0;
			end1 = A.size()-B;
			j = A.size()-B;
			endj = A.size()-1;
		} else {
			i = 0;
			end1 = B;
			j = B;
			endj = A.size() - 1;

		}
		for (; i < end1; i++) {
			sum1 += A.get(i);
		}
		for (; j <= endj; j++) {
			sum2 += A.get(j);
		}

		return Math.abs(sum2 - sum1);

	}

}

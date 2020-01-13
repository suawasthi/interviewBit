package Greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Candy {

	public static void main(String[] args) {
		Integer[] A = { 3, 1, 2, 2  };
		Integer[] A1 = new Integer[A.length];
		Arrays.fill(A1, 1);

		for (int i = 1; i < A.length; i++) {// Scan from left to right, to make sure right higher rated child gets 1
											// more candy than left lower rated child
			if (A[i] > A[i - 1]) {
				A1[i] = (A1[i - 1] + 1);
			}
		}
		
		 for (int i = A.length - 2; i >= 0; i--) {// Scan from right to left, to make sure left higher rated child gets 1 more candy than right lower rated child
			    if (A[i] > A[i + 1]) { A1[i] = Math.max(A1[i], (A1[i + 1] + 1));}
		    }

		System.out.println(Arrays.toString(A1));

	}
}

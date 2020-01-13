package TwoPointers;

import java.util.Arrays;

/*
 * 
 * Given two sorted arrays of distinct integers, A and B, and an integer C, 
 * find and return the pair whose sum is closest to C and the pair has one element 
 * from each array. More formally, find A[i] and B[j] such that abs((A[i] + B[j]) - C)
 *  has minimum value. If there are multiple solutions find the one with minimum i and 
 *  even if there are multiple values of j for the same i then return the one with minimum j.
 *   Note: Return an array with two elements {A[i], B[j]}. 
	Input Format
 */
public class closestpairMininmSum {

	public static void main(String[] args) {
		int[] K = { 6, 7, 9, 13, 21, 29, 56, 74, 77, 83, 84, 88, 93, 96, 101, 104, 114, 115, 122, 125, 144, 147, 151,
				152, 154, 161, 165, 167, 174, 179, 185, 189, 192, 194, 198, 201, 203, 208, 224, 229, 230, 238, 252, 253,
				257, 264, 266, 275, 278, 279, 282, 284, 291, 312, 316, 322, 332, 335, 336, 339, 364, 380, 381, 384, 387,
				388, 390, 392, 394, 395, 401, 403, 431, 432, 440, 442, 443, 444, 446, 451, 454, 461, 470, 483, 492 };
		int[] L = { 2, 8, 13, 16, 19, 21, 22, 23, 37, 48, 63, 66, 68, 71, 72, 95, 102, 116, 123, 127, 131, 132, 146,
				148, 153, 171, 173, 179, 187, 194, 215, 220, 227, 229, 240, 245, 254, 255, 257, 259, 271, 276, 277, 286,
				296, 312, 314, 318, 321, 333, 339, 341, 343, 355, 356, 359, 363, 364, 380, 390, 393, 398, 401, 409, 413,
				417, 427, 442, 444, 446, 454, 455, 459, 460, 468, 471, 473, 475, 476, 478, 479, 482, 483, 488, 489 };
		int C = 13;

		//int[] A = { 5, 10, 20 };
		//int[] B = { 1, 2, 30 };

		 int[] A = { 1, 3, 5, 7, 9 };
		 int[] B = { 2, 4, 6, 8, 10 };
		System.out.println(Arrays.toString(solve(A, B, C)));
	}

	public static int[] solve(int[] A, int[] B, int C) {
		int[] result = new int[2];
		int a = 0, b = 0;
		int minI = A.length, minJ = B.length, mini = Integer.MAX_VALUE, minj = Integer.MAX_VALUE;

		a = 0;
		b = B.length - 1;

		int localMin = Integer.MAX_VALUE;
		while (a < A.length && b >= 0) {

			int sum = A[a] + B[b];

			int sub = Math.abs(sum - C);
			if (sub < localMin) {
				mini = Math.min(mini, a);
				minj = Math.min(minj, b);

				localMin = sub;
				result[0] = A[a];
				result[1] = B[minj];
			} else if (sub == localMin) {
				mini = Math.min(mini, a);
				if (a == mini) {
					minj = Math.min(minj, b);

					localMin = sub;
					result[0] = A[mini];
					result[1] = B[minj];
				} else if (a < mini) {
					minj = Math.min(minj, b);

					localMin = sub;
					result[0] = A[a];
					result[1] = B[minj];

				}
			}
			if (sum - C == 0)

			{
				result[0] = A[a];
				result[1] = B[b];
				return result;
			}

			if (sum > C) {
				b--;
			}

			if (sum < C) {
				a++;
			}
		}

		return result;
	}

	private static int[] swap(int[] result) {
		int[] resul = new int[2];
		resul[0] = result[1];
		resul[1] = result[0];

		return resul;
	}

}

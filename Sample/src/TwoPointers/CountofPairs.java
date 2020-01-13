package TwoPointers;

/*
 * Given a sorted array of distinct integers A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B. 
   Input Format The first argument given is the integer array A.
   The second argument given is integer B.
 */
public class CountofPairs {

	public static void main(String[] args) {
		int A[] = { 17, 36, 48, 51, 59, 76, 87, 89, 97, 99, 107, 129, 165, 174, 186, 194, 211, 215, 222, 223, 225, 230, 249, 266, 292, 311, 337, 347, 349, 351, 376, 384, 386, 396, 412, 425, 454, 457, 483, 484, 496};
		System.out.println((solve(A, 446)));

	}

	public static int solve(int[] A, int B) {
		int count = 0;
		int i = 0, j = A.length - 1;

		while (i < j) {
			int sum = A[i] + A[j];
			if (sum == B) {
				count++;
				i++;
			} else if (sum > B) {
				j--;
			} else if (sum < B) {
				i++;
			}

		}

		return count;

	}

}

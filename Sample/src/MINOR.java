
public class MINOR {

	public static void main(String[] args) {
		int[] A = { 0, 2, 5, 7 };

		java.util.Arrays.sort(A);
		int maxSum = Integer.MAX_VALUE;
		for (int i = 0; i < A.length-1; i++) {
			int sum = A[i ] ^ A[i+1];
			if (sum < maxSum) {
				maxSum = sum;
			}

		}
		System.out.println(maxSum);
	}
}

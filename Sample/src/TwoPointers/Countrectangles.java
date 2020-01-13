package TwoPointers;

public class Countrectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 2, 3, 5 };
		int B = 15;
		System.out.println(solve(A, B));

	}

	public static int solve1(int[] A, int B) {
		long ans = 0L;

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A.length; j++) {
				if (A[i] * A[j] < B) {
					ans += 1;
				}
			}

		}
		return (int) ans % 1000000007;

	}

	public static int solve(int[] A, int B) {
		long ans = 0L;
		int i = 0;
		int j = A.length - 1;
		while (i <= j) {

			if (A[i] * A[j] < B) {
	            ans = ((ans % 1000000007) + ((2 * (j - i + 1) - 1) % 1000000007)) % 1000000007;

				i++;
			} else {
				j--;
			}
			

		}

		return (int) ans % 1000000007;

	}

}

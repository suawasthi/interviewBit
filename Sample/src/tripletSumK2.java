import java.util.Arrays;

public class tripletSumK2 {

	public static void main(String[] args) {

		int A[] = { 5, 9, 36, 74, 52, 31, 42 };
		int B[] = { 9, 4, 1, 5, 7 };
		System.out.println(solve(B, 5));
	}

	public static int solve(int[] A, int B) {
		int mod = 1000000007;
		long[] bucket = new long[B];
		for (int i = 0; i < A.length; i++) {
			++bucket[A[i] % B];
		}

		int r2 = 0;

		long sum = 0;

		for (int i = 0; i < B; i++) {

			for (int j = i; j < B; j++) {
				int r1 = i + j % B;
				if (r1 == 0) {
					r2 = 0;
				} else
					r2 = (B - (i + j) % B) % B;

				if (r2 < j) {
					continue;
				}
					
				if (i == j && j == r2) {

					sum += bucket[j] * (bucket[j] - 1) * (bucket[j] - 2) / 6;

				} else if (i == j) {
					sum += bucket[j] * (bucket[i] - 1) * bucket[r2] / 2;
				} else if (i == r2) {
					sum += bucket[i] * (bucket[i] - 1) * bucket[j] / 2;
				} else if (j == r2) {
					sum += bucket[j] * (bucket[j] - 1) * bucket[i] / 2;
				} else {
					sum += ((bucket[i] * bucket[j]) * bucket[r2]);
				}
			}

		}

		int result = (int) sum;

		return result;

	}

}

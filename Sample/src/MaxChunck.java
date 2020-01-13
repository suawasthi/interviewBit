
public class MaxChunck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int solve(int[] A) {

		int max = Integer.MIN_VALUE;
		int count=0;
		for (int i = 0; i < A.length; i++) {

			max = Math.max(max, A[i]);
			if (max == i) {
				count++;
			}
		}
		return count;

	}

}

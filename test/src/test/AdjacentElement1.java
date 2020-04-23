package test;

public class AdjacentElement {

	public static void main(String[] args) {

		int[][] input = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 } };

		dp = new int[2][input[0].length];
		for (int i = 0; i < input[0].length; i++) {
			input[0][i] = -1;
			input[1][i] = -1;
		}
		perform(input, 0, 0);

	}

	static int[][] dp;

	private static void perform(int[][] input, int current, int currentSum) {

		for (int i = current; i < input[0].length; i++) {
			
		}

	}

	static int ans = Integer.MIN_VALUE;

}
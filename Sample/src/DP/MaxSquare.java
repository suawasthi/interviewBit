package DP;

public class MaxSquare {

	public static void main(String[] args) {

		int input = 10;
		System.out.println(performMax(input));
		// System.out.println(ans);

	}

	static int ans = 0;

	public static int performMax(int input) {
		if (input <= 3)
			return input;

		int[] dp = new int[input+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;

		for (int i = 4; i <= input; i++) {

			dp[i]=i;
			for (int x = 1; x <= Math.ceil(Math.sqrt(i)); x++) {
				int temp = x * x;
				// System.out.println(temp);
				if (temp > i) {
					break;
				} else {
					dp[i] = Math.min(dp[i], 1 + dp[i-temp]);
				}
			}
		}
		return dp[input];

	}

}

package DP;

public class TillingProblem {

	public static void main(String[] args) {
		
		int A=8;
		
		int[] dp = new int[A+1];
		
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		
		for (int i = 3; i < dp.length; i++) {
			
			dp[i]=dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[A]);
		
	}
}

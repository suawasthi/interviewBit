package test;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SubSetSum {
	public static void main(String[] args) {
		int[] input = {1, 6, 5, 7, 1, 2, 8, 0, 5, 5};
		int sum = Arrays.stream(input).sum();
		boolean[][] dp = new boolean[input.length ][sum+1];
		for (int i = 0; i < input.length; i++) {
			dp[i][0]=true;
		}
		dp[0][input[0]]=true;
		
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				//System.out.print(dp[i][j]);
			}
			//System.out.println();
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(dp[i-1][j]) {
					dp[i][j]=true;
					continue;
				}
				
				if(j < input[i]) {
					continue;
				}
				
				dp[i][j]=  dp[i-1][j-input[i]];
				
				
			}
		
		}
		int sum1=Arrays.stream(input).sum(); 
		long max =Long.MIN_VALUE; 
		for (int l = 1; l < dp[0].length; l++) {
			if(dp[dp.length-1][l]) {
				max= Math.max(max,   l * (sum1-l));
				}
		}	
		
		
		System.out.println(max);
		
	}

}

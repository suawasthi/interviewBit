package test;

import java.util.Arrays;

public class Sequence {
	public static void main(String[] args) {
		int input[] = {3,6,8,11,14};
		goddSubArray(input, 3, 0);
		// 2 1 3 2 1
	}
	public static int[] goddSubArray(int[] arr, int K , int n) {
		
		
		boolean dp[] = new boolean[arr.length];
		System.
		dp[0]=true;
		
		for (int i = 1; i < dp.length; i++) {
			if(arr[i-1] + K ==arr[i]) {
				dp[i]=true;
			}
		}
		int max=arr.length;
		for (int i = arr.length-1; i >=0; i--) {
			if(dp[i]) {
				arr[i]= max;
			}else {
				max=i;
				arr[i]=max;
			}
		}
		int[] ans = new int[arr.length];
		ans[ans.length-1]=1;
		for (int i = 0; i < arr.length-1; i++) {
			ans[i]= arr[i+1]-i; 
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ans));
		return null;
	}

}

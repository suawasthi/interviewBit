package test;

import java.util.Arrays;

public class Logest {

	public static void main(String[] args) {
		int[] nums = {4,10,4,3,8,9};
		// TODO Auto-generated method stub
		System.out.println(lengthOfLIS1(nums));
	
	}
	  public static int lengthOfLIS1(int[] nums) {
	        if(nums.length==0) return 1;
	        return lengthOfLIS(nums);        
	    }
	  public static int lengthOfLIS(int[] nums) {
			int[] dp = new int[nums.length];
			Arrays.fill(dp, 1);
	    	for (int i = 1; i < nums.length; i++) {
				for (int j = 0; j < i; j++) {
					if(nums[i] > nums[j]) {
						dp[i]= Math.max(dp[i], (dp[j]+1));
					}
				}
			}
	    	int max=0;
	    	for (int i = 0; i < dp.length; i++) {
				max= Math.max(max, dp[i]);
			}
	    	
	    	return max;
	      
	    
  }
	  


}




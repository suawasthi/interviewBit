package test;

public class interlevaingString {
	
	static String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,4,3,6,7};
		lengthOfLIS(nums);
	}
	 public static int lengthOfLIS(int[] nums) {
	        return lengthofLIS(nums, Integer.MIN_VALUE, 0);
	    }

	    public static  int lengthofLIS(int[] nums, int prev, int curpos) {
	        if (curpos == nums.length) {
	            return 0;
	        }
	        int taken = 0;
	        System.out.println("PRevios" + prev + "  current: " + nums[curpos]);
	        if (nums[curpos] > prev) {
	            taken = 1 + lengthofLIS(nums, nums[curpos], curpos + 1);
	        }
	        int nottaken = lengthofLIS(nums, prev, curpos + 1);
	        return Math.max(taken, nottaken);
	    }
	
	
}

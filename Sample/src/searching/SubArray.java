package searching;

public class SubArray {

	public static void main(String[] args) {

		int in[] = {10,2,3};
		int s=21;
		System.out.println(minSubArrayLen(s, in));
		
	}
	 public static int minSubArrayLen(int s, int[] nums) {
	        
	        if(nums.length==0) return 0;
	        for(int i=1;i<nums.length;i++) nums[i]+= nums[i-1];
	        
	        // two pointer approach 
	        int start=0;
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<nums.length;i++){
	            
	            for(int j=start;j<=i;j++){
	                if(nums[i] - nums[j] >=s ){
	                    
	                    int range = i-j ;
	                    if (range < min){
	                        min =range;
	                    }
	                    System.out.println(min);
	                }else if(nums[i] >=s) {
	                	int range = i+1 ;
	                    if (range < min){
	                        min =range;
	                    }
	                } 
	            }
	            
	        
	        
	        }
	        
	        return min ==Integer.MAX_VALUE ? 0 : min;
	        
	        
	    }

}

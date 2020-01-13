package searching;

public class RotatedArray {

	public static void main(String[] args) {
		int nums[]= {4,5,6,7,0,1,2};
		int l =-2147483648;
		long l1= -1;
		
		long n=  l *-1;
		if(nums.length==0) return ;
        int low=0;
        int high=nums.length-1;
        for (int i = 0; i < nums.length; i++) {
			
        System.out.println(Integer.MAX_VALUE);	
        	
        	System.out.println(performBinarySearch(nums,nums[i] , low, high));
		}
        

	}
	public static int performBinarySearch(int[] a, int target, int lows, int high){
        //System.out.println("inside array with " + lows +"Highs"+ high);
        while(lows<=high){
            // 5 6 0 1 2 
            int mid= lows + (high-lows)/2;
            //System.out.println(mid);
            if(a[mid]==target) return mid;
            if(a[high]==target) return high;
            if(a[lows]==target) return lows;
            
            if(a[mid] < a[high] && target >= a[mid] && target <= a[high]) {
            	//search in left
            	lows=mid+1;
            }
            else if(a[mid] > a[high] && target < a[mid]  &&  target > a[high]) {
            	high=mid-1;
            }
            else if(a[mid] < a[high]   ) {
            	return performBinarySearch(a, target, lows, mid-1);
            }
            else {
            	return performBinarySearch(a, target, mid+1, high);
            }
            
            
        }
        
        return -1;
        
        
    }

}

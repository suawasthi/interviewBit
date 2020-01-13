package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sums {

	public static void main(String[] args) {
		int[] A= {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(A, 9)));
	}
	 public static  int[] twoSum(final int[] A, int B) {
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for(int i =0;i<A.length;i++) { 
	        	if(map.get(A[i])!=null) {
	        		continue;
	        	}
	        		map.put(A[i], i);
	        	
	        }
	        
	       for(int i=0;i<A.length;i++){
	           int toBe = B-A[i];
	           if(map.get(toBe)!=null &&  map.get(toBe)!=i){
	               return new int[]{i, map.get(toBe)};
	           }
	       }
	    // -3
	        return new int[]{-1, -1};
	    }

}

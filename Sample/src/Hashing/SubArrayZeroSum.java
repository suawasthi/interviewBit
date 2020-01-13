package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Find if there is a sub-array with 0 sum
   Given an array of integers A, find and return whether the given array
   contains a subarray with a sum equal to 0. If the given array contains a 
   sub-array with sum zero return 1 else return 0. Note: Length of sub array 
   should be at least one. 
    Input Format
 */
public class SubArrayZeroSum {

	public static void main(String[] args) {
		Integer[] i = { 96, -71, 18, 66, -39, -32, -16, -83, -11, -92, 55, 66, 93, 5, 50, -45, 66, -28, 69, -4, -34, -87, -32, 7, -53, 33, -12, -94, -80, -71, 48, -93, 62};
		System.out.println(solve(Arrays.asList(i)));
	}
		public static int solve(java.util.List<Integer> A) {
			
			int sum=0;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < A.size(); i++) {
				
				sum  = (sum % 1000000007 + A.get(i) % 1000000007) % 1000000007;
				
				if(sum==0 || A.get(i)==0 || map.get((int)sum)!=null) {
					return 1;
				}
				map.put( (int)sum, i);
			}
			
		
			
			return 0;
	    }
	
}

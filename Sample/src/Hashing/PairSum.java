package Hashing;

/*
 * 
 * Find pairs in array whose sum is already present
Given an array A of N distinct and positive elements, the task is to 
find number of unordered pairs whose sum 
already exists in given array. Expected Complexity : n^2 CONSTRAINTS
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PairSum {

	public static void main(String[] args) {
		Integer[] a = { 3, 4, 2, 6 ,7};
		System.out.println(solve(Arrays.asList(a)));
		
	}
	public static int solve(java.util.List<Integer> A) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < A.size(); i++) {
			map.put(A.get(i), i);
		}
		int count=0;
		for (int i = 0; i < A.size(); i++) {
			for (int j = i; j < A.size(); j++) {
				
				int sum =A.get(i) + A.get(j);
				if(A.get(i) != A.get(j) &&map.get(sum)!=null) {
					count++;
				}
				
			}
			
		}
		
		
		
		return count;
		
		
		
		
    }

}

package DP;

import java.util.ArrayList;

public class RectangleSum {

	public static void main(String[] args) {
	
		
		

	}
	
	 public static int solve(int[][] A) {
	 
		 for (int i = 1; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				
				A[i][j] += A[i][j-1];
			}
		}
		 
		 ArrayList<Integer> arraY = new ArrayList<Integer>();
		 int max=Integer.MIN_VALUE;
		 for(int start =0; start < A.length;start++) {
			 
			 for(int end=start;end <A.length;end++ ) {
				 arraY.add(A[start][end] -A[start][start-1]);
			 }
			 
			 max=Math.max(max, performkandane(arraY));
		 }
		  return max;
	 }
	 
	 
	 public static int performkandane(ArrayList<Integer> a) {
		 
		 if(a.size() < 1) {
			 return -1;
		 }
		 int max=Integer.MIN_VALUE;
		 int sum=0;
		 for (int i = 0; i < a.size(); i++) {
			 sum += a.get(i);
			 if(sum > max) {
				 max=sum;
			 }
			 
			 if(sum < 0) {
				 sum=0;
			 }
			
		}
		 
		return  a.size() ==1 ? a.get(0) :  max; 
		 
	 }
	 

}

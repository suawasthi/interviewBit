package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubSequene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] A= {1 ,3 ,5 ,6 ,4 ,8 ,4 ,3 ,2 ,1};
	//	System.out.println(lengthOfLIS(A));
		int[] ans = new int[A.length];
		Arrays.fill(ans, 1);
		
		for (int i = 0; i < ans.length; i++) {
			
			for (int j = 0; j <= i; j++) {
				if(A[j] < A[i]) {
					ans[i]=Math.max(ans[i], ans[j]+1);
				}
			}
		}
		
		int[] ansD= new int[A.length];
		Arrays.fill(ansD, 1);
		
		for (int i = ansD.length-2; i >=0 ;i--) {
			
			for (int j = ansD.length-1; j > i; j--) {
				if(A[j] < A[i]) {
					ansD[i]=Math.max(ansD[i], ansD[j]+1);
				}
			}
		}
		
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(ansD));
		int max=ans[0] + ansD[0] -1;
		for (int i = 1; i < A.length; i++) {
			max = Math.max(max,  ans[i] + ansD[i] -1);
		}
		
		
		System.out.println(max);
		

	}
	//3, 0, -1, 0, 6, 2,3
	

}

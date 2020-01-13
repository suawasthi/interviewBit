package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MaxProduct {

	public static void main(String[] args) {
		int[] A = {1, -2, 2, 3};
		System.out.println(maximumSum(A));
		
	}

	public static int maximumSum(int[] arr) {
	
		int maxSum = Integer.MIN_VALUE;
		int ans=0;
			int localSum = 0;
			for (int i = 0; i < arr.length; i++) {
				
				
				
				
				
				localSum = localSum + arr[i];
				if (localSum > maxSum) {
					maxSum = localSum;
				}

				if (localSum < 0) {
					localSum = 0;
				}

			}
		return maxSum;

	}

}

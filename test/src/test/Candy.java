package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Candy {

	public static void main(String[] args) {
		int[] input = {-255, 369, 319, 77, 128, -202, -147, 282, -26, -489, -443 };
		//int[] input = {1, 5, 2,1};
		System.out.println(candy(input));
	}
	public static  int candy(int[] A) {
		
		int candies[] =  new int[A.length];
		candies[0]=1;
		for (int i = 1; i < A.length; i++) {
			if(A[i-1] < A[i]) {
				candies[i]= candies[i-1]+1;
			}else {
				candies[i]=1;
			}
		}
		
		for (int i = candies.length-2; i >=0; i--) {
			if(A[i] > A[i+1]) {
				candies[i] = candies[i+1] +1;
			}
		}
		
		return Arrays.stream(candies).sum();
		
	}

}

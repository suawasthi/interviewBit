package sorting.benchmark.algos;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		int[] input = {39,4,2,64,2,12,-4};
		System.out.println(Arrays.toString(bubbleSort(input)));
	}
	/*
	 * optimization can be done by checking if the array is already sorted then we 
	 * can break the loop
	 * Stable - In place sort with O(n2) running time w.r.t input size n;
	 */
	public static int[] bubbleSort(int[] input) {
		
		for (int i = 0; i < input.length-1; i++) {
			for (int j = 1; j < input.length-i; j++) {
				if(input[j-1] > input[j]) {
					int temp = input[j];
					input[j]= input[j-1];
					input[j-1]=temp;
				}
			}
		}
		
		
		return input;
	}

}

package sorting.benchmark.algos;

import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		int[] input = {39,4,2,64,2,12,-4};
		System.out.println(Arrays.toString(selectionSort(input)));
	}
	/*
	 * selection sort can be in-place and stable
	 * with time complexity of O(n2) w.r.t input of size n
	 * The number of swaps can not exceed more then o(n)
	 * 
	 */
	public static int[] selectionSort(int[] input) {
		
		for (int i = 0; i < input.length-1; i++) {
			int min= input[i];
			int minindex=i;
			for (int j = i+1; j < input.length; j++) {
				if(input[j] < min) {
					min= input[j];
					minindex=j;
				}	
			}
			int temp=input[i];
			input[i]=input[minindex];
			input[minindex]= temp;
		}
		
		return input;
	}

}

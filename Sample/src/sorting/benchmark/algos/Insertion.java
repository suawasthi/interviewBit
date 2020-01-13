package sorting.benchmark.algos;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {

		int[] input = {39,4,2,-64,2,12,-4};
		System.out.println(Arrays.toString(insertionSort(input)));
	}
	
	public static int[] insertionSort(int[] input) {
		
		for (int i = 1; i < input.length; i++) {
			int pivot = input[i];
			int hole = i;
			while(hole > 0 && input[hole-1] > pivot) {
				input[hole] =input[hole-1];
				hole =hole-1;
			}
		input[hole] =pivot;
		}
		
		
		return input;
	}

}

package sorting.benchmark.algos;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] input = {7,2,1,6,8,5,3,4};
		qucikSort(input, 0, input.length-1);
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
			
		}
	
	}
	
	public static void qucikSort(int[] input , int start , int end) {
		
		if(start < end) {
		int partindex = partitionInput(input, start, end);
		qucikSort(input, start, partindex-1);
		qucikSort(input, partindex+1, end);	
		}
		
	}

	private static int partitionInput(int[] input, int start, int end) {
		
		int pivot = input[end];
		int partitionIndex=start;
		for (int i = start; i < end; i++) {
			if(input[i] <= pivot)
			{	int temp=input[partitionIndex];
				input[partitionIndex] = input[i];
				input[i]=temp;
				partitionIndex++;
				
			}
		}
		int temp=input[partitionIndex];
		input[partitionIndex]= pivot;
		input[end]=temp;
		return partitionIndex;
	}

}

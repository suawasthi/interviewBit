package sorting;

import java.util.Arrays;

public class InversionCount {

	public static void main(String[] args) {
		int[] input = {45, 10, 15, 25, 50 };
		System.out.println((inversionCount(input)));
	}
	public static int inversionCount(int[] input) {
		
		 int count=0;
		int len = input.length;
		if(len >=2) {
			int  mid= len/2;
			int[] left = new int[mid];
			int[] right = new int[input.length-mid]; 
			int i=0;
			for(;i<mid;i++) left[i] = input[i];
			for(int j=0;j<input.length-mid;j++) right[j] = input[i++];
			count +=inversionCount(left);
			count += inversionCount(right);
			count += mergeList(input, left, right);
			
			
		}
	return count;		
	}
	private static int mergeList(int[] input, int[] left, int[] right) {
	
		int leftCounter=0;
		int rightCounter=0;
		int counter=0;
		int swaps = 0;
		while(leftCounter < left.length && rightCounter < right.length) {
			
			if(left[leftCounter] <= right[rightCounter]) {
				input[counter++]=left[leftCounter++];
			}else  {
				input[counter++]=right[rightCounter++];
				swaps += (left.length ) -leftCounter;
				
			}
			
		}
		while(leftCounter < left.length) {
			input[counter++]=left[leftCounter++];
		}
		
		while(rightCounter < right.length) {
			input[counter++]=right[rightCounter++];
		}
		
		return swaps;
	}
}

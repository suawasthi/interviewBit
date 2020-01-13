package sorting.benchmark.algos;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] input = {39,4,2,64,2,12,-4 , 76, -87, 0, 0};
		System.out.println(Arrays.toString(mergerSort(input)));
	}

	public static int[] mergerSort(int[] input) {

		// break the list into 1 size array

		int length = input.length;
		if (length >= 2) {
			int mid = length / 2;
			int[] left = new int[mid];
			int[] right = new int[length -mid];
			for (int i = 0; i < mid; i++)
				left[i] = input[i];
			
			int midC=mid;
			for (int i = 0; i < length -mid; i++)
				right[i] = input[midC++];

			int[] leftMerged = mergerSort(left);
			int[] rightMerged = mergerSort(right);
			mergeList(input, leftMerged, rightMerged);
		}

		return input;
	}

	private static int[] mergeList(int[] input , int[] leftMerged, int[] rightMerged) {
		int[] result = new int[leftMerged.length + rightMerged.length];

		int leftCounter = 0;
		int rightCounter = 0;
		int counter = 0;

		while (leftCounter < leftMerged.length && rightCounter < rightMerged.length) {

			if (leftMerged[leftCounter] < rightMerged[rightCounter]) {
				input[counter++] = leftMerged[leftCounter++];
			} else {
				input[counter++] = rightMerged[rightCounter++];
			}
		}

		while (leftCounter < leftMerged.length) {
			input[counter++] = leftMerged[leftCounter++];
		}

		while (rightCounter < rightMerged.length) {
			input[counter++] = rightMerged[rightCounter++];
		}
		return input;
	}
}

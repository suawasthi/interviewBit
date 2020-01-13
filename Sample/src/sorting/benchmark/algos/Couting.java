package sorting.benchmark.algos;

import java.util.Arrays;

public class Couting {

	public static void main(String[] args) {
		int[] input = {4,6,5,5 ,9,1,3};
		System.out.println(Arrays.toString(countingSorting(input)));
	}
	
	public static int[] countingSorting1(int[] input) {
		
		// make freeQuency count
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			max= Math.max(max, input[i]);
		}
		
		int[] freCount = new int[max+1];
		int[] result = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			freCount[input[i]] ++;
		}
		
		for (int i = 1; i < freCount.length; i++) {
			freCount[i] += freCount[i-1];
		}
		
		for (int i = 0; i < input.length; i++) {
			result[freCount[input[i]]-1] = input[i];
			freCount[input[i]]--;
		}
		
		return result;
	}
public static int[] countingSorting(int[] input) {
		
		// make freeQuency count
		int max=10;
		int[] freCount = new int[max];
		int[] result = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			freCount[input[i]] ++;
		}
		
		for (int i = freCount.length-2; i >=0; i--) {
			freCount[i] += freCount[i+1];
		}
		
		for (int i = 0; i < input.length; i++) {
			result[input.length-freCount[input[i]]] = input[i];
			freCount[input[i]]--;
		}
		
		return result;
	}

}

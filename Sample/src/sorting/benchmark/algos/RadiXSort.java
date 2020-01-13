package sorting.benchmark.algos;

import java.util.Arrays;

public class RadiXSort {

	public static void main(String[] args) {
		int[] input = {14,36,45,55 ,9,551,3};
		System.out.println(Arrays.toString(radixSorting(input)));
	}

	public static int[] radixSorting(int[] input) {
		int[] res = new int[input.length];
		int max= Arrays.stream(input).max().getAsInt();
		int len= String.valueOf(max).length();
		int exp=1;
		for (int i = 1; i <= len; i++) {
			input = countingSorting(input, exp);
			exp=exp*10;
		}
		return input;
		
		
	}
	public static int[] countingSorting(int[] input, int exp) {
		int max=10;
		// make for negative number by adding highest negative number
		int[] freCount = new int[max];
		int[] result = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			freCount[(input[i]/exp)%10] ++;
		}
		
		for (int i = freCount.length-2; i >=0; i--) {
			freCount[i] += freCount[i+1];
		}
		
		for (int i = 0; i < input.length; i++) {
			result[input.length-freCount[(input[i] / exp)%10 ]] = input[i];
			freCount[(input[i] / exp)%10 ]--;
		}
		input=result;
		return input;
	}

}

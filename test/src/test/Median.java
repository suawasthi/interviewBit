package test;

import java.util.PriorityQueue;

public class Median {

	public static void main(String[] args) {

		int[] input = { 1, 3, 5, 7, 9 };
		int b = 5;
		int lastElement = input[input.length - 1];
		for (int i = input.length / 2; i < input.length - 1; i++) {
			if (b - (lastElement - input[i]) > 0) {
				int x = (Math.abs(lastElement - input[i]));
				b -= x;
				input[i] += x;
			}
		}

		System.out.println();
	}

}

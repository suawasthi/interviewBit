package searching;

import java.util.Arrays;

public class PainterPatition {

	public static void main(String[] args) {
		int A = 1;
		int B = 1000000;
		int C[] = { 1000000, 1000000};
		System.out.println(paint(A, B, C));
	}

	static int nosOfpainter;
	static int timeToPaint;

	public static int paint(int A, int B, int[] C) {

		if (C.length == 1) {
			return (C[0] * B) % 10000003;
		}

		int low = Arrays.stream(C).max().getAsInt();
		int high = Arrays.stream(C).sum();
		nosOfpainter = A;
		timeToPaint = B;
		long midp = 0;

		boolean b = false;
		while (low <= high) {

			int mid = low + (high - low) / 2;
			b = isPartition(C, mid);
			if (b) {
				midp = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return (int) (midp * B % 10000003);

	}

	public static boolean isPartition(int[] C, int n) {

		int count = 1;
	
		int sum = n;
		for (int i = 0; i < C.length; i++) {
			sum = sum - (C[i]);
			if (sum == 0 && i !=C.length-1) {
				count++;
				sum = n;
				
				
			}
			if (sum < 0) {
				count++;
				sum = n;
				sum = sum - C[i];
			}

		}

		if (count <= nosOfpainter) {
			return true;
		} else {
			return false;
		}

	}
}

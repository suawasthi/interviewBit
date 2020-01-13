package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountSmallerNumber {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		Integer [] A1= { 482, 152, 318, 360, 62, 157, 94, 62, 403, 239, 330, 429, 23, 283, 282, 454, 182};
		solve(Arrays.asList(A1));
		solve(A);
	}

	public static ArrayList<Integer> solve(java.util.List<Integer> A) {

		
		// 482, 152, 318, 360, 62, 157, 94, 62, 403, 239, 330, 429, 23, 283, 282, 454, 182
		ArrayList<Integer> ordered = new ArrayList<Integer>(A);
		ArrayList<Integer> result = new ArrayList<Integer>();

		Collections.sort(ordered);

		for (int i = 0; i < A.size(); i++) {
			Integer find = A.get(i);
			int index = binarySearch(ordered, find);
			result.add(index);
			ordered.remove(index);

		}
		System.out.println(result);
		return result;
	}

	public static int binarySearch(ArrayList<Integer> A, int key) {

		int low = 0;
		int high = A.size();
		int midNow=0;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (A.get(mid) == key) {
				midNow=mid;
				high = mid - 1;
				
			}
			else
			if (A.get(mid) > key) {
				high = mid - 1;
			}
			else
			if (A.get(mid) < key) {
				low = mid + 1;
			}

		}
		return midNow;

	}
}

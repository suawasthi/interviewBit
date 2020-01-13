package searching;

import java.util.ArrayList;
import java.util.List;

public class MedianTwoSortedArray {

	public static void main(String[] args) {
		List<Integer> b = new ArrayList<Integer>();
	
	
	
		
		List<Integer> a= new ArrayList<Integer>();
		b.add(-49);
		b.add(33);
		a.add(-26);
		b.add(35);
		b.add(42);
	


		System.out.println(findMedianSortedArrays(a, b));

	}

	public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

		if (a.size() > b.size()) {
			//return findMedianSortedArrays(b, a); // to ensure log(small array)
		}

		if (a.size() == 0) {
			if (b.size() % 2 == 0) {
				int n = b.size() / 2;
				return (double) (b.get(n) + b.get(n - 1)) / 2;
			} else {
				return (double) b.get(b.size() / 2);
			}
		}

		int low = 0;
		int high = a.size();

		int x = a.size();
		int y = b.size();

		boolean even = (x + y) % 2 == 0;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			int postitionx = mid;
			int positiony = (x + y + 1) / 2 - postitionx;

			int minLeftX = postitionx == 0 ? Integer.MIN_VALUE : a.get(postitionx - 1);
			int maxRightX = postitionx == x ? Integer.MAX_VALUE : a.get(postitionx);

			int minLeftY = positiony == 0 ? Integer.MIN_VALUE : b.get(positiony - 1);
			int maxRightY = positiony == y ? Integer.MAX_VALUE : b.get(positiony);

			if (minLeftX <= maxRightY && maxRightX >= minLeftY) {

				if (even) {
					return (double) ((double)(Math.min(maxRightX, maxRightY) + Math.max(minLeftX, minLeftY)) / 2);
				} else {
					return (double) Math.max(minLeftX, minLeftY);
				}

			}
			if (minLeftX >= maxRightY) {
				high = postitionx - 1;
			} else {
				low = postitionx + 1;
			}

		}

		return 0;
	}

}

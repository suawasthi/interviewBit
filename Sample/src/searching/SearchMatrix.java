package searching;

import java.util.ArrayList;

public class SearchMatrix {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		ArrayList<Integer> D = new ArrayList<Integer>();
		ArrayList<Integer> E = new ArrayList<Integer>();

		C.add(1);
		C.add(2);
		C.add(3);
		C.add(4);

		D.add(5);
		D.add(7);
		D.add(8);
		D.add(9);

		E.add(10);
		E.add(11);
		E.add(12);
		E.add(13);

		B.add(C);
		B.add(D);
		B.add(E);

		System.out.println(searchMatrix(B, 14));
	}

	public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {

		for (int i = 0; i < a.size(); i++) {
			Integer B = performBinarySearch(a.get(i), b);
			if (B == null) {
				continue;
			} else {
				return 1;
			}
		}

		return 0;
	}

	private static Integer performBinarySearch(ArrayList<Integer> arr, int b) {

		int low = 0, high = arr.size()-1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (b == arr.get(mid)) {
				return 1;
			}
			if (arr.get(mid) > b) {
				high = mid - 1;
			}
			if (arr.get(mid) < b) {
				low = mid + 1;
			}
			

		}
		return null;
	}
}

package hashing2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BinaryRectangle {

	public static void main(String[] args) {

		int A[][] = { { 1, 0, 0, 1, 0 }, { 0, 0, 1, 0, 1 }, { 0, 0, 0, 1, 0 }, { 1, 0, 1, 0, 1 } };

		System.out.println(solve(A));
	}

	public static int solve(final int[][] A) {

		if (existRactanle(A)) {
			return 1;
		} else {
			return 0;
		}

	}

	private static boolean existRactanle(int[][] a) {

		int row = a.length;
		if (row == 0) {
			return false;
		}
		int col = a[0].length;

		HashMap<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for (int k = j + 1; k < col; k++) {

					if (a[i][j] == 1 && a[i][k] == 1) {

						if (map.containsKey(j) && map.get(j).contains(k)) {
							return true;
						}
						if (map.containsKey(k) && map.get(k).contains(k)) {
							return true;
						}

						HashSet<Integer> set = new HashSet<Integer>();
						if (!map.containsKey(j)) {
							set.add(k);
							map.put(j, set);
						} else {
							map.get(j).add(k);
						}
						if (!map.containsKey(k)) {
							set.add(j);
							map.put(k, set);
						} else {
							map.get(k).add(j);
						}

					}

				}

			}
		}

		return false;
	}

}

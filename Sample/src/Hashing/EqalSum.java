package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class EqalSum {

	public static void main(String[] args) {

		Integer[] A = {  1, 1, 1, 1, 1  };
		System.out.println(equal(Arrays.asList(A)));
	}

	static class Point {

		int x;
		int y;

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		

	
		

	}

	public static ArrayList<Integer> equal(java.util.List<Integer> A) {
		HashMap<Integer, Point> map = new HashMap<Integer, Point>();

		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			for (int j = i+1; j < A.size(); j++) {
				int sum = A.get(i) + A.get(j);

				if (map.get(sum) != null) {
					Point p = map.get(sum);
					if (p.x < p.y && p.y != j && p.y != i && p.x < i) { //A1 < C1 .// A1 < B1, C1 < D1
						if (result.size() > 0) {
							compareandUpdate(result, p, i, j);
						} else {
							result.add(p.x);
							result.add(p.y);
							result.add(i);
							result.add(j);
						}
					}
				} else {

					map.put(sum, new Point(i, j));
				}
			}

		}

		return result;
	}

	private static ArrayList<Integer> compareandUpdate(ArrayList<Integer> result, Point p, int i, int j) {
		int A1 = result.get(0);
		int B1 = result.get(1);
		int C1 = result.get(2);
		int D1 = result.get(3);

		if (A1 < p.x) {
			return result;
		}
		if (A1 == p.x && B1 < p.y) {
			return result;
		}
		if (A1 == p.x && B1 == p.y && C1 < i) {
			return result;
		}
		if (A1 == p.x && B1 == p.y && C1 == i & D1 < j) {
			return result;
		} else {
			result.set(0, p.x);
			result.set(1, p.y);
			result.set(2, i);
			result.set(3, j);

		}
		return result;

	}

}

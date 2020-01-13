package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.prefs.BackingStoreException;

public class BBClosest {

	public static void main(String[] args) {
		int A[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
		int B[][]=  {{26, 41},
				  {40, 47},
				  {47, 7},
				  {50, 34},
				  {18, 28}};
		
		
		
		solve(B, 5);
	}

	static class point {

		int distance;
		int[] arr;

	}


	public static int[][] solve(int[][] A, int B) {

		point[] p = new point[A.length];

		for (int i = 0; i < A.length; i++) {
			p[i]= new point();
			p[i].distance = (int) Math.sqrt(Math.pow(A[i][0], 2) + Math.pow(A[i][1], 2));
			p[i].arr = new int[A[i].length];
			p[i].arr = A[i];

		}

		Arrays.sort(p, new Comparator<point>() {

			@Override
			public int compare(point o1, point o2) {
				if (o1.distance > o2.distance) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		
		int[][] res = new int[B][];
		for (int i = 0; i < B; i++) {
			res[i]= new int[p[i].arr.length];
			res[i]=p[i].arr;
		}
		
		return res;
	}

}

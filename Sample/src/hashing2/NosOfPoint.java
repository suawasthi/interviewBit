package hashing2;

import java.util.HashMap;

public class NosOfPoint {

	// GCD
	// Sign
	// Horizontal
	// slope
	// overlapping point
	// vertical point
	public static void main(String[] args) {
		int[] A = { -1, 0, 1, 2, 3, 3 };
		int[] B = { 1, 0, 1, 2, 3, 4 };

		System.out.println(solve(A, B));

	}

	static class Pair {
		int numerator;
		int denomenator;

		public Pair(int numerator, int denomenator) {
			super();
			this.numerator = numerator;
			this.denomenator = denomenator;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + denomenator;
			result = prime * result + numerator;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (denomenator != other.denomenator)
				return false;
			if (numerator != other.numerator)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Pair [numerator=" + numerator + ", denomenator=" + denomenator + "]";
		}

	}

	public static int solve(int[] A, int[] B) {
		int ans = 0;
		int totalPoint = A.length;
		int currentMax = 0;
		int max = 0;
		HashMap<Pair, Integer> map = new HashMap<NosOfPoint.Pair, Integer>();
		for (int i = 0; i < totalPoint; i++) {
			int olp = 0, vp = 0;
			int x1 = A[i];
			int y1 = B[i];
			// base point i

			for (int j = 0; j < B.length; j++) {
				if (i != j) {
					int x2 = A[j], y2 = B[j];
					if (checkForOLP(x1, y1, x2, y2)) {
						olp++;
					} else if (checkforVP(x1, y1, x2, y2)) {
						vp++;
					} else {
						int[] slope = computeSlope(x1, y1, x2, y2);
						if (map.containsKey(new Pair(slope[0], slope[1]))) {
							map.put(new Pair(slope[0], slope[1]), map.get(new Pair(slope[0], slope[1])) + 1);
						} else {
							map.put(new Pair(slope[0], slope[1]), 1);
						}
						currentMax = Math.max(currentMax, map.get(new Pair(slope[0], slope[1])));
					}
					max = Math.max((currentMax + 1 + olp), (1 + olp + vp));
				}
				ans = Math.max(ans, max);
			}
			map.clear();
		}

		return ans;
	}

	private static int[] computeSlope(int x1, int y1, int x2, int y2) {
		int num = y2 - y1;
		int deno = x2 - x1;

		// deal with minus
		if(num !=0) {
		int fac = findGCD(num, deno);
		num = num / fac;
		deno = deno / fac;
		}else if(num==0) {
			deno =10000;
		}
		if (num < 0) {
			deno = -deno;
		}

		return new int[] { num, deno };
	}

	private static boolean checkforVP(int x1, int y1, int x2, int y2) {
		if (x1 == x2) {
			return true;
		}
		return false;
	}

	private static boolean checkForOLP(int x1, int y1, int x2, int y2) {
		if (x1 - x2 == 0 && y2 - y2 == 0) {
			return true;
		}

		return false;
	}

	static int findGCD(int x, int y) {
		int min = Math.min(x, y);
		int max = Math.max(x, y);
		if (max % min == 0) {
			return min;
		}

		return findGCD(max % min, min);
	}

}

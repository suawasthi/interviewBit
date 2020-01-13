package hashing2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GriDIllumination {

	public static void main(String[] args) {
		int A = 7;
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		ArrayList<Integer> z = new ArrayList<Integer>();
		ArrayList<Integer> z1 = new ArrayList<Integer>();
		ArrayList<Integer> z2 = new ArrayList<Integer>();
		ArrayList<Integer> z3 = new ArrayList<Integer>();
		ArrayList<Integer> z4 = new ArrayList<Integer>();
		ArrayList<Integer> z5 = new ArrayList<Integer>();
		ArrayList<Integer> z6 = new ArrayList<Integer>();
		ArrayList<Integer> z7 = new ArrayList<Integer>();
		ArrayList<Integer> z8 = new ArrayList<Integer>();
		ArrayList<Integer> s = new ArrayList<Integer>();

		s.add(0);
		s.add(1);

		x.add(0);
		x.add(4);

		y.add(6);
		y.add(5);

		z.add(0);
		z.add(5);

		z1.add(3);
		z1.add(6);

		z2.add(2);
		z2.add(3);

	
		  
		  z4.add(2); z4.add(6);
		  
		  z5.add(0); z5.add(4);
		  
		  z6.add(6); z6.add(1);
		  
		 z7.add(1); z7.add(4); 
		 z8.add(3); z8.add(2);
		 

		B.add(s);
		B.add(x);
		B.add(y);
		B.add(z);
		B.add(z1);
		B.add(z2);
		/*
		 * B.add(z3); B.add(z4); B.add(z5); B.add(z6); B.add(z7); B.add(z8);
		 */

		ArrayList<ArrayList<Integer>> C = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> k = new ArrayList<Integer>();
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		ArrayList<Integer> l5 = new ArrayList<Integer>();
		ArrayList<Integer> l6 = new ArrayList<Integer>();
		k.add(5);
		k.add(1);

		l.add(4);
		l.add(4);

		l1.add(2);
		l1.add(4);

		l2.add(3);
		l2.add(4);
		l3.add(2);
		l3.add(2);

		l4.add(5);
		l4.add(3);
		
		l5.add(4);
		l5.add(3);
		l6.add(9);
		l6.add(8);
		

		C.add(k);
		C.add(l);
		C.add(l1);
		C.add(l2);
		C.add(l3);
		C.add(l4);
		/*
		 * C.add(l5); C.add(l6);
		 */

		System.out.println(solve(A, B, C));

	}

	static class Pair {

		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
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
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

	}

	public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B, ArrayList<ArrayList<Integer>> C) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Map<Integer, Integer> xMap = new HashMap<Integer, Integer>(); // x
		Map<Integer, Integer> yMap = new HashMap<Integer, Integer>(); // y
		
		Map<Integer, Integer> xMinor = new HashMap<Integer, Integer>(); // X+y
		Map<Integer, Integer> xMajor = new HashMap<Integer, Integer>(); // x-y

		Map<Pair, Boolean> lightBulb = new HashMap<Pair, Boolean>();

		performLigting(lightBulb, B);

		preprocessMap(B, xMap, yMap, lightBulb);
		processDiagonal(xMinor, xMajor, B);

		for (int i = 0; i < C.size(); i++) {

			int x = C.get(i).get(0);
			int y = C.get(i).get(1);
			// add one more condition for lighthouse
			if (xMap.get(x) != null || yMap.get(y) != null || xMinor.get(x + y) != null
					|| xMajor.get(Math.abs(x - y)) != null) {
				xMajor.ge
				result.add(1);
			} else {
				result.add(0);
			}

			removeLight(A, x, y, xMinor, xMajor, lightBulb);
			postprocessMap(A, xMap, yMap, lightBulb);

		}

		return result;

	}

	private static void removeLight(int A, int x, int y, Map<Integer, Integer> xMinor, Map<Integer, Integer> xMajor,
			Map<Pair, Boolean> lightBulb) {

		if (lightBulb.get(new Pair(x, y)) != null ) {
			lightBulb.put(new Pair(x, y), false);
			postProcessDiagonal(x, y, xMinor, xMajor, lightBulb);
		} else {
			lightBulb.put(new Pair(x, y), false);
			postProcessDiagonal(x, y, xMinor, xMajor, lightBulb);
		}

		if (lightBulb.get(new Pair(x + 1, y)) != null) {
			lightBulb.put(new Pair(x + 1, y), false);
			postProcessDiagonal(x + 1, y, xMinor, xMajor, lightBulb);
		}
		if (lightBulb.get(new Pair(x - 1, y)) != null) {
			lightBulb.put(new Pair(x - 1, y), false);
			postProcessDiagonal(x - 1, y, xMinor, xMajor, lightBulb);
		}
		if (lightBulb.get(new Pair(x, y + 1)) != null) {
			lightBulb.put(new Pair(x, y + 1), false);
			postProcessDiagonal(x, y + 1, xMinor, xMajor, lightBulb);
		}
		if (lightBulb.get(new Pair(x, y - 1)) != null) {
			lightBulb.put(new Pair(x, y - 1), false);
			postProcessDiagonal(x, y - 1, xMinor, xMajor, lightBulb);
		}
		if (lightBulb.get(new Pair(x + 1, y - 1)) != null) {
			lightBulb.put(new Pair(x + 1, y - 1), false);
			postProcessDiagonal(x + 1, y - 1, xMinor, xMajor, lightBulb);
		}
		if (lightBulb.get(new Pair(x - 1, y + 1)) != null) {
			lightBulb.put(new Pair(x - 1, y + 1), false);
			postProcessDiagonal(x - 1, y + 1, xMinor, xMajor, lightBulb);
		}
		if (lightBulb.get(new Pair(x + 1, y + 1)) != null) {
			lightBulb.put(new Pair(x + 1, y + 1), false);
			postProcessDiagonal(x + 1, y + 1, xMinor, xMajor, lightBulb);
		}

		if (lightBulb.get(new Pair(x - 1, y - 1)) != null) {
			lightBulb.put(new Pair(x - 1, y - 1), false);
			postProcessDiagonal(x, y, xMinor, xMajor, lightBulb);
		}

	}

	private static void processDiagonal(Map<Integer, Integer> xMinor, Map<Integer, Integer> xMajor,
			ArrayList<ArrayList<Integer>> b) {
		for (int i = 0; i < b.size(); i++) {
			// major -
			int sum = Math.abs(b.get(i).get(0) - b.get(i).get(1));
			if (xMajor.get(sum) != null) {
				xMajor.put(sum, xMajor.get(sum) + 1);
			} else {
				xMajor.put(sum, 1);

			}

			int min = b.get(i).get(0) + b.get(i).get(1);
			if (xMinor.get(min) != null) {
				xMinor.put(min, xMinor.get(min) + 1);
			} else {
				xMinor.put(min, 1);

			}

		}

	}

	private static void postProcessDiagonal(int x, int y, Map<Integer, Integer> xMinor, Map<Integer, Integer> xMajor,
			Map<Pair, Boolean> lightBulb) {

		int min = x + y;
		if (xMinor.get(min) != null) {
			if (xMinor.get(min) > 1) {
				xMinor.put(min, xMinor.get(min) - 1);
			} else {
				xMinor.remove(min);
			}
		}
		int sub = Math.abs(x - y);
		if (xMajor.get(sub) != null) {
			if (xMajor.get(sub) > 1) {
				xMajor.put(sub, xMajor.get(sub) - 1);
			} else {
				xMajor.remove(sub);

			}
		}

	}

	private static void preprocessMap(ArrayList<ArrayList<Integer>> b, Map<Integer, Integer> xMap,
			Map<Integer, Integer> yMap, Map<Pair, Boolean> lightBulb) {
		for (int j = 0; j < b.size(); j++) {
			int x = b.get(j).get(0);
			int y = b.get(j).get(1);
			if (xMap.get(x) != null) {
				xMap.put(x, xMap.get(x) + 1);
			} else {
				xMap.put(x, 1);
			}

			if (yMap.get(y) != null) {
				yMap.put(y, yMap.get(y) + 1);
			} else {
				yMap.put(y, 1);
			}

		}

	}

	private static void postprocessMap(int a, Map<Integer, Integer> xMap, Map<Integer, Integer> yMap,
			Map<Pair, Boolean> lightBulb) {

		for (Map.Entry<Pair, Boolean> ligh : lightBulb.entrySet()) {

			if (ligh.getValue() == false) {
				int x = ligh.getKey().x;
				int y = ligh.getKey().y;
				if (xMap.get(x) != null) {
					if (xMap.get(x) > 1) {
						xMap.put(x, xMap.get(x) - 1);
					} else {
						xMap.remove(x);
					}
				}
				if (yMap.get(y) != null) {
					if (yMap.get(y) > 1) {
						yMap.put(y, yMap.get(y) - 1);
					} else {
						yMap.remove(y);
					}
				}

			}

		}

	}

	private static void performLigting(Map<Pair, Boolean> lightBulb, ArrayList<ArrayList<Integer>> B) {

		for (int i = 0; i < B.size(); i++) {
			lightBulb.put(new Pair(B.get(i).get(0), B.get(i).get(1)), true);

		}
	}

}

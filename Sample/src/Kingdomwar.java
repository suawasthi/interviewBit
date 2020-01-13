import java.util.ArrayList;

public class Kingdomwar {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		ArrayList<Integer> D = new ArrayList<Integer>();
		ArrayList<Integer> E = new ArrayList<Integer>();
		ArrayList<Integer> F = new ArrayList<Integer>();
		B.add(-2);
		B.add(-1);
		B.add(0);

		C.add(1);
		C.add(2);
		C.add(105);

		D.add(3);
		D.add(105);
		D.add(110);

		A.add(B);
		A.add(C);
		A.add(D);

		System.out.println(solve(A));
	}

	public static int solve(ArrayList<ArrayList<Integer>> A) {

		for (int i = A.size() - 1; i >= 0; i--) {

			if (A.get(i).size() > 1) {
				for (int j = A.get(i).size() - 1; j > 0; j--) {
					Integer a = A.get(i).get(j) + A.get(i).get(j - 1);
					A.get(i).set(j - 1, a);
				}
			}
		}
		if (A.size() > 1) {
			for (int i = A.size() - 1; i > 0; i--) {

				for (int j = A.get(i).size()-1; j >= 0; j--) {
					Integer a = A.get(i).get(j) + A.get(i-1).get(j);
					A.get(i-1).set(j, a);

				}
			}
		}
		int localMax = Integer.MIN_VALUE;
		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(i).size(); j++) {
				int sum = A.get(i).get(j);
				if (sum > localMax) {
					localMax = sum;
				}
			}
		}

		return localMax;
	}

}

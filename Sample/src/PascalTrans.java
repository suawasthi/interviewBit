import java.util.ArrayList;

public class PascalTrans {

	public static void main(String[] args) {

		System.out.println(solve(5));

	}

	public static ArrayList<ArrayList<Integer>> solve(int A) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < A; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {

				if (j == 0 || j == i) {
					temp.add(1);
				} else {
					temp.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
				}

			}
			result.add(temp);

		}

		return result;
	}
}

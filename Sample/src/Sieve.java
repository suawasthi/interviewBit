
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

class Sieve {

	static List<Integer> spff = new ArrayList<Integer>();

	static void precomputaion(int size) {
		int MAXN =size;
		Integer spf[] = new Integer[MAXN];
		spf[1] = 1;
		for (int i = 2; i < MAXN; i++)
			spf[i] = i;

		for (int i = 4; i < MAXN; i += 2)
			spf[i] = 2;

		for (int i = 3;i < MAXN; i++) {
			if (spf[i] == i) {
				for (int j = i  ; j < MAXN; j += i)

					if (spf[j] == j)
						spf[j] = i;
			}
		}
		spff=Arrays.asList(spf);
	}

	static Integer getFactorization(int x) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (x != 1) {
			Integer y = spff.get(x);
			map.put(y, map.get(y) == null ? 1 : map.get(y) + 1);
			x = x  / y;
		}

		Integer result = 1;
		int count = 1;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			result = result  * (entry.getValue() + 1);
		}

		return result;

	}

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
		precomputaion(Collections.max(A)+1);
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			res.add(getFactorization(A.get(i)));
		}
		return res;
	}

	public static void main(String args[]) {

		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(20);

		System.out.println(solve(B));

		System.out.println();
	}

}

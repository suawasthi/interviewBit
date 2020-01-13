package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ParityQueries {

	public static void main(String[] args) {

		Character[] A = {  '+', '+', '-', '?' };
		String[] B = { "200", "200", "200", "0" };
		System.out.println(solve(Arrays.asList(A), Arrays.asList(B)));
	}

	public static List<Integer> solve(List<Character> A, List<String> B) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < B.size(); i++) {
			int nos = performPatterCharge(B.get(i));
			if (A.get(i) == '+') {
				if (map.get(nos) != null) {
					int freq = map.get(nos);
					map.put(nos, freq + 1);
				} else
					map.put(nos, 1);
			} else if (A.get(i) == '-') {
				if (map.get(nos) != null) {
					int freq = map.get(nos);
					map.put(nos, freq - 1);
				} else
					map.put(nos, 1);
			} else if (A.get(i) == '?') {
				if (map.get(nos) != null) {
					result.add(map.get(nos));
				}
				else {
					result.add(0);
				}

			}

		}
		return result;
	}

	private static int performPatterCharge(String nos) {
		char[] ch = nos.toCharArray();
		int ans = 0;
		int k = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			if (Character.getNumericValue(ch[i]) % 2 == 0) {
				ans += 0;
			} else {
				int no = (int) Math.pow(2, k);
				ans += no;
			}
			k++;

		}

		return ans;
	}

}

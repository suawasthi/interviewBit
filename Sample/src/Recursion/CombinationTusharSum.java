package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CombinationTusharSum {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(1);
	

		// a.add(4);
		// 7, 8, 6, 4, 6 
		Collections.sort(a);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.size(); i++) {
			int key = a.get(i);
			if (map.containsKey(key)) {
				map.put(a.get(i), map.get(key) + 1);
			} else {
				map.put(key, new Integer(1));
			}
		}
		ArrayList<Integer> output = new ArrayList<Integer>();
		int[] input = new int[map.size()];
		int[] count = new int[map.size()];
		int i = 0;
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			count[i] = m.getValue();
			input[i] = m.getKey();
			i++;
		}

		Long l = new Long(0);
		ArrayList<Integer> result = new ArrayList<Integer>();
		computeCombination(input, count, output, 0, result);
		for (int j = 0; j < result.size(); j++) {
			l = (l % 1000000007 + result.get(j) % 1000000007) % 1000000007;
		}
		System.out.println(l);

	}

	private static void computeCombination(int[] input, int[] count, ArrayList<Integer> output, int pos,
			ArrayList<Integer> result) {
		System.out.println(output.toString());
		if (output.size() > 0 && output != null) {
			result.add((Collections.max(output) % 1000000007 - Collections.min(output)) % 1000000007);
		}
		for (int i = pos; i < input.length; i++) {
			if (count[i] == 0) {
				continue;
			}
			output.add(input[i]);
			count[i]--;
			computeCombination(input, count, output, i, result);
			output.remove(output.size() - 1);

			count[i]++;
		}

	}

}

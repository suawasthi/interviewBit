package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CombinationTushar {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
	
		//a.add(4);

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

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		computeCombination(input, count, output, 0, result);
		Long l = 0L;
		
		for (int j = 0; j < result.size(); j++) {
			l= (long) result.get(i)
		}
		System.out.println(result.toString());
	}

	private static void computeCombination(int[] input, int[] count, ArrayList<Integer> output, int pos,
			ArrayList<ArrayList<Integer>> result) {
		
		result.add(new ArrayList<Integer>(output));
		for (int i = pos; i < input.length; i++) {
			if (count[i] == 0) {
				continue;
			}
			output.add(input[i]);
			count[i]--;
			computeCombination(input, count, output, i, result);
			output.remove(output.size()-1);
			count[i]++;
		}

	}

}

package hashing2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromePairs {

	public static void main(String[] args) {
		String[] A = { "abcd", "dcba", "lls", "s", "sssll" };
		System.out.println(solve(Arrays.asList(A)));
	}

	public static ArrayList<ArrayList<Integer>> solve(java.util.List<String> A) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String, Integer> visited = new HashMap<String, Integer>();
		HashMap<String, Integer> visitedsu = new HashMap<String, Integer>();
		PrepareReverseMap(A, map);

		for (int i = 0; i < A.size(); i++) {
			// prefix
			StringBuilder sb = new StringBuilder(A.get(i));
			for (int j = 0; j < A.get(i).length(); j++) {
				String prefex = sb.substring(0, j + 1);
				String remaining = sb.substring(j + 1, sb.length()); // check edge
				if (map.get(prefex) != null && checkPalindron(remaining) && map.get(prefex) != i && visitedsu.get(prefex)==null) {
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(i);
					temp.add(map.get(prefex));
					visited.put(prefex, i);
					result.add(temp);
				}

			}
			String prefex= new String();
			for (int j = A.get(i).length() - 1; j >= 0; j--) {
				prefex = new String(sb.substring(j, sb.length()));
				String remaining = new String(sb.substring(0, j)); // check edge
				if (map.get(prefex) != null && checkPalindron(remaining) && map.get(prefex) != i && visited.get(prefex)==null) {
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(map.get(prefex));
					temp.add(i);
					visitedsu.put(prefex, i);

					result.add(temp);
					
				}
			
			}

		}

		return result;
	}

	private static boolean checkPalindron(String remaining) {
		StringBuilder word = new StringBuilder(remaining);
		if(remaining.equals(word.reverse().toString())) {
			return true;
		}
		
		return false;
	}

	private static void PrepareReverseMap(List<String> a, HashMap<String, Integer> map) {

		int counter = 0;
		for (String wordK : a) {
			StringBuilder s = new StringBuilder(wordK);
			StringBuilder word = s.reverse();
			map.put(word.toString(), counter++);

		}
	}
	
	
	

}

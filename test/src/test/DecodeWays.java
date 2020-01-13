package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DecodeWays {

	static Set<String> set = new HashSet<String>();

	public static void main(String[] args) {

		String input = "111212";
		char ch = 'A';
		HashMap<Integer, Character> map = new HashMap();
		for (int i = 1; i < 27; i++) {
			map.put(i, ch++);
		}

		int[] dp = new int[input.length() + 1];
		Arrays.fill(dp, -1);
		performOperation(map, input, 0, dp);
		System.out.println(ans);
		for (int j = 0; j < dp.length; j++) {
			System.out.print(" " + dp[j]);
		}
		System.out.println();

	}

	static int ans = 0;

	private static int performOperation(HashMap<Integer, Character> map, String input, int i, int[] dp) {
		int result = 0;
		if (i == input.length()) {

			result = 1;
			return 1;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		if (i + 1 <= input.length()) {
			String nos = input.substring(i, i + 1);
			if (isVaid(input.substring(i, i + 1), map)) 
				result += performOperation(map, input, i + 1, dp);
		
		}
		if (i + 2 <= input.length()) {
			String nos2 = input.substring(i, i + 2);
			if (isVaid(input.substring(i, i + 2), map)) 
				result += performOperation(map, input, i + 2, dp);
			
		}
		dp[i] = result;
		return result;
	}

	public static boolean isVaid(String str, Map<Integer, Character> map) {
		if (str.charAt(0) == '0')
			return false;

		try {
			Integer nos = Integer.valueOf(str);
			if (map.get(nos) != null) {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

}

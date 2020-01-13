package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class wordBreakDP {

	public static void main(String[] args) {

		String s = "applepenapple";
		String wordDict[] = { "applepen", "peni", "apple" };
		Set<String> set = new HashSet<String>();
		Set<Integer> index = new HashSet<Integer>();
		for (int i = 0; i < wordDict.length; i++) {
			set.add(wordDict[i]);
			index.add(wordDict[i].length());
		}
		List<Integer> ind = index.stream().collect(Collectors.toList());
		helperWordBreak(s, set, ind);
	}

	private static void helperWordBreak(String s, Set<String> set, List<Integer> ind) {

		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < ind.size(); j++) {
				if (i + ind.get(j) <= dp.length) {
					System.out.println(s.substring(i - 1, ind.get(j) + (i - 1)));
					if (dp[i - 1] && set.contains(s.substring(i - 1, ind.get(j) + (i - 1)))) {
						dp[i - 1 + ind.get(j)] = true;
					}
				}
			}
		}
		System.out.println(Arrays.toString(dp));
	}

}

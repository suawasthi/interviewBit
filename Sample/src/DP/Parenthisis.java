package DP;

import java.util.Arrays;
import java.util.Stack;

public class Parenthisis {

	public static void main(String[] args) {
		System.out.println(longestValidParentheses("()(()))"));
	}

	public static int longestValidParentheses(String s) {
		if (s.isEmpty())
			return 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			String temp = s.substring(i);
			if (temp.length() > max) {
				max = Math.max(max, longestValidParenthese(temp));
			}
		}

		return max;
	}

	public static int longestValidParenthese(String s) {
		char[] ch = s.toCharArray();
		Stack<custom> stack = new Stack();
		int ans = 0;
		int count = 0;
		int[] dp = new int[s.length()];
		Arrays.fill(dp, 0);
		stack.add(new custom(ch[0], 0));
		while (count < s.length()) {

			if (!stack.isEmpty() && stack.peek().ch == '(' && ch[count] == ')') {
				ans++;
				custom cs =stack.pop();
				
				dp[cs.index] = 1;
				dp[count] = 1;
			} else {
				stack.push(new custom(ch[count], count));
			}
			count++;
		}
		System.out.println(Arrays.toString(dp));
		return ans;
	}

	static class custom {

		Character ch;
		int index;

		public custom(Character ch, int i) {
			this.ch = ch;
			this.index = i;
		}

	}

}

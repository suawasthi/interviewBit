package test;

import java.util.ArrayList;

public class PalindromeCom {

	private static int checkPalindrome(int i, int j, ArrayList<Integer> listArray) {
		int forward = i;
		int backward = j;

		while (backward - forward >= 1) {
			//System.out.println(listArray.get(forward));
			//System.out.println(listArray.get(backward));

			if (!listArray.get(forward).equals(listArray.get(backward)))
				return 0;

			backward--;
			forward++;
		}

		return j - i;
	}

	public static void main(String[] args) {
		// 2 -> 1 -> 2 -> 1 -> 2 -> 2 -> 1 -> 3 -> 2 -> 2
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(2);
	
		System.out.println(solve(list));
	}

	public static int solve(ArrayList<Integer> listArray) {

		int max = Integer.MIN_VALUE;
		System.out.println(listArray);
		for (int i = 0; i < listArray.size() - 1; i++) {
			for (int j = i + 1; j < listArray.size(); j++) {
				max = Math.max(max, checkPalindrome(i, j, listArray));
			}
		}

		return max+1;

	}

}

package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class validSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1",
		// "7...2...6", ".6....28.", "...419..5", "....8..79"
		List<String> grid = new ArrayList<String>();
		grid.add("53..7....");
		grid.add("6..195...");
		grid.add(".98....6.");
		grid.add("8...6...3");
		grid.add("4..8.3..1");
		grid.add("7...2...6");
		grid.add(".6....28.");
		grid.add("...419..5");
		grid.add("....8..79");

		String[] s = { "53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.",
				"...419..5", "....8..79" };
		System.out.println(isValidSudoku(Arrays.asList(s)));

	}

	public static int isValidSudoku(final java.util.List<String> A) {

		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.size(); j++) {
				if (!checkAllThree(A, i, j)) {
					return 0;
				}
			}
		}

		return 1;
	}

	public static boolean checkAllThree(List<String> grid, int rowNum, int colNum) {

		return (checkRow(grid, rowNum) && checkColun(grid, colNum)
				&& checkBox(grid, rowNum - rowNum % 3, colNum - colNum % 3));

	}

	public static boolean checkRow(List<String> A, int row) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] c = A.get(row).toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] != '.') {
				if (map.get(c[i]) != null) {
					return false;
				} else {
					map.put(c[i], i);
				}
			}
		}
		return true;
	}

	public static boolean checkColun(List<String> grid, int columnNo) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < grid.size(); i++) {

			char[] c = grid.get(i).toCharArray();
			if (c[columnNo] != '.') {
				if (map.get(c[columnNo]) != null) {
					return false;
				} else {
					map.put(c[columnNo], i);
				}
			}

		}

		return true;
	}

	public static boolean checkBox(List<String> grid, int rowNum, int colNum) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = rowNum; i < rowNum + 3; i++) {
			char[] c = grid.get(i).toCharArray();
			for (int j = colNum; j < colNum + 3; j++) {
				if (c[j] != '.') {
					if (map.get(c[j]) != null) {
						return false;
					} else {
						map.put(c[j], i);

					}
				}

			}

		}
		return true;
	}
}

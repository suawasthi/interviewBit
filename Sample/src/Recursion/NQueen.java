package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueen {

	public static void main(String[] args) {
		System.out.println(solveNQueens(4));
	}

	public static ArrayList<ArrayList<String>> solveNQueens(int a) {

		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<Integer>> visited = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < a; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < a; j++) {
				temp.add(0);
			}
			visited.add(temp);

		}
		performNQueen(0, a, result, visited);
		return result;
	}

	public static ArrayList<ArrayList<Integer>> performNQueen(int rownum, int n, ArrayList<ArrayList<String>> result,
			ArrayList<ArrayList<Integer>> visited) {
		if (rownum == n) {
			processResult(result, visited);
			return visited;

		}
		// base case
		for (int i = 0; i < n; i++) {
			if (isvalid(visited, i, rownum)) {
				visited.get(rownum).set(i, 1);
				performNQueen(rownum + 1, n, result, visited);
				visited.get(rownum).set(i, 0);
			}

		}

		return visited;
	}

	private static void processResult(ArrayList<ArrayList<String>> result, ArrayList<ArrayList<Integer>> visited) {

		StringBuilder str= new StringBuilder();
		ArrayList<String> str1= new ArrayList<String>();
		for (int i = 0; i < visited.size(); i++) {
			for (int j = 0; j < visited.size(); j++) {
				if (visited.get(i).get(j).equals(new Integer(1))) {
					str.append("Q");
				} else {
					str.append(".");
				}
			}
			if(visited.size()>1 && i != visited.size()-1) {
			str.append(" ");
			}
		}	
		str1.add(str.toString());
		result.add(str1);
	}

	private static boolean isvalid(ArrayList<ArrayList<Integer>> visited, int colNum, int rowNum) {
		// upwards
		int col = colNum;
		for (int i = rowNum; i >= 0; i--) {
			if (visited.get(i).get(col).equals(new Integer(1))) {
				return false;
			}
		}

		for (int i = rowNum; i >= 0; i--) {
			int col1 = col++;
			if (col1 < visited.size() && visited.get(i).get(col1).equals(new Integer(1))) {
				return false;
			}
		}
		col = colNum;
		for (int i = rowNum; i >= 0; i--) {
			int col1 = col--;
			if (col1 >= 0 && visited.get(i).get(col1).equals(new Integer(1))) {
				return false;
			}
		}

		return true;
	}
}

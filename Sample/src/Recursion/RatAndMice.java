package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class RatAndMice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[][] = { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 2, -1 } };
		solve(A);

	}

	public static int solve(int[][] A) {
		int[][] v = new int[A.length][];

		for (int i = 0; i < A.length; i++) {
			int[] temp = new int[A[i].length];
			v[i] = new int[A[i].length];
			v[i] = temp;
		}

		int row = 0;
		int column = 0;
		int endX = 0;
		int endY = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (A[i][j] == 1) {
					row = i;
					column = j;
				}
				if (A[i][j] == 2) {
					endX = i;
					endY = j;
				}
			}

		}

		performMove1(A, row, column, endX, endY, v);
		return 0;
	}

	static int count = 0;

	public static void performMove1(int[][] A, int row, int column, int endX, int endY, int[][] V) {

		if (row == endX && column == endY) {
			System.out.println(++count);
			return;
		}

		V[row][column] = 1;
		if (valid(A, row - 1, column, V)) {
			performMove1(A, row - 1, column, endX, endY, V);
		}
		if (valid(A, row + 1, column, V)) {
			performMove1(A, row + 1, column, endX, endY, V);
		}
		if (valid(A, row, column + 1, V)) {
			performMove1(A, row, column + 1, endX, endY, V);
		}
		if (valid(A, row, column - 1, V)) {
			performMove1(A, row, column - 1, endX, endY, V);
		}
		V[row][column] = 0;
		// unvisit

	}

	private static boolean valid(int[][] a2, int row, int column, int V[][]) {
		if (row >= 0 && row < a2.length && column >= 0 && column < a2[row].length && a2[row][column] != -1
				&& V[row][column] != 1)
			return true;
		return false;
	}

}

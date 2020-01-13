import java.util.Arrays;

public class LeftRoataion {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 3 };
		int[][] result=  solve(a, b);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.println(result[i][j]);
			}
			
		}
	}

	public static int[][] solve(int[] A, int[] B) {

		int[][] result = new int[B.length][];

		for (int i = 0; i < B.length; i++) {

			int[] temp = new int[A.length];
			for (int j = 0; j < A.length; j++) {

				temp[j] = A[Math.abs(B[i]+j) % A.length];
			}
			result[i]=temp;
		}

		return result;
	}

}

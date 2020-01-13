
public class XORQuery {

	public static void main(String[] args) {

		int[] A = { 1, 0, 0, 0, 1 };
		int[][] B = { { 2, 4 }, { 1, 5 }, { 3, 5 } };
		solve(A, B);

	}

	public static int[][] solve(int[] A, int[][] B) {
		int[][] H = new int[B.length][2];			
		int count;
		for (int i = 0; i < B.length; i++) {
			int L = B[i][0], R = B[i][1];
			count = 0;
			int result=0;
			while (L <= R) {
				if ((A[L-1] & 1) == 0) {
					count++;
				}
				result = result^A[L-1];
				L++;
			}

			int[] a= {result,count};
			H[i]=a;
			}
		return H;
	}

}

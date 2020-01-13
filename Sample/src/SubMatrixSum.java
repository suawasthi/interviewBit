import java.util.Arrays;

public class SubMatrixSum {

	public static void main(String[] args) {
		int [][] A =
		{
			  {1, 2, 3},
			  {4, 5, 6},
			  {7, 8, 9}
			  };
			int[] B = { 1, 2 };
			int[] C = { 1, 2 };
			int[] D = { 2, 3 };
			int[] E = { 2, 3 };
		System.out.println(Arrays.toString(solve(A, B, C, D, E)));;
		
	

	}

	public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

		for (int i = 0; i < A.length; i++) {
			for (int j = 1; j < A[i].length; j++) {
				long sum =    ((long)A[i][j]  + (long)A[i][j - 1])% (1000000007);
				A[i][j]= (int) sum;
			}

		}
		for (int i = 1; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				long sum  = ((long)A[i][j]  +   (long)A[i - 1][j] )% (1000000007);
				A[i][j]=(int) sum;
			}

		}

		int[] res = new int[B.length];


		for(int i=0;i<B.length | i<C.length;i++) {
		int tli=B[i]-1;
		int tlj=C[i]-1;
		int rbi=D[i]-1;
		int rbj=E[i]-1;
		
		long sumi = A[rbi][rbj] % (1000000007);
		
		if (tli - 1  >= 0) {

			sumi = (sumi  - A[tli - 1][rbj] )% (1000000007) ;
		}
		if (tlj-1 >= 0) {
			sumi =  (sumi  -  A[rbi][tlj-1] ) % (1000000007) ;
			
		}

		if ((tli-1 >= 0) && (tlj-1 >= 0)) {
			sumi =   (sumi  + A[tli-1][tlj-1]) % 1000000007;
		}
		
	
		res[i]= (int) ((sumi + + 1000000007)  % 1000000007) ;
		}
		return res;

	}

}

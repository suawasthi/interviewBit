
public class SerachMatrix {

	public static void main(String[] args) {
		int a[][]= { {1, 2, 3},
					 {4, 5, 6},
	                 {7, 8, 9}   
				   };
		System.out.println(solve(a,2));
		

	}
	
	 public static int solve(int[][] A, int B) {
		 
		 int row =0;
		 int column = A[0].length-1;
		 
		 while(row<=A.length-1 && column>=0) {
		System.out.println(A[row][column]);
			 if(B > A[row][column]) {
				 row++;
				 continue;
			 }
			 if(B< A[row][column]) {
				 column--;
				 continue;
			 }
			 
			 if(B==A[row][column])
				 return (((row+1) * 1009) +(column+1));
		 }

		 return -1;
	 }

}

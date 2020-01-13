
public class SUbMatricsSum {

	public static void main(String[] args) {
		int [][]  A= {{1,1,},{1,1}};
		System.out.println(solve(A));
	}
	
	 public static int solve(int[][] A) {
	 
		 int sum=0;
		 
		 for(int i=0;i<A.length;i++) {
			 
			 for(int j=0;j<A[i].length;j++) {
				 
				 sum += A[i][j] * (i +1) *(j+1) *(A.length-i)*(A.length-j);
			 }
		 }
		 
		 return sum;
	 }
}

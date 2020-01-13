
public class DiffrentBit {

	public static void main(String[] args) {
		int[] A= {1,3,5};
		System.out.println(cntBits(A));
	}
	 public static int cntBits(int[] A) {
		 int sum =0;
		 for(int i=0;i<A.length;i++) {
			 for(int j=0;j<A.length;j++) {
				 System.out.println(A[i] +" : : "+ A[j]);
				 int count=0;
				 System.out.println(A[i] ^ A[j]);
				 int n = A[i] ^ A[j];
				 while (n > 0) 
			        { 
			            count += n & 1; 
			            n >>= 1; 
			        } 
				 sum+=count;
			 }
		 }
		 
		 
		 
		 
		 return sum;
	    }
}

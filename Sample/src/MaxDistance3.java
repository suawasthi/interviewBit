
public class MaxDistance3 {

	public static void main(String[] args) {
		int arr[] = {1}; 
		System.out.println(maxSum(arr));
	}
	
	public static int maxSum(int[] A) {
		
		
		int[] lMin = new int[A.length];
		int[] rMax = new int[A.length];
		
		lMin[0]=A[0];
		for (int i = 1; i < A.length; i++) {
			lMin[i]= (int)Math.min(A[i], lMin[i-1]); 
			
		}
		rMax[A.length-1]=A[A.length-1];
		for (int i = A.length-2; i >=0; i--) {
			rMax[i]= (int)Math.max(A[i], rMax[i+1]);
		}
		int i=0;
		int j=0;
		int localSum =-1;
		while(i<A.length && j<A.length){
			
			if(lMin[i] < rMax[j]) {
				
				int sum = j-i;
				localSum= Math.max(localSum, sum);
				j= j+1;
			}
			else {
				i++;
			}
			
		}
		
		return localSum;
	}

}

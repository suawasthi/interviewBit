import java.util.Arrays;

public class UnsortedSubArray {

	public static void main(String[] args) {
		int[] a= { 3, 3, 4, 5, 5, 9, 11, 13, 14, 15, 15, 16, 15, 20, 16 };
		System.out.println(a.length);
		System.out.println(Arrays.toString(unSortedArray(a)));
	}
	public static int[] unSortedArray(int[] A) {
		int i=0;
		for(;i<A.length-1;i++) {
			if(A[i] <= A[i+1]) {
				continue;
			}
			break;
		}
		if(i==A.length-1) {
			return new int[] {-1};
		}
		int j=A.length-1;
		for(; j>0;j--) {
			if(A[j] >= A[j-1] ) {
				continue;
			}
			break;
		}
		
		Arrays.sort(A, i, j+1);
		while( i>=0 && A[i] <A[i-1] )  {
			int temp=A[i];
			A[i-1]=A[i];
			A[i]=temp;
			i--;
		}
		while(j<A.length-1 && A[j] > A[j+1] ) {
			int temp=A[j+1];
			A[j+1]=A[j];
			A[j]=temp;
			j++;
		} 
		
		
		return new int[] {i, j};
		
	}

}

import java.util.Arrays;

public class PairSumK {

	public static void main(String[] args) {

		int A[]= {5, 9, 36, 74, 52, 31, 42};
		int B[]= { 93, 9, 46, 79, 56, 24, 10, 26, 9, 93, 31, 93, 75, 7, 4, 80, 19, 67, 49, 84, 62, 100, 17, 40, 35, 84, 14, 81, 99, 31, 100, 66, 70, 2, 11, 84, 60, 89, 13, 57, 47, 60, 59, 60, 42, 67, 89, 29, 85, 83, 42, 47, 66, 80, 88, 85, 83, 82, 16, 23, 21, 55, 26, 2, 21, 92, 85, 26, 46, 3, 7, 95, 50, 22, 84, 52, 57, 44, 4, 23, 25, 55, 41, 49 };
		System.out.println(solve(B, 37));
	}
	
	public static int solve(int[] A, int B) {
		int mod=1000000007;
		long[] bucket = new long[B];
		for (int i = 0; i < A.length; i++) {
			++bucket[A[i]%B];
		}
		
		
		long czero = bucket[0];
		long sum =(czero %mod * ((czero-1)%mod)/2)% 1000000007;
		
		for (int i = 1; i <= bucket.length/2 && i!=(B-i); i++) {
			sum += ((bucket[i]%mod) * (bucket[B-i]%mod)) %1000000007;
			
		}
		
		if(B%2==0) {
			sum +=((bucket[B/2]%mod) * ((bucket[B/2]-1)%mod)/2)% 1000000007;
		}
		
		int result =(int) sum % 1000000007;
		
		return result;
		
		
	}

}

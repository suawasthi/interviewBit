import java.util.Arrays;

public class PairSum {
	public static int cntBits(int[] A) {
		long sum = 0;
		int count=0;
		for (int i = 0; i < 32; i++) {
			count=0;
			for (int j = 0; j < A.length; j++) {
				if((A[j] & (1<<i))==0)
				count++;
			}
			sum += ((count *(A.length-count) % 1000000007)  * 2) % 1000000007;
		}
		return (int) ((sum + 1000000007) % 1000000007);
	}
	public static void main(String[] args) {
		
	}

}


public class SamPairDiffrence {

	public static void main(String[] args) {
		int [] A = {1,3, 5};
		System.out.println(cntBits(A));
	}
	public static int cntBits(int[] A) {
		int sum = 0;
		int count=0;
		for (int i = 0; i < 32; i++) {
			System.out.println(Integer.toBinaryString(i));
			count=0;
			for (int j = 0; j < A.length; j++) {
				System.out.println((1<<i) + ": :");
				if((A[j] & (1<<i))==0)
				count++;
			}
			sum += count *(A.length-count) * 2;
		}
		return sum;
	}
}

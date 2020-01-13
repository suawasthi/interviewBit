import java.util.Arrays;

public class MaxLength {

	public static void main(String[] args) {
		int[] a = { 0, 0, -1, 0};
		System.out.println(Arrays.toString(maxSet(a)));
	}
	public static int[] maxSet(int[] A) {
		Long curSum=0l;int curStart=0, curlength=0;
		Long maxSum=0l;int maxStart=0, maxlength=0;
		
		
		for(int i=0;i<A.length;i++) {
			if(A[i]>=0) {
			curSum=curSum+A[i];
			curlength++;
			if(curSum > maxSum  ) {
				maxSum=curSum;
				maxStart=curStart;
				maxlength=curlength;
			}
			else if(curSum >= maxSum && curlength >= maxlength) {
				maxSum=curSum;
				maxStart=curStart;
				maxlength=curlength;
			}
			}else {
				curStart=i+1;
				curSum=0L;
				curlength=0;
			}
			
		}
		int result[] = new int[maxlength];
		System.arraycopy(A, maxStart, result, 0, maxlength);
		return result;
	}

}

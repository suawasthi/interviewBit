
public class RainWaterMax {

	public static void main(String[] args) {
		int[] a= {1, 5, 4, 3};
		System.out.println(rainWater(a));

	}
	public static int rainWater(int[] A) {
		
		int lm[] = new int[A.length];
		int rm[] = new int[A.length];
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++) {
			max = Integer.max(max, A[i]);
			lm[i]=max;
		}
		max=Integer.MIN_VALUE;
		int currentMax=Integer.MIN_VALUE;
		for(int i=A.length-1;i>=0;i--) {
			max = Integer.max(max, A[i]);
			rm[i]=max;
		}
		int result =0;
		for(int i=0;i<A.length;i++) {
			if(A[i]<lm[i] && A[i] <rm[i]) {
				if(A[i] < A[i+1] && result >currentMax) {
					result =result + (Integer.min(lm[i], rm[i]) - A[i]);
					currentMax=result;
					result=0;
					continue;
				}
				result =result + (Integer.min(lm[i], rm[i]) - A[i]);
			}
		}
		return currentMax;
		
		
		
		
	}

}

package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LargestNumber {

	public static void main(String[] args) {
		final int[] A = {3, 1, 2, 4};
		minSwap(A);
	
		//maximumGap(Arrays.asList(A));
	
	
	}
	public static void minSwap(int [] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] = A[i]+1;
		}
		int ans=0;
		for(int i=0;i<A.length;i++) {
			if(A[i] < 0) continue;
			int nextNum =A[i];
			int cycle =0;
			A[i]=-A[i];
			while(nextNum >= 0) {
				int temp=nextNum;
				nextNum=  A[nextNum-1];
				A[temp-1]= -1 * Math.abs(A[temp-1]);
				cycle++;
			}
			
			ans += cycle-1;
			
			
		}
		
		System.out.println(ans);
	}


	


}

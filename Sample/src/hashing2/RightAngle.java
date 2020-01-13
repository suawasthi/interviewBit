package hashing2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class RightAngle {
	public static void main(String[] args) {
		int[] A = { 1, 1, 2, 3, 3 };
		int[] B = { 1, 2, 1, 2, 1 };
		System.out.println(solve(A, B));

	}

	public static int solve(int[] A, int[] B) {
		int ans = 0;

		HashMap<Integer, Integer> mapX = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> mapY = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			if (mapX.containsKey(A[i])) {
				mapX.put(A[i], mapX.get(A[i])+1);
			} else {
				
				mapX.put(A[i], 1);
			}

		}

		for (int i = 0; i < B.length; i++) {
			if (mapY.containsKey(B[i])) {
				mapY.put(B[i], mapY.get(B[i])+1);
			} else {
				
				mapY.put(B[i], 1);
			}

		}

		 for(int i=0;i<A.length;i++)
	            ans+=(mapX.get(A[i])-1)*(mapY.get(B[i])-1);	

		return ans;
	}
}

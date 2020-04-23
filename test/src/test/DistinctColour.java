package test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DistinctColour {

	public static void main(String[] args) {
		System.out.println(solve(null, 1));
	}

	// heap and map
	public static int solve(int[] k, int B1) {
		int A[] = {31, 51, 31, 51, 31, 31, 31, 31, 31, 31, 51, 31, 31 };
		int B = 3;
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>() ;

		int ans = 0;
		for (int i = 0; i < B; i++)
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		ArrayList<Integer>	 arr = new ArrayList<Integer>();
		arr.add(map.size());

		
		for (int i = B; i < A.length; i++) {
	
			if(i-B >=  0 && map.get(A[i-B])!=null && map.get(A[i-B]) >=1 ) {
				map.put(A[i-B],map.get(A[i-B])-1 );
			}
			if(i-B >=  0 && map.get(A[i-B])!=null && map.get(A[i-B]) <= 0 ) {
				map.remove(A[i-B]);
			}
			
			map.put(A[i],map.getOrDefault(A[i], 0) +1);
			
			arr.add(map.size());
		}
		System.out.println(arr);
		return ans;

	}

}

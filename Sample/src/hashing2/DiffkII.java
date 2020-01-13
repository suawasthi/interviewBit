package hashing2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DiffkII {

	public static void main(String[] args) {
		Integer[] A = {11, 85, 100, 44, 3, 32, 96, 72, 93, 76, 67, 93, 63, 5, 10, 45, 99, 35, 13  };
		System.out.println(diffPossible(Arrays.asList(A), 60));
	}

	public static int diffPossible(final List<Integer> A, int B) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.size(); i++) {
			int key = A.get(i) - B;
			if (map.get(A.get(i)) != null ) {
				return 1;
			} else {
				map.put(key, i);
			}
		}
		for (int i = 0; i < A.size(); i++) {
			
			if(map.get(A.get(i))!=null &&  map.get(A.get(i)) !=i) {
				return 1;
			}
			
		}

		return 0;
	}

}

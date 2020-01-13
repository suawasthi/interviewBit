package Hashing;

import java.util.Arrays;
import java.util.HashMap;

/*Find the largest continuous sequence in a array which sums to zero. Example:
*/
public class ContinuousSequence {

	public static void main(String[] args) {

		Integer[] A = { 1, 2, -3, 3 };
		System.out.println(Arrays.toString(lszero(A)));

	}

	public static int[] lszero(Integer[] A) {
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int start=-1;
		int end =-1;
		int ans = 0;
		for (int i = 0; i < A.length; i++) {

			sum = sum + A[i];
			if (map.get(sum) != null) {
				int gap = i - map.get(sum);
				if (ans < gap){
					ans = gap;
					start= i-gap+1;
					end =i;
				}
			} else {
				map.put(sum, i);
			}
		}
		int[] result = new int[ans];
			for (int i = 0; i < A.length; i++) {
				if(start >=0  && end <A.length && start <=end) {
				result[i]=A[start];
				start++;
			}
		}
		return result;
	}

}

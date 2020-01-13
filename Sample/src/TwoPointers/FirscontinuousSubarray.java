package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class FirscontinuousSubarray {

	public static void main(String[] args) {
		Integer[] A = {1, 82};
		System.out.println(solve(Arrays.asList(A), 82));
	}

	public static ArrayList<Integer> solve(java.util.List<Integer> A, int B) {
		
		
		int i = 0, j = 0;
		int sum = A.get(i);
		boolean flag=false;
		
		
		if(A.size()==2) {
			while ( i <= A.size()-1 && j <= A.size()) {
				

				if (sum > B) {
					sum = sum - A.get(i);
					i++;
					continue;

				}
				
				if (sum < B  ) {
					j++;
					sum = sum + A.get(j);
					continue;
				}
				
				
				if (sum == B) {
					flag=true;
					break;
				}
				if(i==j) {
					break;
				}
				

			}


		}
		
		while ( i <= A.size()-1 && j < A.size()-1) {
	

			if (sum > B) {
				sum = sum - A.get(i);
				i++;
				continue;

			}
			
			if (sum < B  ) {
				j++;
				sum = sum + A.get(j);
				continue;
			}
			
			
			if (sum == B) {
				flag=true;
				break;
			}
			if(i==j) {
				break;
			}
			

		}

		
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (i > j) {
			result.add(-1);
			return result;

		} else if (i <= j  && flag) {
			while (i <= j) {
				result.add(A.get(i));
				i++;
			}
			return result;
		}
		result.add(-1);
		return result;

	}

}

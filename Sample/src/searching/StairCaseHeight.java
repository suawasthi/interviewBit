package searching;

import java.util.ArrayList;

public class StairCaseHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(631974));
	}

	ArrayList<Integer> stair = new ArrayList<Integer>();

	public static int solve(int A) {
		if(A==1) {
			return 1;
		}
		
		int low = 0;
		int high = A;
		int lastMid=0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (isPosible(A,mid)) {
				high = mid - 1;
				lastMid=mid;
			} else {
				low= mid +1;
			}

		}


		return lastMid;
	}

	private static boolean isPosible(int blocks, int noS) {
		
		int step = 1;
		while (noS > 0) {
			blocks = blocks - step;
			step++;
			noS--;
		}
		if (blocks >= 0) {
			return true;
		}

		return false;
	}

}

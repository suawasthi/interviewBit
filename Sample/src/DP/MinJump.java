package DP;

import java.util.Arrays;

public class MinJump {

	public static void main(String[] args) {

		int[] A = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int[] ans = new int[A.length];
		//
		jump(A);
		jump1(A);
		Arrays.fill(ans, Integer.MAX_VALUE);

		// a[j] - a[i] > 0 i
		ans[0] = 0;
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j <= i; j++) {
				if (A[j] + j >= i) {
					ans[i] = Math.min(ans[i], ans[j] + 1);
				}
			}
		}
		System.out.println(Arrays.toString(ans));
	}

	public static int jump(int[] nums) {

		int[] jumbs = new int[nums.length];
		Arrays.fill(jumbs, Integer.MAX_VALUE);
		jumbs[0] = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] < nums[i - 1])
				continue;
			for (int j = 1; (j) < nums.length; j++)
				if (j <= nums[i]) {
					jumbs[j] = Math.min(jumbs[j], jumbs[i] + 1);
				}else {
					break;
				}
		}

		// System.out.println(Arrays.toString(jumbs));
		return jumbs[jumbs.length - 1] < 0 ? -1 : jumbs[jumbs.length - 1];

	}
	// 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9
	
	public static int jump1(int[] A) {
		int jumps = 0, curEnd = 0, curFarthest = 0;
		for (int i = 0; i < A.length - 1; i++) {
			curFarthest = Math.max(curFarthest, i + A[i]);
			if (i == curEnd) {
				jumps++;
				curEnd = curFarthest;
			}
		}
		return jumps;
	}

}

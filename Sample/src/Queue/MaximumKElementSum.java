package Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaximumKElementSum {

	public static void main(String[] args) {
		int[] A = { 9, 10, 9, -7, -4, -8, 2, -6 };
		int k = 5;
		System.out.println(Arrays.toString(maxSlidingWindow(A, k)));
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length == 0) {
			return new int[] {};
		}

		int[] result = new int[nums.length - k + 1];
		int ans = 0;
		int cnt = 0;
		Deque<Integer> GDeque = new LinkedList<Integer>();

		GDeque.add(0);
		int i = 0;
		for (i = 1; i < k; i++) {
			while (!GDeque.isEmpty() && nums[i] > nums[GDeque.getLast()]) {
				GDeque.pollLast();
			}
			GDeque.add(i);

		}

		for (; i < nums.length; i++) {
			// not sure if this ever get into
			ans = (nums[GDeque.peek()]);
			result[cnt++] = ans;

			// 1,3,-1,-3,5,3,6,7
			// 9,10,9,-7,-4,-8,2,-6
			// slide
			while (!GDeque.isEmpty() && GDeque.peek() <= i - k) {
				GDeque.removeFirst();
			}
			// Big element
			while (!GDeque.isEmpty() && GDeque.peekLast() != null && nums[i] > nums[GDeque.peekLast()]) {
				GDeque.removeLast();
			}

			GDeque.addLast(i);

		}
		if (!GDeque.isEmpty()) {
			result[cnt++] = nums[GDeque.peek()];
		}

		return result;
	}

}

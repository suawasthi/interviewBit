package stack;

import java.util.Stack;

public class RainWater {

	public static void main(String[] args) {
		int A[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(A));

	}

	public static int trap(final int[] A) {
		int ans = 0;
		if (A.length < 0) {
			return 0;
		}

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < A.length; i++) {

			while (!stack.isEmpty() && A[i] > A[stack.lastElement()]) {
				int top = stack.pop();
				if (!stack.isEmpty()) {
					int distance = i - stack.lastElement() - 1;
					int boundedHeight = Math.min(A[stack.lastElement()], A[i]) -A[top];
					ans += boundedHeight* distance;
				} 
			}
			stack.push(i);

		}

		return ans;
	}

}

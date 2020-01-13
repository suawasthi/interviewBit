package stack;

import java.util.Stack;

public class LargestRectangle {

	public static void main(String[] args) {

		int[] A = { 2,1,5,6,2,3};
		System.out.println(largestRectangleArea(A));
	}

	public static int largestRectangleArea(int[] A) {
		Stack<Integer> stack = new Stack<Integer>();
		if (A.length < 0) {
			return 0;
		}
		int area = 0;

		int max = -1;
		int i = 0;
		for (i = 0; i < A.length;) {

			if (stack.isEmpty() || A[stack.lastElement()] <=A[i]) {
				stack.push(i);
				i++;
			} else {
				int top = stack.pop();
				if (stack.isEmpty()) {
					area = A[top] * i;
				} else {
					area = A[top] * (i - stack.lastElement() - 1);
				}
				max = Math.max(max, area);

			}

		}
		while (!stack.isEmpty()) {
			int top = stack.pop();
			if (stack.isEmpty()) {
				area = A[top] * i;
			} else {
				area = A[top] * (i - stack.lastElement() - 1);

			}
			max = Math.max(max, area);

		}

		return max;
	}

}

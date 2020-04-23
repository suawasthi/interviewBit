package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;

public class Rotation {

	static class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}

		@Override
		public String toString() {
			return x + " - " + y;
		}
	}

	public static void main(String[] args) {
		int[] input = { 120, 131, 101, 30, 17, 127, 55, 35, 45, 50, 64, 62, 96, 92, 63, 76, 25, 52, 85, 75 };
		System.out.println(solve(input));
	}

	public static int solve(int[] A) {
		Stack<Integer> stack = new Stack<Integer>();
		int i = -1;
		int n = A.length;

		int ans = 0;
		while (i++ < n - 1) {

			if (stack.isEmpty()) {
				stack.push(A[i]);

				continue;
			}
			if (stack.size() == 1) {
				if (stack.peek() > A[i]) {
					stack.push(A[i]);
				} else {
					int pop = stack.pop();
					stack.push(A[i]);
					stack.push(pop);
				}
				continue;
			}

			if (stack.peek() < A[i]) {
				int popped = stack.pop();
				stack.push(A[i]);
				stack.push(popped);
			} else {
				ans += stack.size();
				stack = new Stack<Integer>();
				stack.push(A[i - 1]);
				i--;
			}

		}
		ans += stack.size();
		return ans;
	}

}

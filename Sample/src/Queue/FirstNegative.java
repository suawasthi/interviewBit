package Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegative {

	public static void main(String[] args) {
	    int [] A = {-1, 2, 3, -4, 5};
	    int  B = 2;
	    System.out.println(Arrays.toString(solve(A, B)));
	}

	public static int[] solve(int[] A, int B) {
		int[] result = new int[A.length + 1 - B];
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.off

		Deque<Integer> dqueue = new LinkedList<Integer>();
		int in = 0;
		int i = 0;
		for (; i < B; i++) {
			if (A[i] < 0) {
				dqueue.addLast(i);
			}

		}
		if (!dqueue.isEmpty()) {
			result[in] = A[dqueue.peek()];
		} else {
			result[in] = 0;
		}

		for (; i < A.length; i++) {
			
			if (A[i] < 0) {
				dqueue.addLast(i);
			}

			while (!dqueue.isEmpty() && dqueue.peek() <= i - B) {
				dqueue.poll();
			}
			
			if (!dqueue.isEmpty()) {
				result[++in] = A[dqueue.peek()];
			} else {
				result[++in] = 0;
			}

		}
		return result;
	}

}

package Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MinimumandMaximum {

	public static void main(String[] args) {
		Integer A[] = { 2, 5, -1, 7, -3, -1, -2 };
		int B = 4;
		System.out.println(solve(Arrays.asList(A), B));

	}

	public static int solve(java.util.List<Integer> A, int B) {
		Long ans = 0l;
		if (A.size() < 0) {
			return 0;
		}
		Deque<Integer> GDeque = new LinkedList<Integer>();
		Deque<Integer> SDeque = new LinkedList<Integer>();

	
		int i = 0;
		for (i = 0; i < B; i++) {
			while (!GDeque.isEmpty() && A.get(i) > A.get(GDeque.getLast())) {
				GDeque.pollLast();
			}
			while (!SDeque.isEmpty() && A.get(i) < A.get(SDeque.getLast())) {
				SDeque.pollLast();
			}
			SDeque.addLast(i);
			GDeque.addLast(i);
		}

		for (; i < A.size(); i++) {

			if (!GDeque.isEmpty() && !GDeque.isEmpty()) {
				ans = (ans  % 1000000007 + A.get(GDeque.peek()) % 1000000007 + A.get(SDeque.peek()) % 1000000007)  % 1000000007;
			}
			// 2, 5, -1, 7, -3, -1, -2
			while (!SDeque.isEmpty() && SDeque.peek() <= i - B) {
				SDeque.removeFirst();
			}
			while (!GDeque.isEmpty() && GDeque.peek() <= i - B) {
				GDeque.removeFirst();
			}

			if (!GDeque.isEmpty() && A.get(i) != null && A.get(i) > A.get(GDeque.getLast())) {
				GDeque.removeLast();
				
			}
			if (!SDeque.isEmpty() && A.get(i) != null && A.get(i) < A.get(SDeque.getLast())) {
				SDeque.removeLast();
			}
			
			GDeque.addLast(i);
			SDeque.addLast(i);
			
		}
		
		

		return (int) (ans % 1000000007);
	}

}

package test;

import java.util.LinkedList;
import java.util.Queue;

public class Muliply {

	public static void main(String[] args) {

		int n = (int) Math.floor(Math.log10(109) + 1);

		System.out.println(multiple(10));
	}

	public static String multiple(int A) {

		int n = (int) Math.floor(Math.log10(A) + 1);

		if (n == 1) {
			return String.valueOf(A);
		}
		Long nos = 1L;
		Queue<Long> queue = new LinkedList<Long>();
		queue.offer(nos);
		while (!queue.isEmpty()) {
			Long l = queue.poll();
			Long left = l * 10 + 0;
			Long right = l * 10 + 1;

			if (left % (long) A == 0) {
				return String.valueOf(left);
			}
			if (right % (long) A == 0) {
				return String.valueOf(right);
			}
			queue.offer(left);
			queue.offer(right);

		}

		return String.valueOf(-1);

	}
}

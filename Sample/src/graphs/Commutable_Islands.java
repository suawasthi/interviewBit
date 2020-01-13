package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Commutable_Islands {

	public static void main(String[] args) {

		int A = 5;
		int B[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 }, { 4, 5, 6 }, { 5, 1, 2 }, { 2, 4, 3 }, { 2, 5, 5 },
				{ 1, 3, 2 } };
		solve(A, B);

	}

	public static int solve(int A, int[][] B) {
		Set<Integer> set = new HashSet<Integer>();
		int[] cost = new int[A + 1];
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[1] = 0;
		// set.add(1);
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(1);
		while (!queue.isEmpty()) {
			int x = queue.poll();
			if (set.contains(x)) {
				continue;
			}
			for (int i = 0; i < B.length; i++) {
				if (x == B[i][0]) {
					cost[B[i][1]] = Math.min(cost[B[i][1]], B[i][2]);
					queue.offer(B[i][1]);
				}
			}
			set.add(x);
		}
		System.out.println(Arrays.toString(cost));
		return 0;
	}

	private static int getSmallest(Queue<Integer> queue) {
		List<Integer> queueCopy = queue.stream().collect(Collectors.toList());

		int x = Integer.MAX_VALUE;
		for (int i = 0; i < queueCopy.size(); i++) {
			x = Math.min(x, queueCopy.get(i));
		}
		return x;
	}

}

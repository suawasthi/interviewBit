package test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestAfterKOperation {

	static class Pair {

		int currentSum;
		int next;

		Pair(int current, int original) {
			this.currentSum = current;
			this.next = original;
		}

		public String toString() {
			return currentSum + "-" + next;
		}

	}

	public static void main(String[] args) {
		int[] input = {  8, 6, 4, 2 };
		int B = 8;
		Comparator<Pair> comp = new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {

				if (o1.next == o2.next) {
					if(o1.currentSum  < o2.currentSum) return 1;
					else return -1;
				}else if(o1.next > o2.next) return 1;
				else return -1;
			}
		};

		PriorityQueue<Pair> queue = new PriorityQueue<Pair>(comp);
		for (int i = 0; i < input.length; i++) {
			queue.offer(new Pair(input[i], input[i] + input[i]));
		}

		System.out.println(queue);
		/*
		 * while(!queue.isEmpty()) { System.out.println(queue.poll()); }
		 */
		
		
		  while (B > 0) { Pair p = queue.poll(); Pair newPAir = new Pair(p.next,
		  (p.next - p.currentSum) + p.next); queue.offer(newPAir); B--; }
		 

		System.out.println(queue);
		
		/*
		 * int ans = 0; while (!queue.isEmpty()) { ans = queue.poll().currentSum; }
		 */

	}
}

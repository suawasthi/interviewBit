package test;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ParkingSlot {

	public static void main(String[] args) {
		PriorityQueue<Pair> queue = new PriorityQueue<ParkingSlot.Pair>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				if(o1.end > o2.end) return 1;
				if(o1.end==o2.end) {
					if(o1.start > o2.start) return 1;
					return -1;
				}
				return -1;
			}
		});
		
		int[][] input = {{5, 10},  {0,20}, {25,40}, {35,45}};
		for(int i=0;i<input.length;i++) {
			queue.add(new Pair(input[i][0], input[i][1]));
		}
		
		System.out.println("asdfdsa");
		Queue<Pair> backUp = new LinkedList<ParkingSlot.Pair>();
		int ans=0;
		while(!queue.isEmpty()) {
			ans++;
			Pair p = queue.poll();
			while(!queue.isEmpty()) {
			Pair next =queue.peek();
				if(next.start >= p.end) {
					queue.poll();
					p=next;
					next=queue.peek();
					
				}else {
					backUp.offer(next);
					queue.poll();
				}
			}
			queue.addAll(backUp);
			backUp.clear();
			
		}
		System.out.println(ans);
		
		
		
	}

	static class Pair {
		int start;
		int end;

		Pair(int x, int y) {
			this.start = x;
			this.end = y;
		}

	}
}

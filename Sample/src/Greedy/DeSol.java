package Greedy;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DeSol {

	public static void main(String[] args) {

		Deque<Integer> dqueue = new LinkedList<Integer>();
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((o1, o2)->  {
			if(o1 > o2) {
				return 1;
			}else {
				return -1;
			}
		
		});
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((o1, o2) ->{
			if(o1 < o2) {return 1;}
			else {
				return -1;
			}
		});
		
		maxHeap.add(1);
		maxHeap.add(23);
		maxHeap.add(2);
		
		minHeap.add(1);
		minHeap.add(23);
		minHeap.add(2);
		while(!maxHeap.isEmpty()) {
		System.out.println("max " + maxHeap.poll());
		}
		
		while(!minHeap.isEmpty()) {
			System.out.println("min " + minHeap.poll());
			}
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(0, 3);
		System.out.println(arrayList.toString());
	}
}

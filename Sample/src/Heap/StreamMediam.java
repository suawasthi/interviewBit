package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class StreamMediam {

	public static void main(String[] args) {

		PriorityQueue<Integer> lower = new PriorityQueue<Integer>(
				(o1, o2)->{
						if(o2 > o1) return 1;
						else
							return -1;
				}
				); // max Heap which us not default;
		PriorityQueue<Integer> higher = new PriorityQueue<Integer>(); // min heap default
		int[] input = {5, 17, 100, 11};
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			int number = input[i];
			addtoHeap(number, lower, higher);
			adjustHeap4Size(lower, higher);
			result.add(getMedian(lower, higher));
		}

		
		System.out.println(result.toString());
	}

	private static Integer getMedian(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
		PriorityQueue<Integer> smallerQueue = lower.size() < higher.size() ? lower : higher;
		PriorityQueue<Integer> biggerQueue = lower.size() < higher.size() ? higher : lower;
		
		if(smallerQueue.size()==biggerQueue.size()) {
			return  lower.peek();
		}else {
			return biggerQueue.peek();
		}
		
	}

	private static void adjustHeap4Size(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
		PriorityQueue<Integer> smallerQueue = lower.size() < higher.size() ? lower : higher;
		PriorityQueue<Integer> biggerQueue = lower.size() < higher.size() ? higher : lower;
		
		if(biggerQueue.size() - smallerQueue.size() >=2) {
			smallerQueue.add(biggerQueue.poll());
		}			
	}

	private static void addtoHeap(int number, PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
		if (lower.size() == 0 || number < lower.peek()) {
			lower.offer(number);
		} else {
			higher.offer(number);
		}

	}

}

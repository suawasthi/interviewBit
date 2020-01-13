package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingBElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  A = {1, 2, 3, 4, 5};
		int  B = 3;
		System.out.println(Arrays.toString(solve(A, B)));
	}

	public static int[] solve(int[] A, int B) {
		int ans = 0;
		
		if(A.length<0) {
			return new int[] {};
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		// populate your queue
		for (int i = 0; i < A.length; i++) {
			queue.add(A[i]);

		}

		// stack

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < B; i++) {
			stack.push(queue.peek());
			queue.remove();
		}

		while (!stack.isEmpty()) {
			queue.add(stack.peek());
			stack.pop();
		}
		for (int i = 0; i < A.length - B; i++) {
			queue.add(queue.peek()); 
			queue.remove();
		}
		int[] answe = new int[A.length];
		int i=0;
		while (!queue.isEmpty()) {
			answe[i++]=queue.poll();
		}

		return answe;
	}

}

package Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Containing1_2_3 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solve(20)));
	}

	public static int[] solve(int A) {
		int[] result = new int[A];
		int i = 0;
		int nos = 1;
		Queue<Integer> q = new LinkedList<Integer>();
	
		Deque<Integer> deque = new LinkedList<Integer>();
		while (i < 3 && i < A) {
			deque.addLast(nos);
			result[i++]=nos;
			nos++;
			deque.remove()
		
		}
		int base=1;
		int temp=i;
		for (int j = i; j < result.length; j++) {
			int k=0;
			int L=deque.poll();
			nos=0;
			while(k < 3 && temp < A) {
				int no= (int) ((Math.pow(10, 1) * L)+ ++nos); 
				deque.addLast(no);
				result[temp++]=no;
				k++;
			}
			
		}
		return result;

	}

}

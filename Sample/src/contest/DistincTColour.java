package contest;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class DistincTColour {
	
	public static void main(String[] args) {
		 int[] A= {1, 2, 1, 3, 4, 3};
		 int B=3;
		 ArrayList<Integer> a = new ArrayList<Integer>();
		 Deque<Integer> dq = new LinkedList<Integer>();
		 for (int i = 0; i < B; i++) {
			dq.add(A[i]);
			
		}
		findDistinct(dq);
		for (int i = B; i < A.length; i++) {
			dq.removeFirst();
			dq.addLast(A[i]);
			findDistinct(dq);
		} 
		System.out.println(result);
		 
		Integer[] res= new Integer[B];
		res=(Integer[]) result.toArray();
	}
	static ArrayList<Integer> result = new ArrayList<Integer>();
	private static void findDistinct(Deque<Integer> dq1) {
		Deque<Integer> dq2=new LinkedList<Integer>(dq1);
	
		Set<Integer> set = new HashSet<Integer>();
		while(!dq2.isEmpty())
		if(set.add(dq2.poll())) {
		}
		
		result.add(set.size());
		
	}

}

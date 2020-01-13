package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class CoursePrereqiste {

	public static void main(String[] args) {
		int A = 4;
		int B[]=  { 1, 2, 3 };
		int C[]=  { 2, 3, 4 };
		System.out.println(solve(A, B, C));
	}
	public static  int solve(int A, int[] B, int[] C) {
		
		int[] indegress = new int[A+1];
		for (int i = 0; i < C.length; i++) {
			indegress[C[i]]++;
		}
		Queue<Integer> queue= new LinkedList<Integer>();
		for (int i = 1; i < indegress.length; i++) {
			if(indegress[i] ==0) queue.offer(i);
		}
		
		while(!queue.isEmpty()) {
			
			int x= queue.poll();
			for (int i = 0; i < C.length; i++) {
				if(B[i]==x) {
					indegress[C[i]]--;
					if(indegress[C[i]]==0) {
						queue.offer(C[i]);
					}
				}
			}
			
			
			
		}
		for (int i = 1; i < indegress.length; i++) {
			if(indegress[i]==0) {continue;}
			System.out.println("false");
			return 0;
		}
		
		return 1;
	}

}

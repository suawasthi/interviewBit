package TreeNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class Dijikstra {

	public static void main(String[] args) {
		int[][] input = { { 0, 4, 9 }, { 3, 4, 6 }, { 1, 2, 1 }, { 2, 5, 1 }, { 2, 4, 5 }, { 0, 3, 7 }, { 0, 1, 1 },
				{ 4, 5, 7 }, { 0, 5, 1 } };
		int nos = 6;
		int ans[] = new int[10];
		Arrays.fill(ans, Integer.MAX_VALUE);
		int c = 4;
		PriorityQueue<custom> queue = new PriorityQueue<Dijikstra.custom>(new Comparator<custom>() {
			public int compare(custom c1, custom c2) {
				if (c1.weight > c2.weight)
					return 1;
				return -1;
			}
		});
		
		for (int i = 0; i < input.length; i++) {
			if(input[i][1]==c || input[i][0]==c) 
				queue.offer(new custom(input[i][0], input[i][1], input[i][2]));
		}
		Set<Integer> visited = new HashSet<Integer>();
		visited.add(c);
		
		while(!queue.isEmpty()){
			
			custom custo = queue.poll();
			int source = custo.node2;
			int destination = custo.node1;
			int weight=custo.weight;
			ans[destination]= Math.min(weight, ans[destination]);
			for (int i = 0; i < input.length; i++) {
				if(input[i][0]== destination && !visited.contains(input[i][1])) 
					queue.offer(new custom(input[i][0], input[i][1], input[i][2] + weight));
			}
			visited.add(destination);
			
		}
		System.out.println(Arrays.toString(ans));
	}

	
	
	
	
	
	
	
	
	static class custom {

		int node1;
		int node2;
		int weight;

		public custom(int node1, int node2, int weight) {
			super();
			this.node1 = node1;
			this.node2 = node2;
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "custom [node1=" + node1 + ", node2=" + node2 + ", weight=" + weight + "]";
		}
		
	}

}

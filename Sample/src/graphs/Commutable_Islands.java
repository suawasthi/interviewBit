package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
		Graph[] graphs = new Graph[B.length];
		for (int i = 0; i < graphs.length; i++) {
			graphs[i]= new Graph(B[i][0], B[i][1], B[i][2]);
		}
		
		PriorityQueue<Graph>  queue = new PriorityQueue<Commutable_Islands.Graph>(new Comparator<Graph>() {
			@Override
			public int compare(Graph g1 , Graph g2) {
				if(g1.cost > g2.cost) return 1;
				return -1;
			}
			
		});
		for (int i = 0; i < graphs.length; i++) {
			queue.offer(graphs[i]);
		}
		int[] visited = new int[A+1];
		Arrays.fill(visited, Integer.MAX_VALUE);
		while(!queue.isEmpty()) {
			Graph temp =queue.poll();
			visited[temp.vertex2] = Math.min(visited[temp.vertex2], temp.cost);
		}
		System.out.println(Arrays.toString(visited));
		return 1;
	}
	
	static class Graph{
		
		int vertex1;
		int vertex2;
		int cost;
		Graph(int ver, int ver1, int cost){
			this.vertex1=ver;
			this.vertex2=ver1;
			this.cost=cost;
		}
		
		
	}

	

}

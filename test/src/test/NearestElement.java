package test;

import java.util.LinkedList;
import java.util.Queue;

public class NearestElement {

	public static void main(String[] args) {
		int A[][] = {{0, 0, 0, 1}, {0, 0, 1, 1}, {0, 1, 1, 0}};
		solve(A);

	}
	 public static  int[][] solve(int[][] A) {
	
		 int row= A.length;
		 int col =A[0].length;
		 for(int i=0;i<row;i++) {
			 for (int j = 0; j < col; j++) {
				if(A[i][j]==1 || A[i][j] < 0) continue;
				performBFS(i,j, A);
				
			}
		 }
		 
		 
		 
		 return null;
	 }
	private static void performBFS(int i, int j, int[][] grid) {
		int[] delX= {-1, 0, 1, 0};
		int[] delY= {0, -1, 0, 1};
		Queue<String> queue= new LinkedList<String>();
		queue.offer(String.valueOf(i) +"-"+ String.valueOf(j));
		while(!queue.isEmpty()) {
			String [] point= queue.poll().split("-");
			int x=Integer.valueOf(point[0]);
			int y=Integer.valueOf(point[1]);
			for(int j1=0;j1<4;j1++) {
				int x1=x+ delX[j];
				int y1=y+ delX[j];
				if(x1 >= 0  && x1 <=grid.length-1 && y1 >= 0 && y1 <= grid[0].length-1) {
					if(grid[x1][y1]==0) {
						
					}else {
						
					}
				}
				
				
				
			}
		}
		
		
	}
	

}

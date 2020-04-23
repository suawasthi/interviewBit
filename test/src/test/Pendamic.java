package test;

import java.util.Queue;

public class Pendamic {

	public static void main(String[] args) {
		int[][] input = {
				{0,0,1,0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,1,1,0,1,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,1,0,1,0,0},
				{0,1,0,0,1,1,0,0,1,1,1,0,0},
				{0,0,0,0,0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,0,0,0,0,0,0,1,1,0,0,0,0}
				};
		


		
		System.out.println(biggestHotspot(input));
	}

	static int biggestHotspot(int[][] grid) {
		
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j] ==1) {
					int currentMax= findOutBreak(i, j, grid);
					ans= Math.max(ans, currentMax);
				}
			}
		}
		return ans;
	}
	static class Pair{
		int row;
		int col;
		Pair(int x, int y){
			this.row=x;
			this.col=y;
		}
	}
	private static int findOutBreak(int row, int col, int[][] grid) {
		
		int x= row;
		int y=col;
		grid[x][y]=-1;
		int ans = 0;
		Queue<Pair> queue = new java.util.LinkedList<Pendamic.Pair>();
		queue.add(new Pair(x, y));
		int[] delX= {1, -1, 0, 0 };
		int[] delY= {0, 0 , 1, -1};
		int currentAns=0;
		while(!queue.isEmpty()) {
			
			Pair pair = queue.poll();
			for(int i=0;i<4;i++) {
				int x1= delX[i] + pair.row;
				int y1=delY[i] + pair.col;
				if(x1 >=0 && y1 >=0 && x1 < grid.length && y1< grid[0].length && grid[x1][y1]==1) {
					currentAns++;
					queue.offer(new Pair(x1, y1));
					grid[x1][y1]= -1;
				}
				
			}
			ans= Math.max(currentAns, ans);
		}
		
		
		return ans+1;
	}	
}

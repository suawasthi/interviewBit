package test;

public class PathFinders {

	public static void main(String[] args) {
		int[][] grid = { {0} };
		System.out.println(minPathSum(grid));
	}

	public static int minPathSum(int[][] grid) {

		int[][] dp = new int[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		System.out.println("ANS " + performBFS(grid, dp, 0, 0, 0));
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				System.out.print(dp[i][j]);
			}
			System.out.println();
		}
		return dp[dp.length-1][dp[0].length-1];
	}

	static int min = Integer.MAX_VALUE;

	public static int performBFS(int[][] grid, int[][] dp, int ans, int x, int y) {
		System.out.println(x +": - :"+ y);
		
		
		if (x == grid.length - 1 && y == grid[0].length - 1) {
			//min = Math.min(min, ans+ grid[x][y]);
			return grid[x][y];
			//return dp[x][y];
		}
		if(dp[x][y]!=Integer.MAX_VALUE) {
			return dp[x][y];
		}
		 int xl=Integer.MAX_VALUE;
		 int yl=Integer.MAX_VALUE;
		
		 if (x < grid.length-1)  xl = performBFS(grid, dp, ans + grid[x][y], x+ 1, y);
		if(y < grid[0].length-1 ) yl =performBFS(grid, dp, ans + grid[x][y], x, y + 1);
		
		dp[x][y]=Math.min(dp[x][y], Math.min(xl, yl)) + grid[x][y];
		
		return dp[x][y];
	}
}

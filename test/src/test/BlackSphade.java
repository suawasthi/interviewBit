package test;

import java.util.LinkedList;
import java.util.Queue;

public class BlackSphade {
	static int ans = 0;

	public static void main(String [] args) {
		int[][] A= {{0, 0, 1, 0, 1, 0, 1, 1, 1},
		            {0, 1, 0, 0, 1, 1, 1, 0, 1}
		};
		int ans=0;
        boolean[][] visited = new boolean[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==1 && !visited[i][j]){
                  ans++;
                  performBFS(A, visited, i, j);
                }
            }
        }
        
       System.out.println(ans);
        
    }

public static void performBFS(int[][] A, boolean visited[][], int m, int n){
        
        Queue<String> queue= new LinkedList<String>();
        queue.add(String.valueOf(m) +"-"+ String.valueOf(n));
        
        int dlX[]={-1, 0, 1, 0, -1, 1, 1,-1};
        int dlY[]={0, -1, 0, 1 , -1, 1, -1, 1};
        
        while(!queue.isEmpty()){
            String pair[] = queue.poll().split("-");
        
            int x= Integer.valueOf(pair[0]);
            int y=Integer.valueOf(pair[1]);
        
            for(int i=0;i< 8;i++){
                int dX=x + dlX[i];
                int dY=y + dlY[i];
                if(dX==1 && dY==0) {
                	System.out.println("insiide");
                }
                if(dX >=0 && dX < A.length && dY >=0 && dY < A[0].length &&  A[dX][dY]==1  && !visited[dX][dY]){
                   System.out.println(dX + ": + :" + dY);
                    visited[dX][dY] = true;
                    queue.add(String.valueOf(dX) +"-"+ String.valueOf(dY));
                }
            }
        }
        
    }

}

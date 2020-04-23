package test;

import java.util.PriorityQueue;
import java.util.Stack;

public class Amazingproblem {
	
	

    class Pair implements Comparable<Pair>  {
        int x;
        int y;
        int distace;
        public Pair(int x, int y, int distace){
            this.x=x;
            this.y=y;
            this.distace=distace;
        }
        
        public int compareTo(Pair p2){
            if(this.distace > p2.distace){
                return 1;
            }
            return -1;
            
        }

}
        
    
    
    
    public int[][] kClosest(int[][] points, int K) {
            PriorityQueue<Pair> queue= new PriorityQueue<Pair>();

    for(int i=0;i<points.length;i++){
                queue.offer(new Pair(points[i][0], points[i][1], points[i][1] * points[i][1] + points[i][0] * points[i][0]));
    }
    
    int[][] ans = new int[k][2];                 
    int l=0;
    while(!queue.isEmpty() && k > 0){
        Pair pair =queue.poll();
        ans[l][0]=pair.x;
        ans[l++][1]=pair.y;
        
    }                    
    return ans;                                                
    }
}

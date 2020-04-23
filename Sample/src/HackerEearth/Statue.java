package HackerEearth;

import java.util.LinkedList;
import java.util.Queue;

public class Statue {

	public static void main(String[] args) {
		int A[]= {8,8,5,1,1};
		int B[]= {65, 6, 46, 82, 28};
		solve(A, B);
	}


    public static int solve(int[] A, int[] B) {
        
        boolean[] dublicate = new boolean[A.length];
        int count=0;
        Queue<Integer> queue= new LinkedList();
        for(int i=1;i< A.length;i++){
            if(A[i-1]==A[i]){
                queue.offer(i-1);
                queue.offer(i);
                
                dublicate[i-1]=true;
                dublicate[i]=true;
                count+=2;
            }
        }
        int ans=Integer.MAX_VALUE;
        
        count= count*2;
        while(!queue.isEmpty()){
          
           int polled= queue.poll();
          int current =polled;
          // perform backward 
          
          int maxLoss= B[current] * 2;
          int currentLoss= B[current];
          int currentElement = A[current]+1;
          while(current > 0){
              if(currentElement ==A[current-1]){
                  currentLoss +=B[current-1];
                  if(currentLoss >= maxLoss){
                      currentLoss= maxLoss;
                      break;
                  }
              }else{
                  break;
              }
              current--;
          }
          
          int loss= currentLoss;
          // perform forward
          current=polled;
          currentLoss= B[current];
          currentElement = A[current]+1;
          while(current < A.length-1){
              if(currentElement ==A[current+1] ){
                  currentLoss +=B[current+1];
                  if(currentLoss >= maxLoss){
                      currentLoss= maxLoss;
                      break;
                  }
              }else{
                  break;
              }
           current++; 
          }
            
        
        
        ans= Math.min(currentLoss, ans);
        }
    return ans;
        
    }
    
    

}

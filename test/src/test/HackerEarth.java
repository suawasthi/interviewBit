package test;

import java.util.LinkedList;
import java.util.Queue;

public class HackerEarth {
	static int k=10;
	public static void main(String[] args) {
	
	char[][] input = {{'X','O','X'},{'O','X','0'},{'X','O','X'}};
	solve(input);
		
	}

    public static void solve(char[][] board) {
    	

    	public void solve(ArrayList<ArrayList<Character>> board) {
    	
        if(board.size()==0) return;
            
         int row= board.size()-1;
         int col =board.get(0).size()-1;
         
         for(int i=0;i<=col;i++){
             if(board.get(0).get(i)=='X' || board.get(0).get(i)=='Y' ) continue;
             performBFS(board, 0, i); // first row
           
         }
         for(int i=0;i<=col;i++){
             if(board.get(row).get(i)=='X' || board.get(row).get(i)=='Y') continue;
             performBFS(board, row, i);   // last row  
         }
         for(int i=0;i<=row;i++){
             if(board.get(i).get(0)=='X' || board.get(i).get(0)=='Y') continue;
             performBFS(board, i, 0);   // first col       
         }
         
         for(int i=0;i<=row;i++){
             if(board.get(i).get(col)=='X' || board.get(i).get(col)=='Y') continue;
            // System.out.println("eidher");
             performBFS(board, i, col);
           
         }
         for(int i=0;i<board.length;i++){
             for(int j=0;j<board[0].length;j++){
                 if(board.get(i).get(j)=='O'){
                     board.get(i).set(j, 'X');
                 }
                 if(board.get(i).get(j)=='Y'){
                     board.get(i).set(j, 'O');
                 }
             }
         }
           
            
        }
        public  void performBFS(ArrayList<Character>> board, int xi, int yj){
            
            int delX[]={-1, 0, 1, 0};
            int delY[]={0, -1, 0, 1};
            
            Queue<String> queue= new LinkedList();
            queue.offer(String.valueOf(xi) +"-"+ String.valueOf(yj));
            //System.out.println("inside");
            board.get(xi).set(yj, 'Y');
            while(!queue.isEmpty()){
                
                int size=queue.size();
                for(int i=0;i<size;i++){
                
                    String[] st= queue.poll().split("-");
                
                    int x = (int)Integer.valueOf(st[0]);
                    int y = (int)Integer.valueOf(st[1]);
                    board.get(x).get(y)='Y';
                    for(int j=0;j<4;j++){
                        int xN=x+ delX[j];
                        int yN=y+ delY[j];
                        if(xN >=0 && xN < board.size() && yN >=0  && yN <board.get(0).size() && board.get(xN).get(yN) !='X'  && board.get(xN).get(yN) !='Y' && board.get(xN).get(yN)=='O') {
                            board.get(xN).set(yN, 'Y');
                            queue.offer(String.valueOf(xN) +"-"+ String.valueOf(yN));   
                            //System.out.println("inside");
                        }
                        
                    }
                }
            }
            
            
        }    
    	

    
}

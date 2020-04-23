package HackerEearth;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Books {

	
	public static void main(String[] args) {

	      
        Scanner s = new Scanner(System.in);
        //String name = s.nextLine();                 
        int nosBooks = s.nextInt();
        int noOfChapter=s.nextInt();
        Deque<Integer> deque = new LinkedList<Integer>();
        for(int i=0;i<nosBooks;i++){
            int book = s.nextInt();
            deque.offer(book);
        }
        s.close();
        while(!deque.isEmpty()){
        if(deque.pol)
        }
        
        
    
	}
}

package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class windowSliding {

	public static void main(String[] args) {
		
		
		Integer[] in = {47, 71, 62, 71, 71, 71, 58, 62, 47, 71, 62, 71, 47, 47, 71, 58};
		ArrayList<Integer> A= new ArrayList();
		A.add(3);
		A.add(3);
		A.add(3);
		A.add(3);
		
		
		"suraj".chars().distinct().peek(ch->System.out.println(ch)).sorted();
		
		Iterator<Integer> it = A.iterator();
		
		
		
		int B=9;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Deque<Integer> queue = new LinkedList<Integer>();
       
        int count=0;
        for(int i=0; i<B;i++){
            if(map.get(A.get(i))==null){
                queue.offer(A.get(i));
                map.put(A.get(i), 1);
                count++;
            }else {
            queue.offer(A.get(i));
            map.put(A.get(i), map.get(A.get(i)) +1);
            }
            
        }
        
        ArrayList<Integer> ans = new ArrayList();
        ans.add(count);
        for(int i=B;i<A.size(); i++){
            System.out.println(A.get(i) + ": :"+ queue);
            int toRemoved = queue.pollFirst();
            if(map.get(toRemoved) <= 1){
                map.remove(toRemoved);
                count--;
            }else{
                map.put(toRemoved, (map.get(toRemoved)-1));
            }
            if(map.get(A.get(i))==null){
                queue.add(A.get(i));
                map.put(A.get(i), 1);
                count++;
            }else{
            	queue.add(A.get(i));
                map.put(A.get(i), map.get(A.get(i))+1);
            }
            ans.add(count);
        }
        System.out.println(ans);
        
    
		
		
	}

}

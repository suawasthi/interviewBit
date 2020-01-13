package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class Test1 {
	static class Pair{
		int x;
        int y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
	}
	private static final String[] A = null;

	public static void main(String[] args) {
	
		int x[]= {3,1,1};
		Pair[] pair = new Pair[x.length];
		int y[]= {25,10,1};
		
		for (int i = 0; i < y.length; i++) {
			pair[i]= new Pair(x[i], y[i]);
		}
		PriorityQueue<Integer> queue= new PriorityQueue<Integer>(new Comparator<Integer>(){
	           int compare(int o1, int o2){
	               if(o2 > o1) return 1;
	               else{
	                   return -1;
	               }
	           }

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			} 
	        });
	        
	        
	        for(int i=0;i<A.length;i++){
	             queue.offer(Integer.valueOf(A[i]));
	        }
		
		System.out.println(pair);
		
	}

	 public static String[] solve(String[] A, String B, int[][] C) {
	        
	        String[] ans = new String[C.length];
	        Map<Character, Integer> map[] = new Map[A.length];
	        populateMap(map, A);
	        for(int l= 0;l<C.length;l++){
	            
	            for(int i=0;i<A.length;i++)
	            {
	                if(checkBExist(map[i],  A[i], C[l][1] ,  B)){
	                    if(performStringMatch(A[i], C[l][0]-1)){
	                     ans[l]=A[i];
	                     break;
	                    }
	                }
	            }
	            
	        }
	        return ans;
	    }
	    public  static void populateMap(Map<Character, Integer> map[] , String[] A ){
	        
	        for(int i=0;i<A.length;i++){
	            map[i]= new HashMap<Character, Integer>();
	            for(int j=0;j<A[i].length();j++){
	                if(map[i].get(A[i].charAt(j))!=null){
	                map[i].put(A[i].charAt(j),map[i].get(A[i].charAt(j)) +1);
	                }else{
	                    map[i].put(A[i].charAt(j),1);
	                }
	            }
	        }
	        
	        
	    }
	    public static  Boolean checkBExist(Map<Character, Integer> map, String str, int len, String B){
	        if(str.length()==0) return false;
	        Character c = B.charAt(0);
	        if(map.get(c)!=null && map.get(c)==len){
	            return true;
	        }else {
	            return false;
	        }
	   
	    }
	    public static Boolean performStringMatch(String str, int len){
	        
	        int currentlen =len;
	        for(int i=1;i<str.length();i++){
	        	int a=str.charAt(i-1);
	            if(Character.getNumericValue(str.charAt(i-1))+1 == Character.getNumericValue(str.charAt(i) )){
	                currentlen--;
	            }else{
	                currentlen=len;
	            }
	            if(currentlen==0){
	                return true;
	            }
	        }
	        return false;
	    } 
}
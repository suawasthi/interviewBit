package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class AmazingString {
	public static void main(String[] args) {
		int in[] = {1,8};
		//6 2 5 2
		//int X, int[] arr, int k1, int k2
		System.out.println(minimumJumps(6, in, 5, 2));
	}
	 static boolean  ans=false;
	 public static int sequence(int[] a) {
			Map<Integer, Integer> map[]= new Map[a.length];
			int res=2;
			for (int i = 0; i < a.length; i++) {
				map[i]= new HashMap<Integer, Integer>();
				for (int j = 0; j < i; j++) {
					int diff= a[i]-a[j];
					map[i].put(diff, map[j].getOrDefault(diff, 1)+1);
					res= Math.max(res, map[i].get(diff));
				}
			}
			return res;
		}
	 
	 static int minimumJumps(int X, int[] arr, int k1, int k2){

		 Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		return minimumJumps(X, set, k1, k2, 0, k1, true);
	 
	   }
	 static boolean ans1=false;
	 static int minimumJumps(int X, Set<Integer> set, int k1, int k2, int jump , int current , boolean backward){
		if(ans1) return jump;
		// if(set.contains(current)) return 0;
		//if(current <= 0) return Integer.MAX_VALUE;
		//if(current > X ) return Integer.MAX_VALUE; 
		
		 if(current > X && !backward) return 0;
		if(current == X) {
			ans1 =true;
			return jump;
		}
		
		if(current> X || set.contains(current)) {			
			return minimumJumps(X,set, k1, k2, jump+1, current - k2, false);
		}
		int jum=minimumJumps(X,set, k1, k2, jump+1, current + k1, true);
		if(jum==0 && backward) {
			//return minimumJumps(X,set, k1, k2, jump+1, current - k1, true);
		}
		return jum;
	 }
	 
	 static long solve(int N,int[] T){
	        
		 int start=0;
		 int end=0;
		 int currentMin=T[0];
		 int sum=0;
		 
		 for (int i = 1; i < T.length; i++) {
			if(currentMin > T[i]) {
				sum += Math.abs(i-start) *currentMin;
				start=i;
				currentMin=T[i];
			}
			if(i==T.length-1) {
				sum += Math.abs(T.length-start) *currentMin;
			}
		}
	    
		 return sum;
	    }
}

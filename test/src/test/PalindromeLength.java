package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PalindromeLength {

	
	static class Pair{
		int index;
		int element;
		Pair(int x, int y){
			this.index=x;
			this.element=y;
		}
		@Override
		public String toString() {
			return "Pair [index=" + index + ", element=" + element + "]";
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr= "12345354987";
		ArrayList<Pair> pair = new ArrayList();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length(); i++) {
			pair.add(new Pair(i, Character.getNumericValue(arr.charAt(i))));
			if(map.get(arr.charAt(i))!=null) {
			map.put(arr.charAt(i), map.get(arr.charAt(i))+1);
			}else {
				map.put(arr.charAt(i), 1);
			}
		}
		
			
		int[][] dp = new int[arr.length()][arr.length()];
		
		for (int i = 0; i < dp.length; i++) {
			int count=0;
			if(map.get(arr.charAt(i)) !=null && map.get(arr.charAt(i)) %2 !=0) {
				count=map.get(arr.charAt(i))-1;
				
			}else {
				count=map.get(arr.charAt(i));
			}
			for (int j = 0; j < dp.length; j++) {
					if(arr.charAt(i)==arr.charAt(j) && count >0) {
						dp[i][j]=1;
						count--;
					}else if (i>0 &&dp[i-1][j]==1){
						dp[i][j]=1;
					}
				
			}
		}
		
		int ans =Integer.MIN_VALUE;
		for (int i = 0; i < dp.length; i++) {
			int cointOne=0;
			for (int j = 0; j < dp.length; j++) {
				if(dp[i][j]==1) {cointOne++;}
				else {
					ans=Math.max(ans, cointOne);
					cointOne=0;
				}
				ans=Math.max(ans, cointOne);
			}
		}
		System.out.println(ans);
	}

}

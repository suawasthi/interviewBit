package Strings;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
			System.out.println(romanToInt("MDCCCIV"));
	}
		public static int romanToInt(String A) {
			
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			map.put("M", 1000);
			map.put("CM", 900);
			map.put("D", 500);
			map.put("CD", 400);
			map.put("C", 100);
			map.put("XC", 90);
			map.put("L", 50);
			map.put("XL", 40);
			map.put("X", 10);
			map.put("IX", 9);
			map.put("V", 5);
			map.put("IV", 4);
			map.put("I", 1);
			StringBuilder s = new StringBuilder();
			int num=0;
			
			int i=0, j=1;
			
			while(i<=A.length() && j<=A.length()) {
				
				if(j+1 <= A.length() && map.get(A.substring(i, j+1))!=null ) {
					num +=map.get(A.substring(i, j+1));
					i=i+2;
					j=j+2;
					
				}
				else if(map.get(A.substring(i, j))!=null) {
					num +=map.get(A.substring(i, j));
					i++;
					j++;
				}
			}
			
	
			return num;
			
	    }

}

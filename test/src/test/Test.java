package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] inStrings = {"dog", "tea", "god","ate"};
		String[] inStrings= {"b", "b", "b", "a", "a", "b", "b", "b", "a", "b", "b", "a", "b", "b", "a", 
				"a", "a", "a", "b", "b", "b", "a", "a", "b", "b", "a", "a", "a", "b", "b", "b", "a", "a", "b",
				"a", "a", "b", "b", "b", "b", "a", "a", "a", "a", "b", "b", "b", "a", "b", "a", "a", "a", "a", 
				"b", "a", "b", "a", "b", "b", "a", "a", "a", "b", "b", "a", "a", "b", "b", "b", "b", "b", "b", "b",
				"a", "a", "b", "a", "a", "b", "a", "a", "a" };
		findAnagrams(inStrings);
	}
	
	
	public  static void findAnagrams(String[] strings) {
		Map<String, Set<Integer> > map = new HashMap();
		int i=0;
		for(String currentString : strings){
			char[] c=currentString.toCharArray();
			Arrays.parallelSort(c);
			String str= String.valueOf(c);
			if(map.get(str)==null) map.put(str, new HashSet());
			map.get(str).add(i+1);
			i++;

		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for(Map.Entry<String, Set<Integer>> map1 : map.entrySet()) {
			Set<Integer> set = map1.getValue();
			ArrayList<Integer> a1 = new ArrayList<Integer>(map1.getValue());
			Collections.sort(a1);
			ans.add(a1);
		}
		System.out.println(ans);
	}
	
	public static String getString(String a) {
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		stack.push("integer");
		int i= a.length()-2;
		while(!stack.isEmpty() && i>=0) {
			
		if(a.charAt(i)=='p') {
			
			String firstPeek= stack.pop();
			String secPeek =stack.pop();
			String newString = "pair(" + firstPeek + ","+ secPeek +")" ;
			stack.push(newString);
		}else {
			stack.push("integer");
		}
		i--;
			
			
			
			
		}
		return stack.pop();
	}

}

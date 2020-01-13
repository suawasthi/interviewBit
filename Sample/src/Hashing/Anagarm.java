package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Anagarm {

	public static void main(String[] args) {
		List<String> dtr= new ArrayList<String>();
		dtr.add("cat");
		dtr.add("dog");
		dtr.add("god");
		dtr.add("tca");
		System.out.println(anagrams(dtr));
	}
	public static  ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
		
		LinkedHashMap<String,ArrayList<Integer>> map = new LinkedHashMap<String, ArrayList<Integer>>();
		
		for (int i = 0; i < A.size(); i++) {
			char[] s= A.get(i).toCharArray();
			Arrays.parallelSort(s);
			String d= String.valueOf(s);
			
			ArrayList<Integer> a = new ArrayList<Integer>();
			if (map.get(d)!=null) {
				a=map.get(d);
				a.add(i+1);
				map.put(d, a);
			}else {
				a.add(i+1);
				map.put(d, a);
			}
		}
		ArrayList<ArrayList<Integer>>  res = new ArrayList<ArrayList<Integer>>();
		for (Map.Entry<String, ArrayList<Integer>> entry: map.entrySet() ) {
			res.add(entry.getValue());
		}
		
		
		return res;
    }

}

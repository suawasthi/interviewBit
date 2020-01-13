package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Subset {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
	
		a.add(2);
		a.add(2);
	
		// 15, 20, 12, 19, 4 
		Collections.sort(a);
		ArrayList<Integer> nos = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		nos = new ArrayList<Integer>(a);
		if(a.size()==1 && a.get(0)==null) {
			res.add(new ArrayList<Integer>());
			System.out.println(res);;
		}
		Set<ArrayList<Integer>> res1 = new HashSet<ArrayList<Integer>>();
		ArrayList<Integer> n = new ArrayList<Integer>();
		print(a, n, res1, 0);

		ArrayList<ArrayList<Integer>> res12 = new ArrayList<ArrayList<Integer>>(res1);
		System.out.println(res12);
	}


	static void print(ArrayList<Integer> originalNumber, ArrayList<Integer> newSub, Set<ArrayList<Integer>> result, int startindex) {
		result.add(new ArrayList<Integer>(newSub));
		for (int i = startindex; i < originalNumber.size(); i++) {
			newSub.add(originalNumber.get(i));
			print(originalNumber, newSub, result, i+1);
			newSub.remove(newSub.size()-1);
		}

	}

}

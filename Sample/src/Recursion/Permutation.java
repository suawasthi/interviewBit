package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(1);
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> a1= permute1(a,0, a.size()-1,res );
		System.out.println(a1.toString());
		
	}

	public static ArrayList<ArrayList<Integer>> permute1(ArrayList<Integer> a, int l, int r, ArrayList<ArrayList<Integer>> res) {
		if (l == r) {
			res.add(new ArrayList<Integer>(a));
			
		} else {
			
			for (int i = l; i <=r; i++) {
				if(possible( a, l, i)) {
				a=swap(a, l, i);
				permute1(a, l+1, r, res);
				a=swap(a, l, i);
				}
			}
		}
		return res;
	}

	private static boolean possible(ArrayList<Integer> a, int l, int curr) {
		for (int i = l; i < curr; i++)  
	        if (a.get(i) == a.get(curr)) 
	            return false; 
	    return true; 
	}

	public static ArrayList<Integer> swap(ArrayList<Integer> a, int l, int j) {
		int temp;
		temp = a.get(l);
		a.set(l, a.get(j));
		a.set(j, temp);
	
		return a;
	}

}

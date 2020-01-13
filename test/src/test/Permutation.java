package test;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {		
		
		
		ArrayList<Integer> current = new ArrayList<Integer>();
		current.add(1);
		current.add(2);
		current.add(3);
		permutation( 0, current);
		System.out.println(ans);

	}
	static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	public static void permutation( int start, ArrayList<Integer> input ) {
		if(start >=input.size()) {
			ans.add(new ArrayList<Integer>(input));
			return;
		}
		
		for (int i = start; i < input.size(); i++) {
			System.out.println("Start: " + start +": :"+ i);
			swap(input, start, i);
			permutation( start+1, input);
			swap(input, start, i);
		}
		//return;
	}
	public static void swap(ArrayList<Integer> current, int i , int j) {
		int temp = current.get(i);
		current.set(i, current.get(j));
		current.set(j, temp);
	}

}

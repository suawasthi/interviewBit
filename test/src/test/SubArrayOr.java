package test;

import java.util.ArrayList;

public class SubArrayOr {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(input[0]);
		for (int i = 1; i < input.length; i++) {
			arr.add(arr.get(arr.size()-1) | input[i]);
		}
		System.out.println(arr);
		for (int i = 0; i < input.length; i++) {
			for(int j=0;j<input.length;j++) {
				arr.set(j, arr.get(j) ^ input[i]);
			}
			
			System.out.println(arr);
		}	
		
	}
}

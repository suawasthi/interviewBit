package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sweetdish {
	public static void main(String[] args) {
		int[] A = { 2, 2, 4, 5 };
		int B = 3;
		int C = 7;
		solve(A, B, C);
	}

	public static int solve(int[] A, int B, int C) {

		getrateSet(A, 0, new ArrayList<Integer>());
		System.out.println(arr);
		int[] prime = performsieveofEerothesis(A);

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] >= 0) {
				set.add(prime[i]);
			}
		}
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < arr.size(); i++) {
			boolean isPrime=false;
			int sum =0;
			for (int j = 0; j < arr.get(i).size(); j++) {
				sum += arr.get(i).get(j);
				if(!isPrime && set.contains(arr.get(i).get(j))) {
					isPrime=true;
				}
			}
			if(isPrime && sum >= B && sum <=C) {
				ans.add(arr.get(i));
			}
		}
		
		System.out.println(ans);
		return 1;
	}

	static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

	private static void getrateSet(int input[], int k, ArrayList<Integer> current) {
		arr.add(new ArrayList<Integer>(current));
		if (k >= input.length) {
			current = new ArrayList<Integer>();
		}
		for (int i = k; i < input.length; i++) {
			current.add(input[i]);
			getrateSet(input, i + 1, current);
			current.remove(current.size() - 1);
		}

	}

	private static int[] performsieveofEerothesis(int[] a) {
		int arr[] = { 2, 3, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] > 0 && a[j] != arr[i] && a[j] % arr[i] == 0) {
					a[j] = -a[j];
				}
			}

		}
		return a;
	}
}

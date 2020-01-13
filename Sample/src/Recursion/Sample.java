package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        Integer[] a = A.toArray(new Integer[A.size()]);  
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res= permute(a, 0, A.size()-1, res);
        return res;
    }
    public static ArrayList<ArrayList<Integer>> permute(Integer[] a, int l, int r, ArrayList<ArrayList<Integer>> res) {
		if (l == r) {
			res.add((ArrayList<Integer>) Arrays.asList(a));
		} else {
			for (int i = l; i <=r; i++) {
				a=swap(a, l, i);
				permute(a, l+1, r, res);
				a=swap(a, l, i);
			}
		}
		return res;
	}

	public static Integer[] swap(Integer[] a, int l, int j) {
		int temp;
		temp = a[l];
		a[l] = a[j];
		a[j] = temp;
		return a;
	}
}

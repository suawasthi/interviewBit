package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxDistance {

	public static void main(String[] args) {

		List<Integer> ans = new ArrayList<Integer>();
		ans.add(100);
		ans.add(100);
		ans.add(100);
		ans.add(100);
		ans.add(100);
		maximumGap(ans);
	}
	static class Pair{
		Integer element;
		Integer index;
		Pair(int element, int index){
			this.element=element;
			this.index=index;
		}
	}
    public static int maximumGap(final List<Integer> A) {
    	Pair[] pairs = new Pair[A.size()];
    	for (int i = 0; i < A.size(); i++) {
			pairs[i]= new Pair(A.get(i), i);
		}
    	Arrays.parallelSort(pairs, new Comparator<Pair>() {

		public int compare(Pair p1, Pair p2) {
		
			if(p1.element > p2.element) return 1;
			else {
				return -1;
			}
		}
    	});

    	int[] maxIndex = new int[pairs.length];
    	maxIndex[pairs.length-1]= pairs[pairs.length-1].index;
    	for (int i = pairs.length-2; i >=0; i--) {
    		maxIndex[i]= Math.max(pairs[i].index, maxIndex[i+1]);
		}
    	
    	int ans=0;
    	for (int i = 0; i<pairs.length;i++) {
    		int current =0;
    		if(maxIndex[i]!= pairs[i].index) {
    			current = Math.abs(pairs[i].index-maxIndex[i]);
    		}
    		
    		ans = Math.max(ans,   current);
		}
    	
    	System.out.println(ans);
    
    	
    	return 1;
    }

}

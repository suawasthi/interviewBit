package test;

import java.util.Arrays;
import java.util.List;

public class maxUnsorted {
	public static void main(String[] args) {
		Integer[] input= {1, 3, 2, 4, 5};
		checkSorted(Arrays.asList(input));
	}
	public static int checkSorted(List<Integer> inpIntegers) {
		
		int min[] = new int[inpIntegers.size()];
		int max[] = new int[inpIntegers.size()];
		
		max[0]= inpIntegers.get(0);
		for (int i = 1; i < max.length; i++) {
			max[i]= Math.max(inpIntegers.get(i), max[i-1]);
		}
		min[min.length-1]=inpIntegers.get(inpIntegers.size()-1);
		for (int i = min.length-2; i >=0; i--) {
			min[i]=Math.min(inpIntegers.get(i), min[i+1]);
		}
		
		int minLe=max.length;
		int maxLe=0;
		Boolean sorted=true;
		for (int i = 0; i < max.length; i++) {
			if(inpIntegers.get(i)==min[i] && min[i]==max[i]) {
				continue;
			}else {
				sorted=false;
				minLe=Math.min(minLe, i);
				maxLe=Math.max(maxLe, i);
				
			}
		}
		System.out.println(minLe);
		System.out.println(maxLe);
		return 1;
	}
}

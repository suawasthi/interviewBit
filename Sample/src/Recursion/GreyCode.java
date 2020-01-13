package Recursion;

import java.util.ArrayList;
import java.util.BitSet;

public class GreyCode {

	public static void main(String[] args) {
		int num = 4;
		int number = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(1);
		int base= (int)Math.pow(2, 2);

		greyGenerator(a, 1, base);
		System.out.println(a);
		
	}

	public static void greyGenerator(ArrayList<Integer> now, int current, int base) {
		if(now.size()==base) {
			return;
		}
		
		int size = now.size();
		for (int j = size-1 ; j >= 0; j--) {
			now.add(now.get(j));
		}
		int add=1<<current;
		int j = (now.size() / 2);
		for (; j < now.size(); j++) {
			now.set(j, now.get(j) + (add));
		}
		
		greyGenerator(now, current+1, base);

	}

}

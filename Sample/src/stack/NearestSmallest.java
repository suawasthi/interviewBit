package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NearestSmallest {

	public static void main(String[] args) {
		Integer[] A= {4, 5, 1, 10,56,2,456,1,45, 1};
		System.out.println(prevSmaller(Arrays.asList(A)));
	}

	public static ArrayList<Integer> prevSmaller(List<Integer> A) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (A.size()<0) {
			return new ArrayList<Integer>();
		}
		java.util.Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < A.size(); i++) {
			
			while (!stack.isEmpty() && stack.lastElement() >=A.get(i)) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				result.add(-1);
			}
			else {
				result.add(stack.lastElement());
			}
			
			stack.push(A.get(i));
						
		}
	return result;	
	}
}

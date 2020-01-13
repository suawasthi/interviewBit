package stack;

import java.util.ArrayList;
import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<String>();
		A.add("2");
		A.add("1");
		A.add("+");
		A.add("3");
		A.add("*");
		System.out.println(evalRPN(A));
	}

//"4", "13", "5", "/", "+"
	public static int evalRPN(ArrayList<String> A) {
		int ans = 0;
		Stack<String> stac = new Stack<String>();

		for (int i = A.size() - 1; i >= 0; i--) {
			if (stac.isEmpty()) {
				stac.add(A.get(i));
				continue;
			}
			if (!stac.isEmpty()) {
				if (A.get(i).equals("/") || A.get(i).equals("-") || A.get(i).equals("*") || A.get(i).equals("+")) {
					stac.add(A.get(i));
				} else {

					while(stac.lastElement() != "/" && stac.lastElement() != "+" && stac.lastElement() != "-"
							&& stac.lastElement() != "*") {

						Integer lastelement = Integer.valueOf(stac.pop());
						if (stac.isEmpty()) {
							stac.push(lastelement.toString());
							continue;
						}
						if (stac.lastElement().equals("/")) {
							Integer nos = Integer.valueOf(A.get(i)) / lastelement;
							stac.pop();
							stac.push(nos.toString());
						} else if (stac.lastElement().equals("*")) {
							Integer nos = Integer.valueOf(A.get(i)) * lastelement;
							stac.pop();
							stac.push(nos.toString());
						} else if (stac.lastElement().equals("-")) {
							Integer nos = Integer.valueOf(A.get(i)) - lastelement;
							stac.pop();
							stac.push(nos.toString());
						} else if (stac.lastElement().equals("+")) {
							Integer nos = Integer.valueOf(A.get(i)) + lastelement;
							stac.pop();
							stac.push(nos.toString());

						}

					} {
						stac.add(A.get(i));
					}
				}
			}

		}

		return Integer.valueOf(stac.lastElement());
	}
}

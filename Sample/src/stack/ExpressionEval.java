package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ExpressionEval {

	public static void main(String[] args) {
		// TODO Auto-g ArrayList<String> A = new ArrayList<String>();
		//ArrayList<String> A = new ArrayList<String>();
		String[] A= {"5", "1", "2", "+", "4", "*", "+", "3", "-"};
		System.out.println(evalRPN(Arrays.asList(A)));

	}

	public static int evalRPN(java.util.List<String> A) {
		if (A.size() == 0) {
			return 0;
		}
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < A.size(); i++) {
			if (isNumeric(A.get(i))) {
				stack.add(Integer.valueOf(A.get(i)));
			} else {
				if (A.get(i).equals("/") || A.get(i).equals("-") || A.get(i).equals("+") || A.get(i).equals("*")) {
					int operand1 = stack.lastElement();
					stack.pop();
					int operand2 = stack.lastElement();
					stack.pop();
					Integer newe = performCalc(operand1, operand2, A.get(i));
					stack.push(newe);

				} else {
					stack.add(Integer.valueOf(A.get(i)));

				}

			}
		}

		return Integer.valueOf(stack.lastElement());
	}

	private static Integer performCalc(int operand1, int operand2, String operator) {
		Integer nos = 0;
		if (operator.equals("/")) {
			nos = operand2 / operand1;
		} else if (operator.equals("*")) {
			nos = operand1 * operand2;
		} else if (operator.equals("-")) {
			nos = operand2 - operand1;
		} else if (operator.equals("+")) {
			nos = operand1 + operand2;
		}

		return nos;
	}

	public static boolean isNumeric(String strNum) {
		return strNum.matches("-?\\d+(\\.\\d+)?");
	}

}

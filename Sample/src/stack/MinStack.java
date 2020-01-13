package stack;

import java.util.Stack;

public class MinStack {
	
	public static void main(String[] args) {
		MinStack min= new MinStack();
		min.push(30);
		min.pop();
		min.pop();
	}
	MinStack() {
	stack = new Stack<Integer>();
	minStack = new Stack<Integer>();
}

static java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
static Stack<Integer>  minStack = new Stack<Integer>();

public static void push(int x) {
    
	stack.add(x);
	if (minStack.isEmpty()) {
		minStack.add(x);
	} else if (minStack.lastElement()> x) {
		minStack.add(x);
	}

    
}

public void pop() {
	int min = 0;
	if (!stack.isEmpty()) {
		min = stack.pop();
	}
	if (!minStack.isEmpty()  && min == minStack.lastElement()) {
		minStack.pop();
	}
}

public int top() {
    
	if (!stack.isEmpty()) {
		return stack.lastElement();
	}
	return -1;
    
    
}

public int getMin() {
    
	if (!stack.isEmpty() && !minStack.isEmpty()) {
		return minStack.lastElement();
	}
	return -1;
}
}

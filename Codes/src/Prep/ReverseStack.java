package Prep;

import java.util.Stack;

public class ReverseStack {
	public static void main(String gh[]) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println(stack);
		rev_stack(stack);
		System.out.println(stack);
	}

	static void insert_at_bottom(Stack<Integer> stack, int data) {
		if (stack.isEmpty()) {
			stack.push(data);
			return;
		}
		int temp = stack.pop();
		insert_at_bottom(stack, data);
		stack.push(temp);
	}

	static void rev_stack(Stack<Integer> stack) {
		if (stack.isEmpty())
			return;
		int temp = stack.pop();
		rev_stack(stack);
		insert_at_bottom(stack, temp);
	}
}

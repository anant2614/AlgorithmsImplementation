package Prep;

import java.util.Stack;

public class NGE {
	public static void main(String[] args) {
		int a[] = { 11, 13, 21, 3 };
		printNGE(a);
	}

	private static void printNGE(int[] a) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(-1);
		for (int i = a.length - 1; i >= 0; i--) {
			if (stack.isEmpty()) {
				stack.push(a[i]);
				continue;
			}
			int top = stack.peek();
			while (!stack.isEmpty() && top < a[i]) {
				stack.pop();
				if (!stack.isEmpty())
					top = stack.peek();
			}
			if (stack.isEmpty())
				System.out.println(-1);
			else
				System.out.println(stack.peek());
			stack.push(a[i]);
		}
	}
}

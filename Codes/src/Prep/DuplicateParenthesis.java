package Prep;

import java.util.Stack;

public class DuplicateParenthesis {
	public static void main(String hd[]) {
		String s = "((a+b)+(c+d))";
		System.out.println(checkDuplicate(s));
	}

	private static boolean checkDuplicate(String s) {
		if (s == null)
			return false;
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				char top = stack.pop();
				if (top == '(')
					return true;
				while (top != '(') {
					top = stack.pop();
				}
			} else
				stack.push(s.charAt(i));
		}
		return false;
	}
}

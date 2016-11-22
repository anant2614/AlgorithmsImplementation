package Prep;

import java.util.Stack;

public class Sortstack {
	public static void main(String gh[]) {
		Stack<Integer> stack = new Stack<Integer>();
		sort(stack);
		System.out.println(stack);
	}

	private static void sort(Stack<Integer> stack) {
		if(stack.isEmpty())
			return;
		int top = stack.pop();
		if(stack.peek()>top||stack.isEmpty()){
			stack.push(top);
		}
		else{
			int 
		}
	}
}

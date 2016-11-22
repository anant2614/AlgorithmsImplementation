package Prep;

import java.util.Stack;

public class MinRreversals {
	public static void main(String gjg[]){
		String s = "}{{}}}}}{{{{}}}}}{";
		Stack<Character> stack = new Stack<Character>();
		int close=0,open=0;
		stack.add(s.charAt(0));
		if(stack.peek()=='{')
			open++;
		else
			close++;
		for(int i=1;i<s.length();i++){
			if(stack.peek()=='{'&&s.charAt(i)=='}'){
				open--;
				stack.pop();
			}
			else{
				if(s.charAt(i)=='{')
					open++;
				else close++;
				stack.add(s.charAt(i));
			}
		}
		System.out.println();
		//take ceil of open/2 and add ceil of close/2
	}
}

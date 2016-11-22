package GeeksForGeeks;

import java.util.Stack;

public class BalancedParentheses {
	public static void main(String arg[]){
		String s="][";
		if(checkBlanced(s))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean checkBlanced(String s) {
		Stack<Character> stack=new Stack<Character>();
		int i=0;
		while(i<s.length()){
			if(s.charAt(i)=='(')
				stack.add(s.charAt(i));
			else if(s.charAt(i)=='{')
				stack.add(s.charAt(i));
			else if(s.charAt(i)=='[')
				stack.add(s.charAt(i));
			else if(s.charAt(i)==')'){
				if(stack.isEmpty())
					return false;
				else if(stack.peek()=='(')
					stack.pop();
				else
					return false;
			}
			else if(s.charAt(i)=='}'){
				if(stack.isEmpty())
					return false;
				if(stack.peek()=='{')
					stack.pop();
				else
					return false;
			}
			else if(s.charAt(i)==']'){
				if(stack.isEmpty())
					return false;
				else if(stack.peek()=='[')
					stack.pop();
				else
					return false;
			}
			i++;
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}
}

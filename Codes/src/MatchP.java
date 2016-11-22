import java.util.Stack;

public class MatchP {
	public static void main(String gh[]) {
		String s = "{}()";
		System.out.println(check(s));
	}

	private static boolean check(String s) {
		if (s.length() % 2 != 0)
			return false;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
				stack.push(s.charAt(i));
			else {
				if (!stack.isEmpty()) {
					if (s.charAt(i) == ')'&&stack.peek()!='(')
						return false;
					else if(s.charAt(i) == '}'&&stack.peek()!='{')
						return false;
					else if(s.charAt(i) == ']'&&stack.peek()!='[')
						return false;
					stack.pop();
				}
				else
				return false;
			}
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}
}

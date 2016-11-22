package GeeksForGeeks;

import java.util.Stack;

public class Parantheses {
	public static void main(String hj[]){
		String s="[()]{}{[()()]()}";
		char a[]=s.toCharArray();
		int flag=1;
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<a.length;i++){
			if(a[i]=='('||a[i]=='{'||a[i]=='[')
				stack.push(a[i]);
			else if(a[i]==')'||a[i]=='}'||a[i]==']'){
				if(stack.isEmpty()){
				   flag=0;
					break;
				}
				char c=stack.pop();
				if(c=='(')
					if(a[i]!=')'){
					flag=0;
						break;
					}
				if(c=='{')
					if(a[i]!='}'){
					flag=0;
						break;
					}
				if(c=='[')
					if(a[i]!=']'){
						flag=0;
						break;
					}
			}
		}
		if(!stack.isEmpty()||flag==0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}

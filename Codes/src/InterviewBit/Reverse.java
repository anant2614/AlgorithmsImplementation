package InterviewBit;

import java.util.Stack;

public class Reverse {
	public static void main(String ghg[]) {
		System.out.println(reverseWords(" the           sky is blue  "));
	}
	
	public static String reverseWords(String a) {
		Stack<String> stack = new Stack<String>();
		String ar[]=a.split(" ");
		for(int i=0;i<ar.length;i++){
			if(ar[i].length()!=0){
				stack.push(ar[i]);
			}
		}
		String s = new String();
		while(!stack.isEmpty()){
			s=s.concat(stack.pop());
			s=s.concat(" ");
		}
		s=s.trim();
		return s;
	}
}

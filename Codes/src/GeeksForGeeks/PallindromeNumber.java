package GeeksForGeeks;

import java.util.Stack;

public class PallindromeNumber {
	public static void main(String hj[]){
		Stack<Integer> stack=new Stack<Integer>();
		int n=99;
		int l=(int) (Math.log10(n))+1;
		int m=l;
		int flag=1;
		int mid=(l%2==0?l/2:l/2+1);
		while(n!=0){
			if(m>mid)
				stack.push(n%10);
			else if(m<=l/2)
			{
				int top=stack.pop();
				if(n%10!=top){
					flag=0;
					break;
				}
			}
			n=n/10;
			m--;
		}
		if(flag==1)
			System.out.println("YES");
		else 
			System.out.println("NO");
	}
}

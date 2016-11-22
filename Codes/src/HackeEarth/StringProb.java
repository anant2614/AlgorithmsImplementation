package HackeEarth;

import java.util.Scanner;
import java.util.Stack;

public class StringProb {
	public static void main(String jk[]){
		InputReader in=new InputReader(System.in);
		int n=in.readInt();
		String s=in.readString();
		int q=in.readInt();
		char a,b;
		for(int i=0;i<q;i++){
			a=in.readString().charAt(0);
			b=in.readString().charAt(0);
			char str[]=s.toCharArray();
			int f=0,l=0;
			for(int j=0;j<s.length();j++){
				if(str[j]==a)
					f++;
				else if(str[j]==b)
					l++;
			}
			System.out.println(f*l);
		}
	}
}

package HackerRank;

import java.util.Scanner;

public class PrisonerSweets {
	public static void main(String[] args) {
		PrisonerSweets ps=new PrisonerSweets();
		Scanner in=new Scanner(System.in);
		boolean flag=false;
		int t=in.nextInt();
		int p[]=new int[t];
		int s[]=new int[t];
		int n[]=new int[t];
		for(int i=0;i<t;i++){
			p[i]=in.nextInt();
			s[i]=in.nextInt();
			n[i]=in.nextInt();
		}
		for(int i=0;i<t;i++){
			int dead=(n[i]+s[i]-1>p[i]?(n[i]+s[i]-p[i]-1):(n[i]+s[i]-1));
			while(dead>=p[i]){
				dead=dead-p[i];
				flag=true;
			}
			if(flag)
				System.out.println((dead)==0?p[i]:(dead));
			else
				System.out.println(dead);
		}
	}
}

package HackerRank;

import java.util.Scanner;

public class AnnJimmy {
	public static void main(String jj[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int div,l,b,h,r;
		if(n==1){
			System.out.println(1);
			return;
		}
		if(n%3!=0){
			r=n%3;
			div=(n-r)/3;
			l=b=h=div;
			l++;
			if(r==2)
				b++;
			System.out.println(l*b*h);
		}
		else
		{
			l=b=h=n/3;
			System.out.println(l*b*h);
		}
	}

}

package HackerRank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class LazySorting {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		boolean flag=true;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++){
			if(a[i+1]>a[i]){
				flag=false;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(new BigDecimal(0).setScale(6));
			return;
		}
		int fact=factorial(n);
		int ans=fact/((1-fact)*(1-fact));
		BigDecimal dec=new BigDecimal(ans).setScale(6);
		System.out.println(dec);
	}

	private static int factorial(int n) {
		if(n==1)
			return 1;
		return n*(n-1);
	}
}

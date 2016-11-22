package MyPrograms;

import java.util.Scanner;

public class NumberOfWaysSummingN {
	public static void main(String gh[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		count+=count(n,i);
		System.out.println(count);
	}

	private static int count(int n,int k) {
		if(k==0)
			return 0;
		if(k==n)
		    return 1;
		if(k>n)
			return 0;
		
			return count(n-1, k-1)+count(n-k,k);
	}
}

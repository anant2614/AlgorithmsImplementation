package HackerRank;

import java.util.Scanner;

public class Clouds {
	public static void main(String gh[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(in.next());
	int count=0,i=0;
	while(i!=n-1){
		if(i<n-2&&a[i+2]==0)
			i+=2;
		else
			i++;
		count++;
	}
	System.out.println(count);
	}
}

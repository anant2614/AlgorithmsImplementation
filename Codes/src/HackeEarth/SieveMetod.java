package HackeEarth;

import java.util.Scanner;

public class SieveMetod {
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		boolean a[]=new boolean[n+1];
		for(int i=2;i<Math.sqrt(n);i++){
			int sq=i*i;
			int j=sq;
			int count=1;
			while(j<=n){
				a[j]=true;
				j=sq+count*i;
				count++;
			}
		}
		for(int i=2;i<n;i++)
			if(a[i]==false)
				System.out.println(i);
	}
}

package HackerRank;

import java.util.Scanner;

public class MAxSums {
	private static  int b[][];
	public static void main(String gh[]){
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next());
		int q=Integer.parseInt(in.next());
		int a[]=new int[n];
		b=new int[n][n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(in.next());
		for(int i=0;i<q;i++){
			int l=Integer.parseInt(in.next());
			int r=Integer.parseInt(in.next());
			System.out.println(printSum(a,n,l,r));
		}
	}
	
	private static int printSum(int[] a,int n,int l,int r) {
		int sum=0;
		for(int i=n-1;i>=0;i--){
			for(int j=i;j<=n-1;j++){
				if(i==j)
					b[i][j]=a[i];
				else
					b[i][j]=max(b[i][j-1],b[i+1][j]);
			}
		}
		for(int i=l-1;i<=r-1;i++)
			for(int j=l-1;j<=r-1;j++)
				sum+=b[i][j];
		return sum;
	}

	private static int max(int i, int j) {
		return i<j?j:i;
	}
}

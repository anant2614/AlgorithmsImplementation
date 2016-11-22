package HackeEarth;

import java.util.Scanner;

public class GON {
	public static void main(String j[]){
		Scanner in=new Scanner(System.in);
		int t=Integer.parseInt(in.next());
		for(int i=0;i<t;i++){
			int start=Integer.parseInt(in.next());
			int n=Integer.parseInt(in.next());;
			System.out.println(n-start+1-calc(n,start));
		}	
	}

	private static int calc(int n,int start) {
		int root=(int) Math.sqrt(n);
		int sum=0;
		for(int i=start;i<=n;i++){
			for(int j=2;j<=root;j++)
				if(i%(j*j)==0)
				{
					sum++;
					break;
				}
		}
		return sum;
	}
}

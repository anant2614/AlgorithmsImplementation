package HackerRank;

import java.util.Scanner;

public class LArgestFactor {
	public static void main(String sjs[]){
		Scanner in=new Scanner(System.in);
		int t=Integer.parseInt(in.next());
		for(int i=0;i<t;i++){
			boolean flag=false;
			int largest=0;
			int j=0;
			int n=in.nextInt();
			if(n==2)
				System.out.println(n);
			while(n%2==0){
				largest=2;
				n=n/2;
			}
			
			int sq=(int) Math.sqrt(n);
			for( j=3;j<=sq;j=j+2){
				while(n%j==0){
					n=n/j;
					largest=j;
				}
			}
			
			 if(n>2)
				System.out.println(n);
			else 
				System.out.println(largest);
		}
	}
}
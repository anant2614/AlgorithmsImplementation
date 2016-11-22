package HackerRank;

import java.util.Scanner;

public class NumberOfWays {
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int s[]=new int[N];
		for(int i=0;i<N;i++){
			s[i]=in.nextInt();
		}
		int L=in.nextInt();
		int R=in.nextInt();
		int sum=0;
		int dp[][]=new int[R+1][N];
		//construct matrix
		for(int j=0;j<N;j++){
			dp[0][j]=1;
		}
		for(int i=1;i<R+1;i++){
			for(int j=0;j<N;j++){
				int x=(i-s[j]>=0)?dp[i-s[j]][j]:0;
				int y=(j>=1)?dp[i][j-1]:0;
				dp[i][j]=x+y;
			}
		}
		for(int i=L;i<R+1;i++){
			sum+=dp[i][N-1];
		}
		System.out.println(sum);
	}
}

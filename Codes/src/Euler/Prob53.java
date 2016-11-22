package Euler;

import java.util.Scanner;

public class Prob53 {

	public static void main(String jh[]){
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next());
		int k=Integer.parseInt(in.next());
		int count=0;
		int[][] ptriangle=new int[n+1][n+1];
		for (int m = 0; m <=n; m++) {
			ptriangle[m][0] = 1;
		}
		for (int m = 1; m <=n; m++) {
			for (int r = 1; r <=m/2; r++) {
				ptriangle[m][r] = ptriangle[m - 1][r]
						+ ptriangle[m-1][r - 1];
				System.out.print(ptriangle[m][r]+"  ");
				if(ptriangle[m][r]>k)
					count++;
			}
			System.out.println();
		}
		System.out.println(count);
	}
}

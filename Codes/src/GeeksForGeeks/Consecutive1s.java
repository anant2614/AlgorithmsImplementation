package GeeksForGeeks;

import java.util.Scanner;

public class Consecutive1s {
	public static void main(String jk[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int prev_prev=1;
		int prev=2;
		int curr=0;
		int f[]=new int[n];
		for(int i=1;i<n;i++){
			curr=prev+prev_prev;
			prev_prev=prev;
			prev=curr;
		}
		System.out.println((int)Math.pow(2, n)-curr);
	}
}

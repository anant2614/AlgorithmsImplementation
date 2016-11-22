package HackeEarth;

import java.util.Scanner;

public class GraphTree {
	public static void main(String gh[]){
		Scanner in =new Scanner(System.in);
		int N=in.nextInt();
		int deg=0;
		for(int i=0;i<N;i++){
			deg+=Integer.parseInt(in.next());
		}
		if(deg==2*(N-1))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

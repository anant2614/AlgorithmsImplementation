package HackerRank;

import java.util.Scanner;

public class Kangaroo {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int x1=Integer.parseInt(s.split(" ")[0]);
		int v1=Integer.parseInt(s.split(" ")[1]);
		int x2=Integer.parseInt(s.split(" ")[2]);
		int v2=Integer.parseInt(s.split(" ")[3]);
		if(x2-x1>=0&&v1-v2>0&&((x2-x1)%(v1-v2)==0)||x1-x2>=0&&v2-v1>0&&((x1-x2)%(v2-v1)==0))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

package HackerRank;

import java.util.Scanner;

public class Fit {
	public static void main(String aaa[]){
		Scanner in=new Scanner(System.in);
		int W=Integer.parseInt(in.next());
		int H=Integer.parseInt(in.next());
		int q=Integer.parseInt(in.next());
		in.nextLine();
		for(int i=0;i<q;i++){
			String s=in.nextLine();
			if(s.split(" ")[0].charAt(0)=='R'){
				int l=Integer.parseInt(s.split(" ")[1]);
				int b=Integer.parseInt(s.split(" ")[2]);
				if(l>W||l>H||b>W||b>H)
					System.out.println("NO");
				else 
					System.out.println("YES");;
			}
			else{
				int r=Integer.parseInt(s.split(" ")[1]);
				if(3.14*r*r>W*H)
					System.out.println("NO");
				else
					System.out.println("YES");
			}
		}
	}
}

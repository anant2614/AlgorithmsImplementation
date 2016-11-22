package HackeEarth;

import java.util.Scanner;

public class Paintings {
	public static void main(String gh[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		long r=0,g=0,b=0;
		for(int i=0;i<t;i++){
			r=Integer.parseInt(in.next());
		    g=Integer.parseInt(in.next());
		    b=Integer.parseInt(in.next());
		    System.out.println(eval(r,g,b));
		}
		
	}

	private static int eval(long r, long g, long b) {
		if(r>=1&&g>=1&&b>=1)
			return 1+eval(r-1, g-1, b-1);
		if(r<1&&g>=3&&b>=3)
			return 2+eval(r, g-3, b-3);
		else if(r>=3&&g<1&&b>=3)
			return 2+eval(r-3, g, b-3);
		else if(r>=3&&g>=3&&b<1)
			return 2+eval(r-3, g-3, b);
		else if(r<1&&g>=3&&b<3)
			return 1+eval(r, g-3, b);
		else if(r>=3&&g<1&&b<3)
			return 1+eval(r-3, g, b);
		else if(r<3&&g<3&&b>=3)
			return 1+eval(r, g, b-3);
		else return 0;
	}
}

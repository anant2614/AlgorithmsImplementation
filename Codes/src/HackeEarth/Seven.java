package HackeEarth;

import Codechef.FasterScanner;

public class Seven {
	static FasterScanner inp=new FasterScanner();
	public static void main(String ghg[]){
		long N = inp.nextLong();
		String s = String.valueOf(N);
		long q = inp.nextLong();
		for(long i=0;i<q;i++){
			long L = inp.nextLong();
			long R = inp.nextLong();
			if(Integer.parseInt(s.substring((int)L-1,(int)R))%7==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

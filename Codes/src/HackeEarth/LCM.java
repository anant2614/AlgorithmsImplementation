package HackeEarth;

import java.util.HashMap;
import java.util.Map;

import Codechef.FasterScanner;

public class LCM {
	static FasterScanner inp=new FasterScanner();
	public static void main(String ghg[]){
		int t = inp.nextInt();
		Map<Long, Long> map = new HashMap<Long, Long>();
		Map<Long, Long> map2 = new HashMap<Long, Long>();
		for(int i=0;i<t;i++){
			long N = inp.nextInt();
			long X = inp.nextInt();
			long  Y = inp.nextInt();
			long Z = inp.nextInt();
			map.put(X, (long)1);
			map.put(Y, (long)1);
			map.put(Z, (long)1);
			long a[]= new long[(int) N];
			for(int j=0;j<N;j++){
				a[j]=inp.nextInt();
				map2.put(a[j], (long)1);
			}
			long lcm = a[0];
			for(int j=0;j<N;j++){
				lcm = lcm*(a[j])/gcd((int) lcm,a[j]);
			}
			if(map2.get(lcm)==null)
			{
				System.out.println("She can't");
				continue;
			}
			boolean flag=false;
			for(int j=0;j<N;j++){
				int key=(int) (lcm/a[j]);
				if(a[j]==lcm)
					flag=true;
				else{
					while(key>0){
						if(map.get(key)==null)
							flag=true;
						if(!flag)
							break;
						key=(int) (key/a[j]);
					}
				}
			}
			if(!flag)
				System.out.println("She can't");
			else
				System.out.println("She can");
		}
	}

	private static long gcd(long a,long b){
		long larger=a>b?a:b;
		long smaller=a+b-larger;
		if(larger%smaller==0)
			return smaller;
		return gcd(larger%smaller,smaller);
	}
}

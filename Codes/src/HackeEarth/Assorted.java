package HackeEarth;

import java.util.HashMap;
import java.util.Map;

import Codechef.FasterScanner;

public class Assorted {
	private static long c[];
	private static long d[];
	public static void main(String ghj[]){
		FasterScanner inp=new FasterScanner();
		long m=inp.nextLong();
		long n=inp.nextLong();
		long[] a=new long[(int) m];
		c=new long[(int) n];
		d=new long[(int) n];
		for(long i=0;i<n;i++){
			c[(int) i]=inp.nextLong();
			d[(int) i]=c[(int) i];
		}
		for(long i=0;i<m;i++){
			a[(int) i]=inp.nextLong();
		}
		long max=Integer.MIN_VALUE;
		Map<Long,Integer> map=new HashMap<Long, Integer>();
		long prev_val=-1;
		for(long i=0;i<m;i++){
			int pos=(int) (a[(int) i]-1);
			long val=c[pos];
			long count=d[pos]/c[pos];
			if(map.get(val)==null&&val>prev_val){
				map.put(val, 1);
			}
			while(!isSafe(val,pos)||val<=prev_val){
				if(map.get(val)==null){
					map.put(val, 1);
				}
				count++;
				val=c[pos]*count;
			}
			prev_val=val;
			if(val>max)
				max=val;
			d[pos]=val;
		}
		System.out.println(max);
	}

	private static boolean isSafe(long val,long pos) {
		for(long i=pos+1;i<c.length;i++){
			if(val%c[(int) i]==0)
				return false;
		}
		return true;
	}
}

package HackerRank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Codechef.FasterScanner;

public class Equalize {
	static FasterScanner inp=new FasterScanner();
	public static void main(String ghg[]){
		int n=inp.nextInt();
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++){
			int r=inp.nextInt();
			if(map.get(r)!=null){
				map.put(r, map.get(r)+1);
			}
			else
				map.put(r, 1);
		}
		int max=Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>max)
				max=entry.getValue();
		}
		System.out.println(n-max);
	}
}

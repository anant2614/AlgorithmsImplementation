package Codechef;

import java.util.HashMap;
import java.util.Map;

public class CHSTAMP {
	static FasterScanner inp=new FasterScanner();
	public static void main(String gjg[]){
		int t=inp.nextInt();
		long N=inp.nextLong();
		long M=inp.nextLong();
		Map<Long, Integer> map=new HashMap<Long, Integer>();
		for(long i=0;i<N;i++){
			map.put(inp.nextLong(), 1);
		}
	}
}

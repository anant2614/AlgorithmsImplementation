package HackeEarth;

import java.util.HashMap;
import java.util.Map;

import Codechef.FasterScanner;

public class Pens {
	static FasterScanner inp = new FasterScanner();

	public static void main(String arg[]) {
		int t = inp.nextInt();
		for (int test = 0; test < t; test++) {
			long N = inp.nextInt();
			long M = inp.nextInt();
			long P = inp.nextInt();
			long count = 0;
			Map<Long, Long> map = new HashMap<Long, Long>();
			for (long m = 0; m < M; m++) {
				long num = inp.nextInt();
				if (num <= N && map.get(num) == null) {
					count++;
					map.put(num, 1L);
				}
			}
			for (long p = 0; p < P; p++) {
				long num = inp.nextInt();
				if (num <= N && map.get(num) == null) {
					count++;
					map.put(num, 1L);
				}
			}
			if (count == N)
				System.out.println("They can");
			else
				System.out.println("They can't");
		}
	}
}

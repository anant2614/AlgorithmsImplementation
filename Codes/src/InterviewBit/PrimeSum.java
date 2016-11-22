package InterviewBit;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class PrimeSum {
	public static void main(String ghg[]) {
		// print primes
		int n = 16777214;
		int a[] = new int[n];
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		for (int i = 2; i < n; i++) {
			if (a[i] != -1) {
				map.put(i, 1);
			}
			for (int j = i * 2; j < n; j = j + i) {
				a[j] = -1;
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			if(map.get(n-key)!=null&&key<=n-key){
				System.out.println(key);
				System.out.println(n-key);
				break;
			}
		}
	}
}

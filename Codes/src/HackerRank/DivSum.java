package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DivSum {
	public static void main(String rgh[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % k == 0) {
				if (map.get(0) != null) {
					count += map.get(0);
					map.put(0, map.get(0) + 1);
				}
				map.put(0, 1);
			}
			else{
			if (map.get(k - a[i] % k) != null) {
				count += map.get(k - a[i] % k);
				System.out.println(a[i]);
			}
			if (map.get(a[i] % k) != null) {
				map.put(a[i] % k, map.get(a[i] % k) + 1);
			} else
				map.put(a[i] % k, 1);
			}
		}
		System.out.println("divs are====>" + count);
	}
}

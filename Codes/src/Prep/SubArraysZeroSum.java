package Prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraysZeroSum {
	public static void main(String[] args) {
		int[] a = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		printSubArraysZeroSum(a);
	}

	private static void printSubArraysZeroSum(int[] a) {
		List<Range> list = new ArrayList<Range>();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (sum == 0)
				list.add(new Range(0, i));
			if (map.get(sum) != null) {
				for (Integer val : map.get(sum)) {
					list.add(new Range(val + 1, i));
				}
				map.get(sum).add(i);
			} else {
				List<Integer> l = new ArrayList<Integer>();
				l.add(i);
				map.put(sum, l);
			}
		}
		for (Range range : list) {
			System.out.println(range.from + " to " + range.to);
		}
	}
}

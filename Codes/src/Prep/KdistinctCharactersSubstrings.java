package Prep;

import java.util.Arrays;

public class KdistinctCharactersSubstrings {
	public static void main(String hd[]) {
		String s = "aabbcc";
		int k = 1;
		System.out.println(countDistinct(s, k));
		System.out.println(longestDistinctSubstring(s, k));
	}

	private static int countDistinct(String s, int k) {
		int a[] = new int[26];
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			Arrays.fill(a, 0);
			int dixtinct = 0;
			for (int j = i; j < s.length(); j++) {
				if (a[s.charAt(j) - 'a'] == 0)
					dixtinct++;
				a[s.charAt(j) - 'a']++;
				if (dixtinct == k) {
					count++;
				} else if (dixtinct > k)
					break;
			}
		}
		return count;
	}

	private static int longestDistinctSubstring(String s, int k) {
		int a[] = new int[26];
		int len = 0;
		for (int i = 0; i < s.length(); i++) {
			Arrays.fill(a, 0);
			int dixtinct = 0;
			for (int j = i; j <s.length(); j++) {
				if (a[s.charAt(j) - 'a'] == 0)
					dixtinct++;
				a[s.charAt(j) - 'a']++;
				if (dixtinct == k) {
					if(j-i+1>len)
						len=j-i+1;
					System.out.println(s.substring(i, j + 1));
				} else if (dixtinct > k)
					break;
			}
		}
		return len;
	}
}

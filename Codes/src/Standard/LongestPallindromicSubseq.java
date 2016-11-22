package Standard;

public class LongestPallindromicSubseq {
	public static void main(String args[]) {
		String s = "ACBDBA";
		System.out.println(lps(s, 0, s.length() - 1));
	}

	private static int lps(String s, int l, int r) {
		if (l == r)
			return 1;
		
		if (r - l == 1 && s.charAt(l) == s.charAt(l))
			return 2;
		
		if (s.charAt(l) == s.charAt(r))
			return 2 + lps(s, l + 1, r - 1);

		return max(lps(s, l, r - 1), lps(s, l + 1, r));
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}

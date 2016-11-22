package Prep;

public class SubseqPresence {
	public static void main(String gh[]){
		String s = "geeksforgeeks";
		String t = "ge";
		System.out.println(countPresence(s,t,s.length(),t.length()));
	}

	private static int countPresence(String s, String t, int n, int m) {
		if(m==0)
			return 1;
		if(n==0||n<m)
			return 0;
		if(s.charAt(n-1)!=t.charAt(m-1))
			return countPresence(s, t, n-1, m);
		return countPresence(s, t, n-1, m)+countPresence(s, t, n-1, m-1);
	}
}

package Prep;

public class CompletePairsStrings {
	public static void main(String ao[]) {
		String set1[] = { "abcdefgh", "geeksforgeeks", "lmnopqrst", "abc" };
		String set2[] = { "ijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "defghijklmnopqrstuvwxyz" };
		System.out.println(numberOfPairs(set1,set2,set1.length,set2.length));
	}

	private static int numberOfPairs(String[] s1, String[] s2, int m, int n) {
		int count[] = new int[m];
		int count2[] = new int[n];
		for(int i=0;i<m;i++){
			for(int j=0;j<s1[i].length();j++)
			count[i]=count[i]|(1<<(s1[i].charAt(j)-'a'));
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<s2[i].length();j++)
			count2[i]=count2[i]|(1<<(s2[i].charAt(j)-'a'));
		}
		int res=0;
		long complete =  (1<<26) - 1;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if((count[i]|count2[j])==complete)
					res+=1;
			}
		}
		return res;
	}
}

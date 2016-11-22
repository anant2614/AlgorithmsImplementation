package HackerRank;

public class Genes {

	public static void main(String hj[]){
		int count[]=new int[256];
		String s="GAAATAAA";
		int n=s.length();
		char str[]=s.toCharArray();
		int max=n/4;
		for (char ch : str) {
			count[ch]++;
		}
		int r=0,l=0;
		int ans=r;
		for (l= 0; l < n; l++) {
			while (count['A'] > max || count['C'] > max || count['T'] > max || count['G'] > max) {
				if (r == n) {					
					System.out.println(ans);
					return;
				}

				--count[str[r]];
				++r;
			}
			ans = Math.min(ans, r-l);
			++count[str[l]];
		}
		System.out.println(ans);
		}
}

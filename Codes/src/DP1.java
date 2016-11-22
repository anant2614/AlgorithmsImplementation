import java.util.Arrays;
import java.util.Scanner;

public class DP1 {
	int memo[];
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		DP1 dp = new DP1();
		dp.init(n);
		int s = dp.f(n);
		System.out.println(s);
	}

	private void init(int n) {
		memo = new int[n+1];
		Arrays.fill(memo, -1);	
	}
	private int f(int n) {
		if(n==1) 
			return 0;
		if(memo[n]!=-1)
			return memo[n];
		int r = 1+f(n-1);
		if(n%2==0) 
			r = min(r, 1+f(n/2));
		if(n%3==0)
			r = min(r, 1+f(n/3));
		memo[n] = r;
		return r;
	}

	private int min(int r, int i) {
		if(r<i) return r;
		else return i;
	}
}

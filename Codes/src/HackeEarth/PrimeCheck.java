package HackeEarth;

import Codechef.FasterScanner;

public class PrimeCheck {
	static FasterScanner inp = new FasterScanner();
	static int max1 = 1, max2 = -1;

	public static void main(String[] args) {
		int t = inp.nextInt();
		for(int j=0;j<t;j++){
		int n = inp.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = inp.nextInt();
		}
		for (int i = 0; i < n; i++) {
			checkPrime(a[i]);
		}
		System.out.println(max1 * max2);
	}
	}

	private static void checkPrime(int n) {
		boolean flag = false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag&&n!=1) {
			if (n > max1)
				max1 = n;
			if (n > max2)
				max2 = n;
		}
	}
}

package Prep;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class PowerNumber {
	public static void main(String args[]) throws IOException, Exception {

		Scanner in = new Scanner(System.in);

		int l = in.nextInt();
		int r = in.nextInt();
		System.out.println(countPowerNumbers(l, r));
		HashSet<Long> hs = new HashSet<Long>();
		hs.add(1L);
		hs.add(0L);
		System.out.println(countPowerNos(l, r, hs));
	}

	private static int countPowerNos(int l, int r, HashSet<Long> hs) {
		int count = 0;
		while (l <= r) {
			int n = l;
			if (n == 2||n==1) {
				count++;
				l++;
				continue;
			}

			int f = 0;

			for (int x = 2; x <= Math.sqrt(n); x++) {

				int lgx = (int) Math.ceil((Math.log(n) / Math.log(x)));

				if (f == 1) {
					break;
				}
				for (int y = 2; y <= lgx; y++) {

					long num = (long) Math.pow(x, y);

					if (hs.contains(n - num) || num + num == n) {
						f = 1;
						break;
					}
					hs.add(num);

				}
			}
			if (f == 1) {
				count++;
			} 
			l++;
		}
		return count;
	}

	static int countPowerNumbers(int l, int r) {
		boolean a[] = new boolean[r + 1];
		/* Initializing all numbers as FALSE */
		Arrays.fill(a, false);
		int count = 0;
		/* Since 1 can always be represented as a power number */
		a[1] = true;
		/* Generating all power numbers */
		for (int i = 2; Math.pow(i, 2) <= r; i++) {
			for (int j = 2; Math.pow(i, j) <= r; j++) {
				int t = (int) Math.pow(i, j);
				a[t] = true;
			}
		}

		for (int i = l; i <= r; i++) {
			/*
			 * Since a power number can be represented as sum of two another
			 * power numbers eg. 25 = 5^2 + 0^2
			 */
			if (a[i] == true)
				count++;

			else {
				for (int j = i - 1; j > 0; j--) {
					/* Checking if two power numbers form the required number */
					if (a[j] == true && a[i - j] == true) {
						count++;
						break;
					}
				}
			}
		}
		return count;
	}

}

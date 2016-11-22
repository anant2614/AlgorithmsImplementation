package Prep;

public class AlternateSortArray {
	public static void main(String ghg[]) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = a.length;
		int count = 0, i = 0;
		int var = a[0], pvar, j;
		while (count++ <= n) {
			if (i < n / 2) {
				if (a[i] > 0) {
					j = 2 * i + 1;
					pvar = a[j];
					a[j] = var;
					a[j]=-a[j];
					var = pvar;
					i = j;
				} else {
					i++;
					count--;
				}
			} else {
				j = 2 * (n - 1 - i);
				pvar = a[j];
				a[j] = var;
				a[j]=-a[j];
				var = pvar;
				i = j;
			}
		}
		System.out.println(a);
	}
}

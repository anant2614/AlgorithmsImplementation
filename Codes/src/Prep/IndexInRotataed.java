package Prep;

public class IndexInRotataed {
	public static void main(String ap[]) {
		int a[] = { 2, 3, 4, 5, 6, 1 };
		System.out.println(returnIndex(a, 0, a.length - 1));
	}

	public static int returnIndex(int a[], int l, int r) {
		int m = (l + r) / 2;
		if (l == r)
			return a[l];
		if (m < r && a[m] > a[m + 1])
			return a[m + 1];
		if (m > l && a[m - 1] > a[m])
			return a[m];
		if (a[l] < a[m])
			return returnIndex(a, m + 1, r);
		return returnIndex(a, l, m - 1);
	}
}

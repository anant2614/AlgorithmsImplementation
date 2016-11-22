package Prep;

public class SearchInAlmostSorted {
	public static void main(String args[]) {
		int a[] = { 10, 3, 40, 20, 50, 80, 70};
		System.out.println(search(a, 0, a.length - 1, 40));
	}

	private static int search(int[] a, int l, int r, int key) {
		int mid = (l + r) / 2;
		if (a[mid] == key)
			return mid;
		if (a[mid] >= a[mid - 1] && a[mid] > a[mid + 1])
			if (key < a[mid + 1])
				return search(a, l, mid - 1, key);
			else
				return search(a, mid + 1, r, key);
		else if (a[mid] <= a[mid - 1] && a[mid] < a[mid + 1])
			if (key <= a[mid - 1])
				return search(a, l, mid - 1, key);
			else
				return search(a, mid + 1, r, key);
		else if (key <= a[mid])
			return search(a, l, mid - 1, key);
		else
			return search(a, mid + 1, r, key);
	}
}

package Assign;

public class ArrayIndex {
	public static void main(String ghg[]) {
		int a[] = { 1,3,2,9,3,1,2 };
		returnIndex(a);
	}

	private static void returnIndex(int a[]) {
		int index = -1;
		for (int i = 1; i < a.length; i++) {
			a[i] = a[i - 1] + a[i];
		}
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i - 1] == (a[a.length - 1] - a[i])&&a[i-1]*2==a[i]) {
				index = i;
				break;
			}
		}
		if (index != -1)
			System.out.println(index);
		else
			throw new IndexNotFoundException("Could not find index");
	}
}

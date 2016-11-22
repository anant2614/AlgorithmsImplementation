package Prep;

public class EqualSubarrays {
	public static void main(String gjg[]) {
		int a[] = { 6, -2, -3, 2, 3 };
		System.out.println(checkForDivision(a));
	}

	private static boolean checkForDivision(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		int sum_here = 0;
		for (int i = 0; i < a.length; i++) {
			if (2 * sum_here + a[i] == sum) {
				print(a, 0, i);
				System.out.println();
				print(a, i + 1, a.length);
				return true;
			}
			sum_here += a[i];
		}
		return false;
	}

	private static void print(int[] a, int start, int end) {
		for (int i = start; i < end; i++)
			System.out.print(a[i] + " ");
	}
}

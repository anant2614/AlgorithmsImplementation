package Prep;

public class IncreasingSubarrays {
	public static void main(String ghg[]) {
		int a[] = { 1, 2, 2, 4 };
		int sum = 0, count = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				count++;
				sum += count;
			} else
				count = 0;
		}
		System.out.println(sum);
	}
}

package Prep;

import java.util.Arrays;
import java.util.Collections;

public class MinimizeMaxDiff {
	public static void main(String[] args) {
		int a[] = { 1, 15, 10 };
		int k = 6;
		Arrays.sort(a);
		int min = a[0] + k < a[a.length - 1] - k ? a[0] + k : a[a.length - 1] - k;
		int max = a[0] + k > a[a.length - 1] - k ? a[0] + k : a[a.length - 1] - k;
		if (k >= a[a.length - 1] - a[0]) {
			for (int i = 0; i < a.length; i++) {
				a[i] += k;
			}
			System.out.println(max - min);
			return;
		}
		int new_min = min, new_max = max;

		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] < min) {
				a[i] += k;
			} else if (a[i] > max) {
				a[i] -= k;
			} else if (a[i] < max && a[i] > min) {
				a[i] = a[i] - min < max - a[i] ? a[i] + k : a[i] - k;
			}
			new_min = a[i] < new_min ? a[i] : new_min;
			new_max = a[i] > new_max ? a[i] : new_max;
		}
		System.out.println(new_max - new_min);
	}
}

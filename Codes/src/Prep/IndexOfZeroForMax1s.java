package Prep;

public class IndexOfZeroForMax1s {
	public static void main(String ghg[]) {
		int a[] = { 1, 1, 1, 1, 0 };
		int p_pzero = -1;
		int p_zero = -1;
		int max_index = -1;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				if (i - p_pzero > count) {
					count = i - p_pzero;
					max_index = p_zero;
				}
				p_pzero = p_zero;
				p_zero = i;
			}
		}
		if (a.length - p_pzero > count)
			max_index = a.length - 1;
		System.out.println(max_index);
	}
}

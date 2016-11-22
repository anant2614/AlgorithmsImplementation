package Prep;

public class MinSubarray {
	public static void main(String ag[]) {
		int a[] = { 0, 1, 15, 25, 6, 7, 30, 40, 50 };
		System.out.println(findLength(a));
	}

	private static int findLength(int[] a) {
		int start = 0;
		int end = a.length - 1;
		boolean flag1 = true, flag2 = true;
		while (start < end && (flag1 || flag2)) {
			if (a[start] < a[start + 1]) {
				start++;
			} else
				flag1 = false;
			if (a[end] > a[end - 1]) {
				end--;
			} else
				flag2 = false;
		}
		// find min-max in subarray
		int min = a[start];
		int max = a[end];
		for (int i = start; i <= end; i++) {
			if (a[i] < min)
				min = a[i];
			if (a[i] > max)
				max = a[i];
		}
		// find first and last elements
		for (int i = 0; i < start; i++) {
			if(a[i]>min){
				start=i;
				break;
			}
		}
		for (int i = end+1; i < a.length; i++) {
			if(a[i]<max){
				end=i;
				break;
			}
		}
		return end-start;
	}
}

package Prep;

public class MiCostRopes {
	public static void main(String hd[]) {
		int a[] = { 4, 3, 2, 6 };
		buildMinHeap(a);
		System.out.println(findCost(a));
	}

	private static int findCost(int[] a) {
		int total_cost = 0;
		int N = a.length;
		while (N > 1) {
			int cost = a[0];
			a[0] = a[N - 1];
			N = N - 1;
			minHeapify(a, 0, N);
			cost += a[0];
			a[0] = cost;
			minHeapify(a, 0, N);
			total_cost += cost;
		}
		return total_cost;
	}

	private static void buildMinHeap(int[] a) {
		for (int i = a.length / 2; i >= 0; i--)
			minHeapify(a, i, a.length);
	}

	private static void minHeapify(int a[], int i, int N) {
		if (i >= N)
			return;
		int min = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left <= N - 1 && a[left] < a[min])
			min = left;
		if (right <= N - 1 && a[right] < a[min])
			min = right;
		if (min != i) {
			int tmp = a[i];
			a[i] = a[min];
			a[min] = tmp;
			minHeapify(a, min, N);
		}
	}
}

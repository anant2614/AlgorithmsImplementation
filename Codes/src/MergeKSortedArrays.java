
public class MergeKSortedArrays {
	public static void main(String arg[]) {
		int ar[][] = { { 2, 6, 8, 12, 34 }, { 1, 9, 20, 25, 100, 1000 }, { 23, 34, 90, 2000 } };
		int n = 5;
		int k = 3;
		int a[]=sortArray(ar, n, k);
		System.out.println(a);
	}

	private static int[] sortArray(int[][] ar, int n, int k) {
		int result[] = new int[n * k];
		HNode har[] = new HNode[k];
		int size=0;
		for (int i = 0; i < k; i++) {
			har[i] = new HNode(ar[i][0], 0, 1);
			size+=ar[i].length;
		}
		buildMinHeap(har);
		for (int i = 0; i < size; i++) {
			HNode root = har[0];
			result[i] = root.val;
			if (root.j < ar[root.i].length)
				root.val = ar[root.i][root.j + 1];
			else
				root.val = Integer.MAX_VALUE;
			har[0] = root;
			heapify(har, 0);
		}
		return result;
	}

	private static void buildMinHeap(HNode a[]) {
		for (int i = a.length / 2-1; i >= 0; i--) {
			heapify(a, i);
		}
	}

	private static void heapify(HNode[] a, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int smallest = i;
		if (left < a.length && a[left].val < a[smallest].val)
			smallest = left;
		if (right < a.length && a[right].val < a[smallest].val)
			smallest = right;
		if (smallest != i) {
			int tmp = a[smallest].val;
			a[smallest] = a[i];
			a[i].val = tmp;
			heapify(a, smallest);
		}
	}
}

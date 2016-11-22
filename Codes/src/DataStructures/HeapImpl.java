package DataStructures;

public class HeapImpl {
	static int a[] = { 0, 6, 4, 2, 1, 5 };

	public static void main(String hd[]) {
		HeapImpl obj = new HeapImpl();
		obj.heapSort();
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

	private void buidHeap() {
		int N = a.length;
		for (int i = a.length / 2 - 1; i >= 0; i--) {
			maxHeapify(i, N);
		}
		System.out.println();
	}

	public void heapSort() {
		int N = a.length;
		buidHeap();
		for (int i = a.length - 1; i >= 0; i--) {
			int tmp = a[0];
			a[0] = a[i];
			a[i] = tmp;
			N = N - 1;
			maxHeapify(0, N);
		}
		System.out.println();
	}

	private void maxHeapify(int i, int N) {
		if (i >= N)
			return;
		int largest;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left <= N - 1 && a[left] > a[i])
			largest = left;
		else
			largest = i;
		if (right <= N - 1 && a[right] > a[largest])
			largest = right;
		if (largest != i) {
			int tmp = a[i];
			a[i] = a[largest];
			a[largest] = tmp;
			maxHeapify(largest, N);
		}

	}
}

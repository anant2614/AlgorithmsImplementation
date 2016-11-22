package Prep;

public class MinHeapToMax {
	public static void main(String[] args) {
		int a[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
		for(int i=a.length/2-1;i>=0;i--){
			convertToMax(a,i,a.length);
		}
		System.out.println(a);
	}

	private static void convertToMax(int[] a, int i, int length) {
		if(i>=a.length)
			return;
		int largest=i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<a.length&&a[left]>a[largest])
			largest=left;
		if(right<a.length&&a[right]>a[largest])
			largest=right;
		if(largest!=i){
			int tmp = a[i];
			a[i]=a[largest];
			a[largest] = tmp;
			convertToMax(a, largest, length);
		}
	}
}

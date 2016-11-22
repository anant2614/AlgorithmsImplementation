package Prep;

public class SearchMax {
	public static void main(String gjg[]){
		 int a[] = {1, 30, 40, 50, 60, 70, 23, 20};
		 System.out.println(findMax(a,0,a.length-1));
	}

	private static int findMax(int[] a,int l,int r) {
		if(l==r)
			return a[l];
		int mid=(l+r)/2;
		if(a[mid]>a[mid-1]&&a[mid]>a[mid+1])
			return a[mid];
		if(a[mid]>a[mid-1]&&a[mid]<a[mid+1])
			return findMax(a, mid, r);
			return findMax(a, l, mid);
	}
}

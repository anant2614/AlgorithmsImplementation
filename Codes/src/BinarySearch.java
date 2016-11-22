
public class BinarySearch {
private static int binarySearch(int A[],int l,int r,int k) {
	
	while(l<=r){
	int m=l+(r-l)/2;
	if(A[m]==k)
		return k;
	else if(A[m]<k)
		l=m+1;
	else 
		r=m-1;
	}
	return -1;
}

private static int recursiveBinarySearch(int A[],int l,int r,int k) {
	if(l<r)
		return -1;
	int m=l+(r-l)/2;
	if(A[m]==k)
		return k;
	else if(A[m]<k)
		return recursiveBinarySearch(A, m+1, r, k);
	else
	   return recursiveBinarySearch(A, l, m-1, k);
	
}

public static void main(String djd[]){
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	System.out.println(binarySearch(a,0, a.length-1, 0));
	System.out.println(recursiveBinarySearch(a, 0, a.length-1, 11));
}
}

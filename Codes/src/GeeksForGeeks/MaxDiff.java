package GeeksForGeeks;

public class MaxDiff {
	public static void main(String gh[]){
		 int arr[] = {80, 2, 6, 3, 100};
		printMax(arr);
	}

	private static void printMax(int[] a) {
        int min_till=a[0],max=-1;
        int max_diff=-1,min=a[0];
		for(int i=0;i<a.length;i++){
        	if(a[i]<min)
        		min=a[i];
        	 if(a[i]-min>max_diff){
        		max_diff=a[i]-min;
        		min_till=min;
        		max=a[i];
        	}
        }
		System.out.println(max_diff+"  "+min_till+"  "+max);
	}
}

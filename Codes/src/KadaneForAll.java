
public class KadaneForAll {
	public static void main(String arg[]){
		int a[] =  {-2, -3};
		int max_ending_here=a[0];
		int max_so_far=a[0];
		for(int i=0;i<a.length;i++){
			max_ending_here=max(a[i],a[i]+max_ending_here);
			max_so_far=max(max_so_far,max_ending_here);
		}
		System.out.println(max_so_far);
	}

	private static int max(int a, int b) {
		return a>b?a:b;
	}
}

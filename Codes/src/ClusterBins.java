import java.util.HashMap;

public class ClusterBins {
	private static double percent;
	private static final double threshold=40;
	private static HashMap<Double, Integer> map=new HashMap<Double, Integer>();

	public static void main(String gh[]){
		double a[]={2.0,2.5,2.9,3.5,3.8,4.1,7.2,7.5,8.1};	
		System.out.println(a[0]);
		int count;
		double curr_start=a[0];
		for(int i=1;i<a.length;i++){
			count=0;
			double dif= (a[i]-a[i-1]);
			double percentChang=((dif/a[i-1])*100);
			if(percentChang>threshold){
				curr_start=a[i];
				map.put(curr_start, 0);
				System.out.println(a[i-1]);
				System.out.println(a[i]);
			}
			else
				map.put(curr_start, count+1);
		}
	}

}

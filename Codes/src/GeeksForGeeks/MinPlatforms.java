package GeeksForGeeks;

import java.util.Arrays;

public class MinPlatforms {
	public static void main(String hj[]){
		 int arr[] = {900, 940, 950, 1100, 1500, 1800};
		    int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		    MinPlatforms obj=new MinPlatforms();
		    obj.solveMinPlatforms(arr,dep);
	}

	private void solveMinPlatforms(int[] arr, int[] dep) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int l=1,r=0,result=1,p=1;
		while(l<arr.length&&r<arr.length){
			if(dep[r]>arr[l]){
				p++;
				if(p>result){
					result=p;
				}
				l++;
			}
			else
			{
				p--;
				r++;
			}
		}
		System.out.println(result);
	}
}

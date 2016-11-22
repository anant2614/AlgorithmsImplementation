package Prep;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UniqueSumPairs {
	public static void main(String args[]) throws IOException, Exception {
		int a[] = {1,2,3,4,5,6,7,8};
		System.out.println(count(a,9));
	}

	private static int count(int[] a,int k) {
		int count=0;
		Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		for(int i=0;i<a.length;i++){
			if(map.get(k-a[i])==null){
				map.put(a[i],false);
			}
			else{
				if(map.get(k-a[i]).equals(false)){
					count++;
					map.put(a[i],true);
				}
			}
		}
		return count;
	}
}

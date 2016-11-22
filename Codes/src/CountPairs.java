import java.util.HashMap;

public class CountPairs {
	public static void main(String fg[]){
		//int a[]={1,2,3,5,6,2,3,2};
		int a[]={2,2,2,2,2};
		System.out.println(countPairs(a,a.length));
	}

	private static int countPairs(int[] a, int length) {
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int count=0;
		for(int i=0;i<length;i++){
			if(map.get(a[i])==null)
				map.put(a[i], 1);
			else{
				map.put(a[i], map.get(a[i])+1);
				count+=map.get(a[i])-1;
			}
		}
		return count;
	}

}

import java.util.HashMap;
import java.util.Map;

public class PairsU {
	public static void main(String[] args) {
		int a[]  = {1,3,46,1,3,9};
		long k = 12;
		int count=0;
		Map<Long,Boolean> map = new HashMap<Long, Boolean>();
		for(int i=0;i<a.length;i++){
			long val = k-a[i];
			if(map.get(val)!=null&&map.get(val).equals(false)){
				count++;
				map.put(val, true);
			}
			else
				map.put((long) a[i], false);
		}
		System.out.println(count);
	}
}

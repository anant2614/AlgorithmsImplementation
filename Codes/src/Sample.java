import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Sample {
	public static void main(String hg[]){
		/*TreeMap<Integer, Integer> map=new TreeMap<Integer, Integer>();
		map.put(59, 1);
		map.put(0, 1);
		map.put(119, 2);
		System.out.println(map.floorKey(Integer.MAX_VALUE));*/
		/*List<Integer> list  = new ArrayList<Integer>();
		list.add(2);
		list.add(21);
		list.add(4);
		list.add(20);
		
		System.out.println(list.size());
		
		list.remove(2);
		
		System.out.println(list.size());*/
		Map<String,String> map = new HashMap<String,String>();
		Hashtable<String, String> hash = new Hashtable<String, String>();
		map.put("a", "1");
		map.put("b", "2");
		
		hash.put("c", "1");
		hash.put("d", "2");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		   //map.remove(entry.getKey());
		}
		
		for (Map.Entry<String, String> entry : hash.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		    hash.remove(entry.getKey());
		}
	}
}

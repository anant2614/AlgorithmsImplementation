import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Sample2 {
	 public static void main(String args[]) throws Exception {
	        Map<String,Integer> map = new HashMap<String, Integer>();
	        map.put("abc", 1);
	        map.put("rgf", 2);
	        map.put("bch", 3);
	        map.put("bsqsh", 4);
	        map.put("abc", 2);
	        
	        /*for (Map.Entry<String, Integer> entry : map.entrySet())
	        {
	            System.out.println(entry.getKey() + "/" + entry.getValue());
	            System.out.println(entry.getKey().hashCode());
	        }
	        System.out.println(map);*/
	        Class clazz = map.getClass();
            Field table = clazz.getDeclaredField("table");
            table.setAccessible(true);
            Map.Entry<Integer, String>[] realTable = (Map.Entry<Integer, String>[]) table.get(map);

            //Iterate and do pretty printing
            for (int i = 0; i < realTable.length; i++) {
                System.out.println(String.format("Bucket : %d, Entry: %s", i, bucketToString(realTable[i])));
            }
	    }
	 
	 @Override
	public int hashCode() {
		return 1;
	}

	private static String bucketToString(Map.Entry<Integer, String> entry) throws Exception {
         if (entry == null) return null;
         StringBuilder sb = new StringBuilder();

         //Access to the "next" filed of HashMap$Node
         Class clazz = entry.getClass();
         Field next = clazz.getDeclaredField("next");
         next.setAccessible(true); 

         //going through the bucket
         while (entry != null) {
             sb.append(entry);
             entry = (Map.Entry<Integer, String>) next.get(entry);
             if (null != entry) sb.append(" -> ");
         }
         return sb.toString();
     }
}

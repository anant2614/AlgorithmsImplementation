import java.util.HashMap;
import java.util.Map;

public class ashMapPractice {
	public static void main(String fg[]){
		Map<String,String> map = new HashMap<String, String>();
		String s = "aaa";
		String s1 = "222w2";
		map.put(s, "ball");
		map.put(s1, "wdwe");
		System.out.println(map.get(s));
		s=s1;
		System.out.println(map.get(s));	
	}
}

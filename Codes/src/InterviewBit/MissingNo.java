package InterviewBit;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

import org.w3c.dom.ranges.Range;

public class MissingNo {
	public static void main(String ghg[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		/*for(int i=0;i<list.size();i++){
			if(list.get(Math.abs(list.get(i))-1)<0){
				System.out.println(Math.abs(list.get(i)));
				break;
			}
			else
				list.set(Math.abs(list.get(i))-1, -list.get((Math.abs(list.get(i))-1)));
		}*/
		 NavigableMap<Integer,Range> map =
			        new TreeMap<Integer, Range>();
		 int root=(int) Math.sqrt(list.size());
		// map.put(1, );
	}
}

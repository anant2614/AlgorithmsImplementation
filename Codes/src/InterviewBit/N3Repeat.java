package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class N3Repeat {
	public static void main(String ghg[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(2);
		list.add(6);
		int index=0;
		int count=0;
		int prex_index=0;
		for(int i=0;i<list.size();i++){
			if(list.get(i)==list.get(index))
				count++;
			else
				count--;
			if(count==0){
				count=1;
				prex_index=index;
				index=i;
			}
		}
		int occ = 0;
		for(int i=0;i<list.size();i++){
			if(list.get(i)==list.get(index)){
				occ++;
			}
		}
		if(occ>list.size()/2)
			System.out.println(list.get(index));
		else
			System.out.println("Not found");
	}
}

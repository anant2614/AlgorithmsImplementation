package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class Rearrange {
	public static void main(String ghg[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(0);
		list.add(1);
		int n=list.size();
		for(int i=0;i<list.size();i++){
			int num=list.get(i);
			list.set(i, num+list.get(num)%n*n);
		}
		for(int i=0;i<list.size();i++){
			int num=list.get(i);
			list.set(i, num/n);
		}
		System.out.println(list);
	}
}

package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class MAxNonNegArray {
	public static void main(String ghg[]) {
		List<Integer> list = new ArrayList<Integer>();
		/*list.add(-1);
		list.add(2);
		list.add(5);
		list.add(-7);
		list.add(2);
		list.add(5);*/
		list.add(1967513926);
		list.add(1540383426);
		/*list.add(75);
		list.add(-1);
		list.add(140);*/
		System.out.println(returnList(list));
	}

	private static ArrayList<Integer> returnList(List<Integer> list) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int max_length_here = 0;
		int sum = 0;
		int start = 0, end = 0, p_index = 0, count = -1;
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 0) {
				max_length_here = 0;
				p_index = i + 1;
				continue;
			}
			max_length_here = max_length_here%(Integer.MAX_VALUE)+list.get(i)%(Integer.MAX_VALUE);
			if ( sum <= max_length_here) {
				flag = true;
				if(sum==max_length_here){
				if (i - p_index > count) {
					count = i - p_index;
					start = p_index;
					end = i;
				}
				}
				else{
					sum = max_length_here%Integer.MAX_VALUE;
					count = i - p_index;
					start = p_index;
					end = i;
				}
			}
		}
		if (flag) {
			for (int i = start; i <= end; i++) {
				list2.add(list.get(i));
			}
		}
		return list2;
	}
}

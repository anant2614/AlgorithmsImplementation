package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class Kadane {
	public static void main(String ghg[]) {
		int a[] = { -100, -200 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		int sum = 0;
		int max_length_here = 0;
		int max_val = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			max_length_here += list.get(i);
			if (max_length_here < 0) {
				if (max_val < max_length_here)
					max_val = max_length_here;
				max_length_here = 0;
			}
			if (sum < max_length_here)
				sum = max_length_here;
		}
		if (sum == 0)
			System.out.println(max_val);
		else
			System.out.println(sum);
	}
}

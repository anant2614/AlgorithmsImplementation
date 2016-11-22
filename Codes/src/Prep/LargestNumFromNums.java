package Prep;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumFromNums {
	public static void main(String gh[]) {
		Integer a[] = {1, 34, 3, 98, 9, 76, 45, 4};
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				return Integer.parseInt(String.valueOf(num2).concat(String.valueOf(num1)))
						- Integer.parseInt(String.valueOf(num1).concat(String.valueOf(num2)));
			}
		});
		System.out.println(list);
	}
}

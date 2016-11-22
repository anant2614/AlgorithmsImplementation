package Prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class MergeIntervals {
	public static void main(String[] args) {
		List<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(6, 8));
		list.add(new Interval(1, 9));
		list.add(new Interval(2, 4));
		list.add(new Interval(4, 7));

		Collections.sort(list, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.x - o2.x;
			}
		});

		Stack<Interval> stack = new Stack<Interval>();
		stack.push(list.get(0));

		for (int i = 1; i < list.size(); i++) {
			Interval interval = stack.peek();
			if (list.get(i).x < interval.y) {
				stack.pop();
				list.get(i).x = interval.x;
				list.get(i).y = list.get(i).y>interval.y?list.get(i).y:interval.y;
			}
			stack.push(list.get(i));
		}
		System.out.println(stack);
	}
}

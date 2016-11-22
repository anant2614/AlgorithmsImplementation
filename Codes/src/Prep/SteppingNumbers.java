package Prep;

import java.util.LinkedList;
import java.util.Queue;

public class SteppingNumbers {
	public static void main(String hd[]) {
		int max = 100;
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i <= 9; i++)
			queue.add(i);
		while (!queue.isEmpty()) {
			if (queue.peek() == 0) {
				System.out.println(queue.poll());
				continue;
			}
			int U = queue.poll();
			System.out.println(U);
			int last = U % 10;
			int V1 = U * 10 + last + 1;
			int V2 = U * 10 + last - 1;
			if (last == 0 && V1 <= max)
				queue.add(V1);
			else if (last == 9 && V2 <= max)
				queue.add(V2);
			else {
				if (V1 <= max)
					queue.add(V1);
				if (V2 <= max)
					queue.add(V2);
			}
		}
	}
}

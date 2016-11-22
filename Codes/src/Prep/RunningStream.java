package Prep;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningStream {
	static int count = 0;
	static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(10, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	});

	public static void main(String args[]) {
		addNum(1);
		addNum(5);
		addNum(2);
		System.out.println(getMedian(minHeap, maxHeap));
		addNum(20);
		addNum(6);
		System.out.println(getMedian(minHeap, maxHeap));
	}

	private static void addNum(int num) {
		if (maxHeap.isEmpty()) {
			maxHeap.add(num);
			count++;
			return;
		}
		if (num > maxHeap.peek()) {
			minHeap.add(num);
		} else {
			maxHeap.add(num);
		}
		count++;
		// check for sizes
		if (minHeap.size() - maxHeap.size() > 1) {
			int minRoot = minHeap.poll();
			maxHeap.add(minRoot);
		} else if (maxHeap.size() - minHeap.size() > 1) {
			int maxRoot = minHeap.poll();
			minHeap.add(maxRoot);
		}
	}
	
	private static int getMedian(PriorityQueue<Integer> minHeap,PriorityQueue<Integer> maxHeap){
		if(count%2==0)
			return (maxHeap.peek()+minHeap.peek())/2;
		if(minHeap.size()>maxHeap.size())
			return minHeap.peek();
		return maxHeap.peek();
	}
}

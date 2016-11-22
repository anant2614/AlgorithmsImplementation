package ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

	public Producer(BlockingQueue<String> blockingQueue) {
		queue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			System.out.println("Producing 1-->>  ");
			queue.put("1");
			System.out.println("Producing 2-->>  ");
			queue.put("2");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

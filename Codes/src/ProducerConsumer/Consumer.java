package ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

	public Consumer(BlockingQueue<String> blockingQueue) {
		queue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			System.out.println("Taking-->>  " + queue.take());
			System.out.println("Taking-->>  " + queue.take());
			System.out.println("Taking-->>  " + queue.take());
			System.out.println("Taking-->>  " + queue.take());
			System.out.println("Taking-->>  " + queue.take());
			System.out.println("Taking-->>  " + queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PCexample {
	
	public static void main(String args[]) throws InterruptedException {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
		Consumer consumer = new Consumer(queue);
		Producer producer = new Producer(queue);
		new Thread(consumer).start();
		Thread.sleep(3000);
		new Thread(producer).start();
	}
}

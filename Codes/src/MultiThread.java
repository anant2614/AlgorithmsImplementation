
public class MultiThread {
public static void main(String arg[]) throws InterruptedException {
	ThreadRun th = new ThreadRun();
	Thread th2 = new Thread(th);
	th2.start();
	for(int i=0;i<5;i++){
		System.out.println("Helllo...");
		Thread.sleep(1000);
	}
}
}


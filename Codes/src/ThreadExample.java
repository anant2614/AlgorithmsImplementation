
public class ThreadExample extends Thread{
public void run() {
	for(int i=1;i<6;i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}

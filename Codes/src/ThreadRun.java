
public class ThreadRun extends Thread{

	@Override
	public void run() {
		/*try {
			print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		String t=  Thread.currentThread().getName();
		System.out.println(t);
	}

	public    void print() throws InterruptedException {
		while(true){
			Thread t = Thread.currentThread();
			System.out.println("aaaa"+t.getName());
			Thread.sleep(1000);
		}
	}
	
	public    void print2() throws InterruptedException {
		while(true){
			Thread t = Thread.currentThread();
			System.out.println("bbb"+t.getName());
		}
	}

}

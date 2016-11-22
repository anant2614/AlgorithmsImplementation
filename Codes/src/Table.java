class Table {

	synchronized static void printTable(int n) throws InterruptedException {
		while(true){	
		System.out.println("bbbbbbbbbbbbbbbbbb");
		Thread.sleep(1000);
		}
	}

	public synchronized static void print() throws InterruptedException {
		while (true) {
			System.out.println("aaaa");
			Thread.sleep(1000);
		}
	}
}

class MyThread1 extends Thread {
	public void run() {
		try {
			System.out.println("In run..............");
			new Table().printTable(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		try {
			new Table().print();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
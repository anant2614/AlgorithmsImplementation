
public class Obj {
	int count = 0;

	public void modify() {
		synchronized (this) {
			int i = 0;
			while (i++ < 10) {
				count++;
				System.out.println(Thread.currentThread().getName() + "-->> first block");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("After first block--->>> "+Thread.currentThread().getName());

		synchronized (this) {
			int i = 0;
			while (i++ < 10) {
				count++;
				System.out.println(Thread.currentThread().getName() + "-->> second block");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		}
}
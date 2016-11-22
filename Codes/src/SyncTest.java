
public class SyncTest {
	public static void main(String args[]) {
	
		final Obj obj = new Obj();
		Thread one = new Thread() {
		    public void run() {
		    	obj.modify();
		    }
		};
		Thread two = new Thread() {
		    public void run() {
		    	obj.modify();
		    }
		};
		two.start();
		one.start();
		
	}
}

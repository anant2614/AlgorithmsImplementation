
public class Threadsmaple extends Thread {

	Obj obj = new Obj();
	public void run() {
		obj.modify();
	}
}

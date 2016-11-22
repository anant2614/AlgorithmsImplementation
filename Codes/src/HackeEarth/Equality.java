package HackeEarth;

public class Equality implements Runnable {
	 Thread t;
	    Equality() {
	        t = new Thread(this,"Hello");
	        t.start();
	    }
	    public void run() {
	        System.out.println(t.getName());
	    }
}

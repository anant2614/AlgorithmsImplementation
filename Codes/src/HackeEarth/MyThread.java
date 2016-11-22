package HackeEarth;

public class MyThread extends Thread{
	
	public void run(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);
				System.out.println("He's waiting for me....");
			} catch (InterruptedException e) {
			}
		}
	}
}

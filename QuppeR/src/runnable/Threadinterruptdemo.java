package runnable;

public class Threadinterruptdemo {
	public static void main(String[] args) {
		
	
		MyRunnable t = new MyRunnable();
		t.start();	  // main thread create child thread
		t.interrupt();// main thread interrupt child thread	
		System.out.println("main thread.");
	}
}

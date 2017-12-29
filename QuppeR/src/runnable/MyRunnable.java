package runnable;
public class MyRunnable extends Thread {

	static Thread mt;
	
	public void run() {
	try {
//		mt.join();
		for(int i=0;i<10;i++) {
//			System.out.println("child thread.");//job of a thread
			System.out.println("i am lazy thread.");
			Thread.sleep(1000);
	}
	}	
	catch(InterruptedException e) {}
		System.out.println("thread got interrupted");
	}
	
}

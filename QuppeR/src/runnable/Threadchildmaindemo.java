package runnable;
import java.lang.Thread;
public class Threadchildmaindemo {

	public static void main(String[] args) throws InterruptedException  {
		MyRunnable.mt = Thread.currentThread();//r is target runnable
		MyRunnable t = new MyRunnable();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread.");
			Thread.sleep(1000);
		}
	}

}

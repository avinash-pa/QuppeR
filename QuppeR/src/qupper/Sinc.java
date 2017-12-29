package qupper;


public class Sinc extends Thread{

	public String Name="default";
	public Sinc(String ThreadName) {
	 Name=ThreadName;
	 System.out.println("creating thread..."+Name);
	}
	
//	private Thread t= new Thread(this,Name);
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++) {
				System.out.println("Thread:" + Name + i);
			}
			System.out.println("thread is been created."+ Name);	
		}		
	}
	
}

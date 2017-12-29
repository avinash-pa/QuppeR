package test;

public class Talk {

	String name;
	Name na= new Name();

	public void name() {
		
		this.name=na.namesend();
	}
	
	public void talk() {
		Randomgene gene = new Randomgene();
		int n = gene.random();
		name();
		switch (n) 
		{
		case 1:
			System.out.println("Hello, "+ name + "how can i help you...");
			break;
		case 2:
			 System.out.println("hi, how i help you...");
			break;
		case 3:
			System.out.println("hello, may i help you "+ name);
			break;
		case 4:
			System.out.println("hey, "+ name +" good morning");
			break;
		case 5:
			System.out.println("hi, how r u? "+ name);
			break;
		}
		
	
	}
		public static void main(String[] args) {
			Talk say = new Talk();
			say.talk();
		}
}

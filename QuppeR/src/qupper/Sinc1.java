package qupper;

public class Sinc1 {

		
		public static void main(String[] args) {
			Sinc s= new Sinc("bing1 -");//thread instantiation
			Sinc s1= new Sinc("bing2 -");//thread instantiation 
			s.start();// thread starting
			s1.start();//thread starting			
		}

}

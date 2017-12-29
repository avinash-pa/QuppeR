package test;

import java.util.Random;
public class Randomgene{

	
	public int random() {
	Random rand = new Random();
	int n = rand.nextInt(5)+1;
	return n;
	}
}

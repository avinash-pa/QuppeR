package test;

public class Demo extends Exception{

	static void fun()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Caught inside fun().");
			throw e; // rethrowing the exception
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught in main.");
		}
	}
}

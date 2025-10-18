package exceptionhandling;

public class FinallyEx1 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("1");
			System.out.println("2");
			System.out.println(9/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();	
		}
		finally
		{
			System.out.println("4");
			System.out.println("5");
			System.out.println("6");
		}
		System.out.println("After try,catch and finally program ends here");
		
		
	}

}

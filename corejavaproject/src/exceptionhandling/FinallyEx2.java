package exceptionhandling;

public class FinallyEx2 
{
	public static void main(String[] args) 
	{
		int a=100,b=10,c=0;
		try
		{
			c=100/3;
			System.out.println("Division is: "+c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}	
		finally
		{
			c=a%b;
			System.out.println("Modulus is: "+c);
		}
		System.out.println("End");
	}

}

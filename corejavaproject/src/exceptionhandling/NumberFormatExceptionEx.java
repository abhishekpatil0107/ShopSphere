package exceptionhandling;

public class NumberFormatExceptionEx 
{
	public void input()
	{
		try
		{
			String s="Maharashtra";
			int i=Integer.parseInt(s);
			System.out.println("Ans is : "+i);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		int a=200,b=300;
		int c=a+b;
		System.out.println("Addition is :"+c);
	}
	
	public static void main(String[] args)
	{
		NumberFormatExceptionEx n1=new NumberFormatExceptionEx();
		n1.input();
//		int a=200,b=300;  // In both means compiletime and runtime other code execute successfully
//		int c=a+b'
//		System.out.println("Addition is "+c);	
	}

}

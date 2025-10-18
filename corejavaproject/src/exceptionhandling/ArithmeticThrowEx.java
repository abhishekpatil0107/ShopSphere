package exceptionhandling;

import java.util.Scanner;

public class ArithmeticThrowEx 
{
	int complex,real,result;
	Scanner sc=new Scanner(System.in);
	
	public void show() throws ArithmeticException,Exception
	{
		System.out.println("Enter first number: ");
		complex=sc.nextInt();
		System.out.println("Enter second number: ");
		real=sc.nextInt();
		result=complex/real;
	}
	public static void main(String[] args)
	{
		ArithmeticThrowEx a1=new ArithmeticThrowEx();
		try
		{
			a1.show();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("After try,catch and throws program ends here");
	}

}

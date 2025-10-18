package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTryCatchEx
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first number: ");
			int num1=sc.nextInt();
			System.out.println("Enter second number: ");
			int num2=sc.nextInt();
			int answer=0;
			
			answer=num1/num2;
			System.out.println("Ans is: "+answer);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End...");
	}

}

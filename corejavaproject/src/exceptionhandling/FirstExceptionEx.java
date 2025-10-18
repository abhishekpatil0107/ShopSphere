package exceptionhandling;
import java.util.Scanner;
public class FirstExceptionEx
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		
		int result=0;  
		
		try
		{
			result=num1/num2;
			System.out.println("Result is: "+result);
		}
		
		catch(Exception e)
		{
//			e.getMessage();
//			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("End of code...");
	}

}

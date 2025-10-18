package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionEx
{
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			System.out.println("Age is: "+age);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		int x=200,y=5;
		int mul=x*y;
		System.out.println("Mmultiplication is: "+mul);
	}

}

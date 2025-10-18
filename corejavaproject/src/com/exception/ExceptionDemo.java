package com.exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo
{
	int a;
	double b;
	Scanner sc=new Scanner(System.in);
	void add()
	{
		try 
		{
		System.out.println("Enter A: ");
		a=sc.nextInt();
		System.out.println("Enter B : ");
		b=sc.nextDouble();
		}
		catch(InputMismatchException i)
		{
			System.out.println(i);
		}
		finally
		{
			System.out.println("Add is: "+(a+b));
		}
	}
	
	public static void main(String[] args) 
	{
		ExceptionDemo d=new ExceptionDemo();
		d.add();
	}

}

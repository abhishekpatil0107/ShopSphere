package com.exception;
import java.util.Scanner;
public class Voting
{
	public static void main(String[] args) throws AgeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		
		if(age>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
			throw new AgeException("Not Eligible");
		}
		
		System.out.println("Rest of code...");
	}

}

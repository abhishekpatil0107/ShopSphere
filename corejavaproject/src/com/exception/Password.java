package com.exception;

import java.util.Scanner;

public class Password 
{
	public static void main(String[] args) throws PasswordException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password : ");
		String s=sc.next();
		
		if(s.length()>=8)
		{
			System.out.println("Password Created...");
		}
		else
		{
			System.out.println("Password must be 8 characters....");
			throw new PasswordException("Password must be 8 characters");
		}
	}

}

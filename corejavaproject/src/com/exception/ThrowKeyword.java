package com.exception;
import java.util.Scanner;
public class ThrowKeyword 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter any Positive number: ");
	    num=sc.nextInt();
	    
	    if (num>=0)
	    {
	      System.out.println("the number is: "+num);
	      
	    }
	    else 
	    {
	      throw new ArithmeticException("Number is Negative");
	      
	    }
		
		
	}

}

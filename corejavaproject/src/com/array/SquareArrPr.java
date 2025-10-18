package com.array;

import java.util.Scanner;

public class SquareArrPr
{
	public static void main(String[] args)
	{
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter values: ");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Squares are : ");
		for(i=0;i<5;i++)
		{
			System.out.println("Square of "+a[i]+" is : "+((a[i])*(a[i])));
		}
		
	}

}

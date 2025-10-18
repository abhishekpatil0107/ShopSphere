package com.array;
import java.util.Scanner;
//datatype obj=new datatype();0
public class ArrayClass
{
	public static void main(String[] args)
	{
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values: ");
		for(i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array values are: ");
		for(i=0;i<5;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}

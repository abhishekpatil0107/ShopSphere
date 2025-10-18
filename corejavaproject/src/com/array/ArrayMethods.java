package com.array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayMethods 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		
		
		//Length
		System.out.println(a.length);
		System.out.println("Enter values: ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		//Array Sorting
		Arrays.sort(a);
		System.out.println("Sorted array is: ");
		for(i=0;i<5;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("Smallest element is : "+a[0]);
		System.out.println("Largest element is : "+a[a.length-1]);
		
		
		//Search
		int x=Arrays.binarySearch(a, 1);
		if(x==0)
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
	}

}

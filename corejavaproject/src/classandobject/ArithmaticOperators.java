package classandobject;

import java.util.Scanner;

public class ArithmaticOperators {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");   a=sc.nextInt();
		System.out.println("Enter b: ");   b=sc.nextInt();
		
		int result=a+b;
		System.out.println("Add is "+result);
		//OR
		System.out.println("Addition is "+(a+b));
		
		result=a-b;
		System.out.println("Sub is "+result);
		
		result=a*b;
		System.out.println("Multi is "+result);
		
		result=a/b;
		System.out.println("Div is "+result);
		
		result=a%b;
		System.out.println("Remainder is "+result);
		
		
		
	}

}


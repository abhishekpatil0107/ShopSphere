package controlstatements;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter per : ");
		int per=sc.nextInt();
		if(per>=35) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		}
}

package controlstatements;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
  		int i=1;
		
//		while(i<=50)
//		{
//			System.out.println(i);
//			i++;
//		}
		
		
		//Even numbers
//		while(i<=50)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//			i++;
			
			
		//Table
		i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");   
		int k=sc.nextInt();
		while(i<=10)
		{
			System.out.println(k*i);
			i++;
		}
		}
}
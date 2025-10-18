package controlstatements;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
  		int i;
  		int j;
  		
     	//1 to 10
//		for(i=1; i<=10;i++)          //10 is no. of iterations 
//		{
//			System.out.println(i);
//			}
	
  		
        //3 to 12
//		int num=3;
//		for(i=1; i<=10;i++)
//		{
//			System.out.println(num);   num++;
//			}
 
  		
  	    //A to Z
//		char ch='A';
//		for(i=1;i<=26;i++)
//		{
//			System.out.println(ch);   ch++;
//		}
  		
  		
		//Z to A
//		char ch='Z';
//		for(i=1;i<=26;i++)
//		{
//			System.out.println(ch);   ch--;
//		}
  	
  		
  	    //Even numbers from 1 to 10
//  	for(i=1; i<=10;i++)
//  		{
//  			if(i%2==0)
//  			{
//  				System.out.println(i);
//  			}
//  		}
  		
  		
  		//Print * pattern
//  		for(i=1;i<=3;i++)
//  		{
//  			for(j=1;j<=4;j++)
//  			{
//  				System.out.print(" * ");
//  			}
//  			System.out.println();
//  		}
  		
  		//'*' Pattern with scanner
//  		Scanner sc=new Scanner(System.in);
//  		System.out.println("Enter starting number : ");   int s=sc.nextInt();
//  		System.out.println("Enter ending number : ");   int e=sc.nextInt();
//  		
//  		for(i=s;i<=e;i++)
//  		{
//  			for(j=s;j<=e;j++)
//  			{
//  				System.out.print(" * ");
//  			}
//  			System.out.println(" * ");
//  		}
  		
  		
  		int num=1;
  		for(i=1;i<=3;i++)
  		{
  			for(j=1;j<=3;j++)
  			{
  				System.out.print(" "+ num+ " "); num++;
  			}
  			System.out.println();
  		}
  		
  		
		
	}
}

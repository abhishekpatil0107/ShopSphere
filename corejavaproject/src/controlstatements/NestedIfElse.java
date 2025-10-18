package controlstatements;
import java.util.Scanner;
public class NestedIfElse {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter per : ");
			int per=sc.nextInt();
			
			
//			if(per>=35) 
//			{
//				if(per<=100) {
//				System.out.println("Pass");
//				}
//				else
//				{
//					System.out.println("Invalid");
//				}
//			}
//			else
//			{
//				if(per>=0)
//				{
//					System.out.println("Fail");
//				}
//				else
//				{
//					System.out.println("Invalid");
//				}
//			}
			
			
			
			
			//Logical Operators
			if(per>=35 && per<=100)
			{
				System.out.println("Passed");
			}
			else
			{
				if(per<0 || per>100)
				{
					System.out.println("Invalid");
				}
				else
				{
					System.out.println("Fail");
				}
			}
			
			
		}
}

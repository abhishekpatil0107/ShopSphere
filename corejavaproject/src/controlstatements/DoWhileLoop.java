package controlstatements;
import java.util.Scanner;
public class DoWhileLoop {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		do 
		{
			System.out.println("Enter any even number: ");
			num=sc.nextInt();
		}while(num%2==0);
	}

}

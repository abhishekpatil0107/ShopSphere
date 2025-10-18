package controlstatements;
import java.util.Scanner;
public class ForLoopScanner {
	public static void main(String[] args) {
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter starting number : ");   int s=sc.nextInt();
	System.out.println("Enter ending number : ");   int e=sc.nextInt();
	
	for(i=s;i<=e;i++)
	{
		System.out.println(i);
	}
	}
}

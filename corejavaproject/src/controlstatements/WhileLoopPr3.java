package controlstatements;
import java.util.Scanner;
public class WhileLoopPr3 {
	public static void main(String[] args) {
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int p=sc.nextInt();
		
		while(i<=10)
		{
			System.out.println((p*i));   
			i++;
		}
	}

}

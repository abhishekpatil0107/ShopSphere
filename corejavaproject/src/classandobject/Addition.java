package classandobject;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,add;
		System.out.println("Enter num 1 : ");
		num1=sc.nextInt();
		System.out.println("Enter num 2 : ");
		num2=sc.nextInt();
		add=num1+num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Add is : "+add);
		
	}

}

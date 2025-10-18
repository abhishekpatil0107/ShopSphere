package classandobject;
import java.util.Scanner;
public class ScannerClass {
	int a;
	double d;
	String s;
	char ch;
	public static void main(String[] args) {
		ScannerClass obj=new ScannerClass();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for A : ");
		obj.a=sc.nextInt();
		System.out.println("Enter value for D : ");
		obj.d=sc.nextDouble();
		System.out.println("Enter value for S : ");
		obj.s=sc.next();
		System.out.println("Enter value for Ch : ");
		obj.ch=sc.next().charAt(0);
		System.out.println("Value of a is : "+obj.a);
		
	}

}

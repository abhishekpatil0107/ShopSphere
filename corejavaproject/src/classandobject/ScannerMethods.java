package classandobject;
import java.util.Scanner;
public class ScannerMethods {
	public static void main(String[] args) {
		int num;
		double d;
		String s;
		String s1;
		char ch;
		float f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s1 : ");
		s1=sc.nextLine();           //to scan sentence
		System.out.println("Enter num : ");
		num=sc.nextInt();
		System.out.println("Enter double : ");
		d=sc.nextDouble();
		System.out.println("Enter float : ");
		f=sc.nextFloat();
		System.out.println("Enter s : ");
		s=sc.next();       //to scan a single word
		System.out.println("Enter char : ");
		ch=sc.next().charAt(0);
		
		System.out.println("Value of s1 is "+s1);
		System.out.println("Value of num is "+num);
		System.out.println("Value of double is "+d);
		System.out.println("Value of float is "+f);
		System.out.println("Value of string is "+s);
		System.out.println("Value of char is "+ch);
		
	}

}

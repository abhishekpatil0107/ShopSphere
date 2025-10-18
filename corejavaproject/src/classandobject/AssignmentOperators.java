package classandobject;
import java.util.Scanner;
public class AssignmentOperators {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");   a=sc.nextInt();
		System.out.println("Enter b: ");   b=sc.nextInt();
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
		
		a+=b;   //Same as a=a+b
		System.out.println("After changing value of a :"+a);
		
		a-=b;   //Same as a=a-b
		System.out.println("After changing value of a :"+a);
		
		a*=b;   //Same as a=a*b
		System.out.println("After changing value of a :"+a);
		
		a/=b;   //Same as a=a/b
		System.out.println("After changing value of a :"+a);
	}

}

package classandobject;
import java.util.Scanner;
public class UnaryOperators {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a :");   a=sc.nextInt();
		System.out.println("Value of a : "+a);
		a++;  //a=a+1
		System.out.println("After ++ : "+a);
		a--;  //a=a-1
		System.out.println("After -- : "+a);
		System.out.println("Negative : "+(-a));
		
	}

}

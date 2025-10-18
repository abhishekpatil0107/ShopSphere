package interfaces;
import java.util.Scanner;
interface Calculator
{
	public void accept();
	public void calculate();
	Scanner sc=new Scanner(System.in);
}

class Add implements Calculator
{
	int a,b;
	public void accept()
	{
		System.out.println("Enter a,b : ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void calculate() {
		System.out.println("Addition is: "+(a+b));	
	}
}

class Square implements Calculator
{
	int a;
	public void accept()
	{
		System.out.println("Enter a : ");
		a=sc.nextInt();
	}
	public void calculate() {
		System.out.println("Square  is: "+(a*a));	
	}
}


public class CalculatorImplementation 
{
	public static void main(String[] args) {
		Calculator c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter case: ");
		int k=sc.nextInt();
		
		switch(k) 
		{
		case 1: c=new Add(); c.accept();  c.calculate();  break;
		case 2: c=new Square(); c.accept();  c.calculate();  break;
		
		}
	}

}

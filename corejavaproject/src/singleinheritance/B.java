package singleinheritance;

public class B extends A 
{
	int b=20;
	
	public void showB()
	{
		System.out.println("value of b is :"+b);
	}
	
	public void mult()
	{
		System.out.println("Multiplication is :"+(a*b));
	}
	
	public static void main(String[] args)
	{
		B b=new B();
		b.showA();
		b.showB();
		b.mult();
	}

}

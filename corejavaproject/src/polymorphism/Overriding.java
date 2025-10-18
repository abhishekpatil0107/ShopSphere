package polymorphism;

class Parent 
{
	int x=20;
	public void method1()
	{
		System.out.println("Value of x is : "+x);
		System.out.println("This is parent class method");
	}
}

public class Overriding extends Parent {
	int x=10;
	public void method1()
	{
		System.out.println("Value of x is : "+x);
		System.out.println("This is child class method");
	}
	
	public static void main(String[] args)
	{
		Overriding o=new Overriding();
		o.method1();
	}

}

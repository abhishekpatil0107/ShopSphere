package polymorphism;

public class Overloading 
{
	public void method1()
	{
		System.out.println("This is no arg method");
	}
	public void method1(int a)
	{
		System.out.println("This is arg method");
	}
	public void method1(String x)
	{
		System.out.println("The value of x is : "+x);
	}
	public static void main(String[] args)
	{
		Overloading o=new Overloading();
		o.method1("2");   //String
		o.method1();		//default
		o.method1(78);		//int
	}
	

}

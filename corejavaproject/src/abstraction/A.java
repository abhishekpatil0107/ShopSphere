package abstraction;

abstract public class A 
{
	int a=10;     //normal variable
	public A()		//constructor
	{
		System.out.println("This is constructor");
	}
	abstract void abstractMethod();     //declaration: Abstract Methods
	
	//Non Methods
	public void publicMethod()
	{
		privateMethod();
		System.out.println("This is publlic method");
	}
	void defaultMethod()
	{
		System.out.println("This is default method");
	}
	private void privateMethod()
	{
		System.out.println("Private Methods");
		a++;
		System.out.println("Value of a after ++ : "+a);
	}
	final void finalMethod()
	{
		System.out.println("Final Methods");
	}
	static void staticMethod()
	{
		System.out.println("Static Methods");
	}
}

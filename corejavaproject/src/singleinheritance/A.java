package singleinheritance;

public class A
{
	int a=10;
	
	public void showA()
	{
		System.out.println("Value of A is :"+a);
	}
	
	public static void main(String [] args)
	{
		A obj=new A();
		obj.showA();
	}

}

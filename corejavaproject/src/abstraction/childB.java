package abstraction;

 public class childB extends A
{
	 void abstractMethod()
	{
		System.out.println("Abstract Method");
	}
	static void staticMethod()
	{
		System.out.println("Child class st method");
 
	}
	public static void main(String[] main)
	{
		childB c=new childB();
		c.defaultMethod();
		c.finalMethod();
		c.publicMethod();
		staticMethod();
		A.staticMethod();
		c.abstractMethod();    //overriding
		
	}

}

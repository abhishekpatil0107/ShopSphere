package constructor;

public class PConstructor 
{
	public PConstructor(String msg)
	{
		System.out.println("Mssg is :"+msg);
	}
	
	public static void main(String[] args)
	{
		PConstructor p=new PConstructor("Good Morning");
		PConstructor p1=new PConstructor("Good Morning Abhi");
		
	}
}

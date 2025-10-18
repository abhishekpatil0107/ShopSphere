package encapsulation;

public class BeanClass 
{
	private int a=10;
	int x=20;
	protected int z=30;
	public int k=40;
	
	
	public static void main(String[] args)
	{
		BeanClass b=new BeanClass();
		System.out.println("Inside the main...");
		System.out.println("Value of A is: "+b.a);    
		System.out.println("Value of x is: "+b.x);
		System.out.println("Value of Z is: "+b.z);
		System.out.println("Value of K is: "+b.k);
	}

}

package constructor;

public class DefaultConstructor
{
//	int r;
	public DefaultConstructor()
	{
//		this.r=45;
//		System.out.println("Value of r is :"+r);
		System.out.println("This is default constructor");
	}
	
	public static void main(String[] args)
	{
		DefaultConstructor d=new DefaultConstructor();
		DefaultConstructor d1=new DefaultConstructor();
	}
}

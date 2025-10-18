package keywords;

public class StaticKeywords
{
	int a;             //heap
	static int b=5;		//static
	
	public void showData()
	{
		System.out.println("Value of a "+a);
		System.out.println("Value of a "+b);
	}
	
	public static void main(String[] args)
	{
//		System.out.println(a);     //non static cannot be access in static members
		System.out.println(b);		//static can be access in both
	}
}

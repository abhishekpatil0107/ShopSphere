package multilevelinheritance;

public class B extends A
{
	int b=20;
	
	public void showB()
	{
		System.out.println("B is : "+b);
	}
	
	public void greater()
	{
		if(a>b)
		{
			System.out.println("Greater is : "+a);
		}
		else
		{
			System.out.println("Greater is : "+b);
		}
	}
	
	public static void main(String[] args)
	{
		B obj=new B();
		obj.showA();
		obj.showB();
		obj.greater();
	}
	

}

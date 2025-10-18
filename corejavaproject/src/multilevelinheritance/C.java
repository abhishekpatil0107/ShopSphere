package multilevelinheritance;

public class C extends B
{
	int c;
	
	public void greater()
	{
		if(a>b)
		{
			c=a;
		}
		else
		{
			c=b;
		}
	}
	
	public void showC()
	{
		greater();
		System.out.println("Value of c is :"+c);
	}
	
	public static void main(String[] args)
	{
		C obj=new C();
		obj.showA();
		obj.showB();
		obj.showC();
	}

}

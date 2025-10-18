package interfaces;

interface Parent    //In functional interface datatype become final
{
	int a=10;    
	public void show();
//	public void accept();
}

public class ChildClass implements Parent
{
	public void show()
	{
		//a++;   final field cannot be reinitialized
		System.out.println("This is inherited method "+a);
	}
	
	public static void main(String[] args)
	{
		ChildClass c=new ChildClass();
		c.show();
	}
}

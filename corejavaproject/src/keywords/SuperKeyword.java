package keywords;

class Parent
{
	int x=10;
	public void showX()
	{
		System.out.println("Value of x is : "+x);
		System.out.println("THis is parent class method");
	}
}
public class SuperKeyword extends Parent
{
	int x=50;
	public void showX()
	{
		super.showX();
		System.out.println("Value of x is : "+super.x);		//10
		System.out.println("Value of x is : "+x);			//50
	}
	
	public static void main(String[] args)
	{
		SuperKeyword k=new SuperKeyword();
		k.showX();
	}

}

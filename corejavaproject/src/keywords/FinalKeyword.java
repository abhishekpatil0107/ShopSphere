package keywords;

public class FinalKeyword
{
	final int a=10;
	int b=20;
	
	void show()
	{
		System.out.println("Valuemof a is : "+a);
		System.out.println("Valuemof b is : "+b);
	}
	
	void increment()
	{
//		a++;   //final field cannot be changed
		b++;
		System.out.println("After increment A,B is : "+a+","+b);
	}
	
	public static void main(String[] args)
	{
		FinalKeyword f=new FinalKeyword();
		f.show();
		f.increment();
		
	}

}

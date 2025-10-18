package constructor;

public class DConstructor
{
	int r;
	String n;
	double d;
	
	public DConstructor()
	{
		this.r=10;
		this.n="ASD";
		this.d=23.32;
	}
	
	public void show()
	{
		System.out.println("Value of r is :"+r);
		System.out.println("Value of n is : "+n);
		System.out.println("Value of d is : "+d);
	}
	
	public static void main(String[] args)
	{
		DConstructor d=new DConstructor();
		d.show();
	}

}


//1.Class Loading
//2.Instantiate (object creation)
//3.Initialization and performing a task 
//4 Destroy

//Constructor : Is is a special method of class.
//              It is also an member finction of class
//				

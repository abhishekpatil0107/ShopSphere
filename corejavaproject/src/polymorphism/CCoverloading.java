package polymorphism;

public class CCoverloading 
{
	int x,y;
	CCoverloading()
	{
		System.out.println("Value of x and y is : "+x+" & "+y);
	}
	CCoverloading(int x)
	{
		this.x=x;
		System.out.println("Value of x and y is : "+x+" & "+y);
	}
	CCoverloading(int x,int y)
	{
		this.x=x;  this.y=y;
		System.out.println("Value of x and y is : "+x+" & "+y);
	}
	
	public static void main(String[] args)
	{
		CCoverloading c=new CCoverloading();  		//0,0
		CCoverloading c1=new CCoverloading(2,4);  	//2,4
		CCoverloading c2=new CCoverloading(8);		//8,0
		
	}

}

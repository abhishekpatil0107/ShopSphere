package abstraction;

public class TriangleShape extends Shape
{
	
	public void calculate_area()
	{
		System.out.println("Enter a: ");     //a=height
		int a=sc.nextInt();
		System.out.println("Enter b: ");	//b=base
		int b=sc.nextInt();
		area=(a*b)/2;
		System.out.println("Area of triangle : "+area);
		
	}
	
	public void calculate_circumference()
	{
		
		
	}
	
	public static void main(String[] args)
	{
		TriangleShape t=new TriangleShape();
		t.calculate_area();
		t.calculate_circumference();	}
	

}

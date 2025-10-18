package abstraction;

public class CircleShape extends Shape {
	int r;

	public void calculate_area()
	{
		System.out.println("Enter r: ");
		int r=sc.nextInt();
		area=3.14*r*r;
		System.out.println("Area of circle : "+area);
	}

	public void calculate_circumference() 
	{	
		System.out.println("Enter r: ");
		int r=sc.nextInt();
		circumference=2*3.14*r;
		System.out.println("Cicum is : "+circumference);
		
	}
	
	public static void main(String[] args)
	{
		CircleShape c=new CircleShape();
		c.calculate_area();
		c.calculate_circumference();
	}
}

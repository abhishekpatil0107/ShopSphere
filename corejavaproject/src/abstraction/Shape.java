package abstraction;
import java.util.Scanner;
abstract public class Shape
{
	public double area;
	public double circumference;
	
	public abstract void calculate_area();
	public abstract void calculate_circumference();
	Scanner sc=new Scanner(System.in);
	

	public void show()
	{
		
	}
}

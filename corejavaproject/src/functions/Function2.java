package functions;

import java.util.Scanner;

public class Function2 
{
	int r;
	Scanner sc=new Scanner(System.in);
	
	//No parameters no return value
//	public void calculateArea()
//	{
//		System.out.println("Enter r : ");
//		r=sc.nextInt();
//		System.out.println("Area of circle is :"+(3.14*(r*r)));
//	}
	
	
	//With para no return
//	public void calculateArea2(int r)
//	{
//		System.out.println("Area of circle is :"+(3.14*(r*r)));
//	}
	
	
	//No para but return
	public double calculateArea3()
	{
		System.out.println("Enter r : ");
		r=sc.nextInt();
		return 3.14*(r*r);
	}
	
	
	//With para & return value
//	public double calculateArea4(int r)
//	{
//		return 3.14*(r*r);
//	}

	
	
	public static void main(String[] args)
	{
		Function2 t=new Function2();
//		t.calculateArea();
//		t.calculateArea2(4);
		System.out.println("Area of circle is: "+t.calculateArea3());
//		System.out.println("Area of circle is: "+t.calculateArea4(2));
		
		
		 
	}

	
}

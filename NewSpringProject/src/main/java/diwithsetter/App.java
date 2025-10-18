package diwithsetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Square s1=context.getBean(Square.class);
		System.out.println("Value of number is: "+s1.getNo().getNo());
		System.out.println("Square of no. is: "+s1.sqr());
		
		Cube c1=context.getBean(Cube.class);
		System.out.println("Cube of no. is: "+c1.cube());
		
		Squareroot st1=context.getBean(Squareroot.class);
		System.out.println("Sqrt of no. is: "+st1.sqrrt());
		
	}

}

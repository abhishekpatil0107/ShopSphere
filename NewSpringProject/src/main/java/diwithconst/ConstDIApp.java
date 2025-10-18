package diwithconst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import diwithsetter.Square;

public class ConstDIApp
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Addition a1=context.getBean(Addition.class);
		
		System.out.println("Value of A is: "+a1.getC().getA());
		System.out.println("Value of B is: "+a1.getC().getB());
		System.out.println("Addition is: "+a1.add());
		
		Division d1=context.getBean(Division.class);
		
		System.out.println("Value of A is: "+d1.getC().getA());
		System.out.println("Value of B is: "+d1.getC().getB());
		System.out.println("Division is: "+d1.div());
	}
	

}

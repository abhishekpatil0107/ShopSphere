package diwithcomponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppComponent 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Square s2=context.getBean(Square.class);
		
		s2.getNo().setNo(5);
		System.out.println("Square is: "+s2.sqr());
		
	}

}

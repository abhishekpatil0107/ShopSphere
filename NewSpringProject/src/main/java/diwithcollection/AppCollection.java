package diwithcollection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppCollection 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Company c=context.getBean(Company.class);
		
		System.out.println(c.getCid());
		System.out.println(c.getCname());
		System.out.println("Employee list: ");
		
//		List<Employee>list=c.getElist();
//		for(Employee emp:list)
//		{
//			System.out.println(emp);
//		}
		
		Employee e[]=c.getEmp();
		for(Employee emp:e)
		{
			System.out.println(emp);
			
		}
		
		
	}

}

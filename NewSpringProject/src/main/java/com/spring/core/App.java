package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student1=(Student) context.getBean("student");
        System.out.println(student1);
        
        Employee emp1=(Employee) context.getBean("employee");
        System.out.println(emp1);
    }
}

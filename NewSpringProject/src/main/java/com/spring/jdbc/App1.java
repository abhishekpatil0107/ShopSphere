package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 
{
public static void main(String[] args) 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    StudentDAO studentDAO=context.getBean("studentDAO",StudentDAO.class);
    
    Student student=new Student();
    student.setName("Adittya");
    student.setAddress("ABC");
    student.setMarks(45);
    
    int result=studentDAO.insert(student);
    System.out.println("hsdva"+result);
}
}

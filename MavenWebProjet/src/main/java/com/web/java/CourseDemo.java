package com.web.java;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CourseDemo
{
	public static void main(String[] args)
	{
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		s.beginTransaction();
		
//		Course c=new Course();
//		c.setCname("Java Fullstack");
//		c.setCdesc("It is frontend & backend involve to build develoer");
//		c.setCprice("10000");
//		s.save(c);
//		
//		
//		Course c1=new Course();
//		c1.setCname("Python Fullstack");
//		c1.setCdesc("It is frontend & backend involve to build develoer");
//		c1.setCprice("20000");
//		s.save(c1);
//		
//	
//		Course c2=new Course();
//		c2.setCname("MERN stack");
//		c2.setCdesc("It is frontend & backend involve to build develoer");
//		c2.setCprice("15000");
//		s.save(c2);
//		
//		
//		s.getTransaction().commit();
		
//		Criteria cc=s.createCriteria(Course.class);
//		List<Course> list=cc.list();
//		System.out.println(list);
//		s.close();
		
		Course cc=s.get(Course.class, 2);
		System.out.println(cc);
		
		Student ss=s.get(Student.class, 1);
		System.out.println(ss);
		
		Enroll e=new Enroll();
		e.setCc(cc);
		e.setSs(ss);
		
		s.save(e);
		s.getTransaction().commit();
		s.close();
	}

}

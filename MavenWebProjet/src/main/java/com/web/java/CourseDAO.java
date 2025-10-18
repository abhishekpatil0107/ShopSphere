package com.web.java;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CourseDAO 
{
	public static void addCourses(Course c)
	{
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		s.beginTransaction();
		s.save(c);
		s.getTransaction().commit();
	}
	
	public static List<Course> getallCourses()
	{
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		s.beginTransaction();
		Query query=s.createQuery("from Course");
		List<Course>clist=query.list();
		return clist;
	}
	
	public static Course getCoursebyId()
	{
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		s.beginTransaction();
		
		Course c=s.get(Course.class,"cid");
		return c;
	}
	

}

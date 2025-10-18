package com.web.java;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentDAO
{
	public static void addStudent(Student st) 
	{
//		Configuration cfg=new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory factory=cfg.buildSessionFactory();
//		Session session = factory.openSession();
		
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		s.beginTransaction();
		System.out.println(st);
		s.save(st);
		s.getTransaction().commit();
		s.close();
		//System.out.println("Data added successfully");
	}
	
	public static boolean login(String email,String password)
	{
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		s.beginTransaction();
		
		Query query=s.createQuery("from Student where email=:email and password=:password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		List<Student>list=query.list();
		
		if(list.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}

}

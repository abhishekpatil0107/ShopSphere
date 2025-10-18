package com.hibernate.without.maven;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main(String[] args)
	{
		System.out.println("Connect Successfully...");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee e1=new Employee();
		e1.setEid(4);
		e1.setEname("Mayur");
		e1.setAddress("Pune");
		e1.setEsal(80000);
		
		Address a1=new Address();
		a1.setCity("Pune");
		a1.setStreet("Kolhapur Road");
		a1.setX(45.21);
		a1.setOpen(true);
		a1.setAddedDate(new Date());
		
		Session s1=factory.openSession();
		Transaction tx=s1.beginTransaction();
		s1.save(a1);
		s1.save(e1);
		tx.commit();
		s1.close();
		
		
		
	}

}

package com.mapping.hiber;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp1 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question1 que=new Question1();
		que.setQuestion_id(1111);
		que.setQuestion("What is hibernate?");
		
		Answer1 ans1=new Answer1();
		ans1.setAns_id(1011);
		ans1.setAnswer("Hibernate is open source framework");
		ans1.setQuestion(que);
		
		Answer1 ans2=new Answer1();
		ans2.setAns_id(1012);
		ans2.setAnswer("Hibernate is depend on ORM tool");
		ans2.setQuestion(que);
		
		Answer1 ans3=new Answer1();
		ans3.setAns_id(1013);
		ans3.setAnswer("Hibernate is Non_Recursive framework");
		ans3.setQuestion(que);
		
		Answer1 ans4=new Answer1();
		ans4.setAns_id(1014);
		ans4.setAnswer("Using hibernate we dontneed to write query manually");
		ans4.setQuestion(que);
		
		
		List<Answer1>list=new ArrayList<Answer1>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		list.add(ans4);
		que.setList(list);
		
	    Session s1=factory.openSession();
		Transaction tx=s1.beginTransaction();
		
		s1.save(que);
		s1.save(ans1);
		s1.save(ans2);
		s1.save(ans3);
		s1.save(ans4);
		

		tx.commit();
		
		s1.close();
		factory.close();
		System.out.println("Done");
	}

}

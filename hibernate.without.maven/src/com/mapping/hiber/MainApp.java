package com.mapping.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question q1=new Question();
		q1.setQuestionId(1212);
		q1.setQueston("What is Java");
		
		Answer a1=new Answer();
		a1.setAnswerId(343);
		a1.setAnswer("It is OOP language");
		a1.setQuestion(q1);
		q1.setAnswer(a1);
		
		Question q2=new Question();
		q2.setQuestionId(242);
		q2.setQueston("What is collection framework");
		
		Answer a2=new Answer();
		a2.setAnswerId(344);
		a2.setAnswer("API to work with object in java");
		a2.setQuestion(q2);
		q2.setAnswer(a2);
		
		Session s1=factory.openSession();
		Transaction tx=s1.beginTransaction();
		s1.save(q1);
		s1.save(a1);
		s1.save(q2);
		s1.save(a2);
		
		//Fetching data
		
		Question que=(Question)s1.get(Question.class,242);
		System.out.println(que.getQueston());
		System.out.println(que.getAnswer().getAnswer());
		
		tx.commit();
		
		s1.close();
		factory.close();

	}

}

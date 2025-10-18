package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Connect Succesfully..." );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        //System.out.println(factory.isClosed());
        
        Student s1=new Student();
        s1.setRollno(1);
        s1.setName("Abhi");
        s1.setAddress("Kop");
        s1.setMarks(80);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(s1);
        tx.commit();
        
    }
}

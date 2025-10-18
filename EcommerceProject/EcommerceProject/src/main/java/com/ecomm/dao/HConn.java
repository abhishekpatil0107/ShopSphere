package com.ecomm.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HConn {



    private static Session s = null;

    public static Session getSessionFactory() {

       s = new Configuration().configure().buildSessionFactory().openSession();

        

        return s;

    }



	

}
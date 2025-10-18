package com.ecomm.dao;

import org.hibernate.Session;

import com.ecomm.entity.Cart;

public class CartDao
{
    private static Session s = HConn.getSessionFactory();

    public static boolean saveCart(Cart c)
    {
    	s.beginTransaction();
    	System.out.println("In Dao"+c);
        s.save(c);
        s.getTransaction().commit();
        return true;
    }

    public static boolean updateCart(Cart c)
    {
        s.save(c);
        s.getTransaction().commit();
        return true;
    }
}


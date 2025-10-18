package com.ecomm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.ecomm.entity.User;

public class UserDao
{
	 private static Session s = HConn.getSessionFactory();
	
    public static boolean registerUser(User u)
    {
        	s.beginTransaction();
        	s.save(u);
        	s.getTransaction().commit();
        	return true;
    }
    public static User loginUser(String e, String p)
    {
      User user= (User) s.createQuery("from User where email=:email and password=:password")
        .setParameter("email", e)
        .setParameter("password", p)
        .uniqueResult();

      return user;
    }
    
    public static User findUserByEmail(String e)
    {
    	User user=(User) s.createQuery("from User where email=:email")
    			.setParameter("email", e).uniqueResult();
		return user;	
    }
    
    
    public static int UpdatePassword(String e, String p)
    {
        int result= s.createQuery("update User SET password=:password where email=:email")
            .setParameter("email", e)
            .setParameter("password", p).executeUpdate();

        s.getTransaction().commit();

        return result;
    }
    public static boolean UpdateUser(User user)
    {
        User newuser=s.get(User.class, user.getUserid());
        newuser.setCart(user.getCart());
        s.saveOrUpdate(newuser);
        // s.update(user);
        s.getTransaction().commit();
        return true;
    }


}

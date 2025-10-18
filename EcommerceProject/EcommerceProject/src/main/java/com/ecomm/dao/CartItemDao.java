package com.ecomm.dao;
import java.util.List;
import org.hibernate.Session;
import com.ecomm.entity.CartItem;

public class CartItemDao
{
    private static Session s = HConn.getSessionFactory();

    public static boolean saveCartItem(CartItem ci)
    {
    	s.beginTransaction();
        s.save(ci);
        s.getTransaction().commit();
        return true;
    }

    public static List<CartItem> getAllCartItems()
    {
        return s.createQuery("from CartItem").list();
    }
}

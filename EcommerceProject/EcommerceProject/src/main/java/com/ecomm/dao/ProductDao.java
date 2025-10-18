package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;

import com.ecomm.entity.Product;


public class ProductDao 
{
	private static Session s=HConn.getSessionFactory();
	
	public static List<Product> getAllProducts()
	{
		s.beginTransaction();
		return s.createQuery("from Product").list();
		
	}
	
	public static Product getProductById(int id)
	{
		if(s.getTransaction() ==null)
		{
			s.beginTransaction();
		}
		return s.get(Product.class, id);
	}
	



}
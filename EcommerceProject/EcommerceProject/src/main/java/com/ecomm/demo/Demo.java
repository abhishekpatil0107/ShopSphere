package com.ecomm.demo;

import org.hibernate.Session;

import com.ecomm.dao.HConn;
import com.ecomm.dao.ProductDao;
import com.ecomm.entity.Product;

public class Demo {
	public static void main(String[] args) {
		
        Session s = HConn.getSessionFactory();

        s.beginTransaction();
        
        Product p1 = new Product();
        p1.setName("Top 1");
        p1.setCategary_name("Electronics");
        p1.setDescription("Electronics  items are here");
        p1.setPrice(200);
        p1.setStock(10);
        p1.setImage_url("./img/product-1.jpeg");
        

        Product p2 = new Product();
        p2.setName("Top 2");
       
        p2.setCategary_name("Beauty Products");
        p2.setDescription("Beauty Products here");
        p2.setPrice(499.50);
        p2.setStock(8);
        p2.setImage_url("./img/product-2.jpeg");

        Product p3 = new Product();
        p3.setName("Top 3");
     
        p3.setCategary_name("Mobile Accesories");
        p3.setDescription("Mobiles and accessories");
        p3.setPrice(399.00);
        p3.setStock(15);
        p3.setImage_url("./img/product-3.jpeg");

        Product p4 = new Product();
        p4.setName("Top 4");
       
        p4.setCategary_name("Educational");
        p4.setDescription("Books,Pens,Notebooks");
        p4.setPrice(199.00);
        p4.setStock(20);
        p4.setImage_url("./img/product-4.jpeg");

        Product p5 = new Product();
        p5.setName("Top 5");
      
        p5.setCategary_name("Clothes");
        p5.setDescription("All type wear for men & women");
        p5.setPrice(599.00);
        p5.setStock(6);
        p5.setImage_url("./img/product-5.jpeg");

        Product p6 = new Product();
        p6.setName("Top 6");
   
        p6.setCategary_name("Watches");
        p6.setDescription("All branded watches are here");
        p6.setPrice(349.75);
        p6.setStock(12);
        p6.setImage_url("./img/product-6.jpg");

        Product p7 = new Product();
        p7.setName("Top 7");
        
        p7.setCategary_name("Bags");
        p7.setDescription("All types of bag are available here");
        p7.setPrice(449.00);
        p7.setStock(7);
        p7.setImage_url("./img/product-7.jpeg");

        Product p8 = new Product();
        p8.setName("Top 8");
      
        p8.setCategary_name("Kitchen Accesories");
        p8.setDescription("Each kitchen product is here");
        p8.setPrice(549.99);
        p8.setStock(9);
        p8.setImage_url("./img/product-8.jpeg");

        s.save(p1);
        s.save(p2);
        s.save(p3);
        s.save(p4);
        s.save(p5);
        s.save(p6);
        s.save(p7);
        s.save(p8);

        
        s.getTransaction().commit();
        
        System.out.println(ProductDao.getProductById(2));			
        System.out.println(ProductDao.getAllProducts());
    }
}
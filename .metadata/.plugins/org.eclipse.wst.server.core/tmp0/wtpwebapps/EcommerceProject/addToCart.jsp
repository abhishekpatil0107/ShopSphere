<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ecomm.dao.CartItemDao"%>
<%@page import="com.ecomm.entity.CartItem"%>
<%@page import="java.util.List"%>
<%@page import="com.ecomm.dao.UserDao"%>
<%@page import="com.ecomm.dao.CartDao"%>
<%@page import="com.ecomm.entity.Cart"%>
<%@page import="com.ecomm.dao.ProductDao"%>
<%@page import="com.ecomm.entity.Product"%>
<%@page import="com.ecomm.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add To Cart</title>
</head>
<body>
<% 
	User user=(User) session.getAttribute("user");
	session.setAttribute("user",user);
	System.out.println("addtocart.jsp"+user);

	int pid=Integer.parseInt(request.getParameter("pid"));
	Product p=ProductDao.getProductById(pid);
	
	System.out.println(p);

	Cart cart=user.getCart();
	
		if(cart == null)
			{
  		  	  System.out.println(cart);
  			  cart = new Cart();
    		  cart.setUser(user);
    		  CartDao.saveCart(cart);

    		  user.setCart(cart);
   			  UserDao.UpdateUser(user);
     		}
		
		List<CartItem> clist=cart.getClist();
		CartItem ci=new CartItem();
		ci.setCart(cart);
		ci.setP(p);
	  	//cart.setClist(clist);
		CartItemDao.saveCartItem(ci);

//CartDao.updateCart(cart);

response.sendRedirect("viewcart.jsp");
%>


</body>
</html>
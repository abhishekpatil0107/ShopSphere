<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="com.ecomm.entity.Product"%>
<%@page import="com.ecomm.dao.ProductDao"%>
<%@page import="com.ecomm.entity.User"%>
<%@page import="com.ecomm.dao.UserDao"%>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
<link rel="stylesheet" href="styles.css">
<style>
.hero-section {
	background-image: url("img/hero.jpg");
	height: 100px;
	background-size: cover;
	display: flex;
	justify-content: center;
	align-items: flex-end;
}



    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(to right, #f8f9fa, #e9ecef);
        margin: 0;
        padding: 0;
    }

    .product-details {
        max-width: 1000px;
        margin: 50px auto;
        background-color: #ffffff;
        box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
        border-radius: 12px;
        overflow: hidden;
        padding: 30px;
    }

    .product-header {
        display: flex;
        flex-direction: row;
        gap: 40px;
        align-items: center;
    }

    .product-header img {
        width: 300px;
        height: auto;
        border-radius: 8px;
        object-fit: cover;
        border: 1px solid #ddd;
    }

    .product-info h1 {
        margin-top: 0;
        font-size: 2.5rem;
        color: #343a40;
    }

    .product-info p {
        font-size: 1.1rem;
        color: #6c757d;
        line-height: 1.6;
    }

    .add-to-cart {
        margin-top: 20px;
        background-color: #28a745;
        color: white;
        border: none;
        padding: 12px 25px;
        border-radius: 6px;
        font-size: 1rem;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    .add-to-cart:hover {
        background-color: #218838;
    }
</style>
</head>
<body>
<header>
		<h1>AP Mart</h1>
		<nav>
			<ul>
			<li><a href="Register.jsp">Register</a></li>
			<li><a href="Login.jsp">Login</a></li>
				<li><a href="Product.jsp">Products</a></li>
				<li><a href="viewcart.jsp">Cart</a></li>
				<li><a href="index.jsp">LogOut</a></li>
			</ul>
		</nav>
	</header>

	<div class="hero-section">
		
	</div>
<%
	int id=Integer.parseInt(request.getParameter("pid"));
	Product p=ProductDao.getProductById(id);

	User user=(User) session.getAttribute("user");
	session.setAttribute("user",user);
	System.out.println("pd.jsp"+user);
%>

<div class="product-details">
	<div class="product-header">
		<img src="<%=p.getImage_url() %>" alt="Product Image">
		<div class="product-info">
			<h1><%=p.getName() %></h1>
			<p><%=p.getDescription() %></p>
			<a href="addToCart.jsp?pid=<%=p.getId() %>">
			<button class="add-to-cart">Add To Cart</button></a>
	</div>
</div>


</div>
</body>
</html>
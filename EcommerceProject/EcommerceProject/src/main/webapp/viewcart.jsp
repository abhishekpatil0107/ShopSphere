<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.ecomm.dao.CartItemDao"%>
    <%@page import="java.util.List"%>
    <%@page import="com.ecomm.entity.CartItem"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Cart</title>
<link rel="stylesheet" href="styles.css">
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }

    .cart-container {
        max-width: 900px;
        margin: 40px auto;
        background-color: #fff;
        padding: 30px;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        border-radius: 10px;
    }

    h1 {
        text-align: center;
        margin-bottom: 30px;
        color: #333;
    }

    .cart-items {
        display: flex;
        flex-direction: column;
        gap: 20px;
    }

    .cart-item {
        display: flex;
        align-items: center;
        gap: 20px;
        padding: 15px;
        border: 1px solid #ddd;
        border-radius: 8px;
        background-color: #fafafa;
    }

    .cart-item img {
        width: 100px;
        height: 100px;
        object-fit: cover;
        border-radius: 6px;
        border: 1px solid #ccc;
    }

    .cart-items-details {
        flex-grow: 1;
    }

    .cart-items-details h3 {
        margin: 0 0 10px 0;
        font-size: 18px;
        color: #222;
    }

    .cart-items-details p {
        margin: 0;
        color: #666;
        font-weight: bold;
    }

    .cart-item-actions {
        display: flex;
        flex-direction: column;
        align-items: flex-end;
        gap: 10px;
    }

    .quantity input {
        width: 60px;
        padding: 5px;
        font-size: 16px;
    }

    .remove-btn {
        background-color: #ff4d4d;
        color: white;
        padding: 6px 12px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    .remove-btn:hover {
        background-color: #e60000;
    }

    .cart-summary {
        text-align: right;
        margin-top: 30px;
        font-size: 20px;
        font-weight: bold;
        color: #333;
    }

    .checkout-btn {
        margin-top: 10px;
        padding: 10px 20px;
        background-color: #4CAF50;
        color: white;
        font-size: 16px;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    .checkout-btn:hover {
        background-color: #45a049;
    }
</style>

</head>
<body>
<header>
        <h1>AP Mart</h1>
        <nav>	
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="Register.jsp">Register</a></li>
                <li><a href="Login.jsp">Login</a></li>
                <li><a href="viewcart.jsp">Cart</a></li>
            </ul>
        </nav>
    </header>
    <%
    List<CartItem> clist=CartItemDao.getAllCartItems();
    %>
    
    <div class="cart-container">
    <h1>Your Shopping Cart</h1>
    <div class="cart-items">
    <%
    for(CartItem ci:clist)
    {
    %>
        <div class="cart-item">
        <img src="<%=ci.getP().getImage_url() %>"alt="Product Image">
        <div class="cart-items-details">
        	<h3><%=ci.getP().getName() %></h3>
        	<p><%=ci.getP().getPrice() %></p>
        </div>
      		  <div class="cart-item-actions">
       				 <div class="quantity">
        					<label for="quantity">Qty:</label>
        					<input type="number" id="quantity" min="1" value="1">
       				 </div>
       				 <button class="remove-btn">Remove</button>
        	  </div>
        </div>
        <%
        }
        %>
    </div>
    <div class="cart-summary">
    <h3>Total:5545</h3>
    <a href="index.jsp">
    <button class="checkout-btn">Proceed to Checkout</button>
    </div>
    </div>
</body>
</html>
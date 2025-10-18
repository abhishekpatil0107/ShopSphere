<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
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
                <li><a href="Product.jsp">Products</a></li>
                <li><a href="Cart.jsp">Cart</a></li>
            </ul>
        </nav>
    </header>
    
    <div class="hero-section"></div>
    
  <%
    String errorMsg = (String) request.getAttribute("errorMsg");
    if (errorMsg != null) {
%>
    <div style="color: red; text-align: center; margin: 20px auto; font-weight: bold;">
        <%= errorMsg %>
    </div>
<%
    }
%>

    
   <h2 class="formtitle">Login</h2>
    <form action="loginUser.jsp" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <button type="submit">Login</button>
        <a href="forgotpassword.jsp">Forgot Password?</a>
    </form>
</body>
</html>

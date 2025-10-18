<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>Welcome to AP Mart</h1>
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
    
    <h2 class="formtitle">Register</h2>
    
    <form action="regUser.jsp" method="post">
        <label for="fname">Full Name:</label>
        <input type="text" id="fname" name="fname" required>
        
        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        
        <label for="mob">Mobile No:</label>
        <input type="number" id="mob" name="mob" required>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        
        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required>
        
        <button type="submit">Register</button>
    </form>
</body>
</html>

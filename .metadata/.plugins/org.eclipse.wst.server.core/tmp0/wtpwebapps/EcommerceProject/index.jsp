<%@page import="com.ecomm.entity.Product"%>
<%@page import="com.ecomm.dao.ProductDao"%>
<%@page import="java.util.List"%>
<%@page import="com.ecomm.entity.User"%>
<%@page import="com.ecomm.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home Page</title>
<link rel="stylesheet" href="styles.css">
<style>
/** Hero section **/
.hero-section {
	background-image: url("img/hero.jpg");
	height: 400px;
	background-size: cover;
	display: flex;
	justify-content: center;
	align-items: flex-end;
}

.hero-msg {
	background-color: white;
	color: black;
	height: 40px;
	display: flex;
	align-items: center;
	justify-content: center;
	font-size: 0.85rem;
	width: 97%;
	margin-bottom: 30px;
}

.hero-msg a {
	color: #007185;
}

/**Shop section**/
.shop-section {
	display: flex;
	flex-wrap: wrap;
	justify-content: space-evenly;
	background-color: #fed851;
}

.box {
	height: 490px;
	width: 23%;
	background-color: white;
	padding: 20px, 0px, 15px;
	margin-bottom: 25px;
}

.box-img {
	height: 300px;
	background-size: cover;
	margin-top: 10px;
	margin-bottom: 10px;
}

.box-content {
	margin: 25px;
}

.box-content p {
	color: #007185;
}
</style>
</head>
<body>
	<header>
		<h1>AP Mart🛒</h1>
		<nav>
			<ul>
			<li><a href="Register.jsp">Register</a></li>
			<li><a href="Login.jsp">Login</a></li>
				<li><a href="Product.jsp">Products</a></li>
				<li><a href="Cart.jsp">Cart</a></li>
				<li><a href="index.jsp">LogOut</a></li>
			</ul>
		</nav>
	</header>

	<div class="hero-section">
		<div class="hero-msg">
			<p>Millions of products. Trusted by thousands. Start shopping
				now! Shop smarter. Shop faster. Shop everything in one place.</p>
		</div>
	</div>

	<%
	List<Product> plist = ProductDao.getAllProducts(); 
	User user=(User) session.getAttribute("user");
	session.setAttribute("user",user);
	
	System.out.println("index.jsp"+user);
	%>

	<div class="shop-section">
		<%
		for (Product p : plist) {
		%>
		<div class="box1 box">
			<div class="box-content">
				<h2><%=p.getCategary_name()%></h2>
				<div class="box-img">
					<img src="<%=p.getImage_url()%>" alt="Product Image"
						style="width: 100%; height: 100%; object-fit: cover;" />
				
				<p><%=p.getName()%></p>
				<p><%=p.getPrice()%></p>
				<a href="productDetails.jsp?pid=<%=p.getId() %>">
				<button class="add-to-cart">View Details</button></a>
				<p>See more</p>
				</div>
			</div>
		</div>
		<%
		}
		%>
	</div>

</body>
</html>




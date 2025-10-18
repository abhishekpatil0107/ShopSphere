<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Landing Page</title>
    <link rel="stylesheet" href="styles.css">
    <style>

        .box {
            width: 200px;
            height: 60px;
            display: flex;
            align-items: center;
            justify-content: center;
            border: 2px solid #6598f7;
            border-radius: 30px;
            font-size: 20px;
            font-weight: bold;
            color: white;
            background-color: #6598f7;
            text-decoration: none;
            transition: all 0.3s ease;
            cursor: pointer;
            margin: 10px;
        }

        .buttons-container {
            display: flex;
            flex-direction: column;
            align-items: center;
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
            </ul>
        </nav>
    </header>
    
    <section class="hero">
        <h1>WelCome to Our E-Commerce Portal</h1>
        <div class="buttons-container">
        <a href="Register.jsp" class="box">Register</a>
        <a href="Login.jsp" class="box">Login</a>
    </div>	
    </section>
    
</body>
</html>
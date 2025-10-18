<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reset Password - E-Commerce</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="reset-password-container">
        <form class="reset-password-form" action="checkUser.jsp" method="post">
            <h2>Reset Your Password</h2>
            <p>Please enter your new password</p>
            <input type="email" name="email" id="newemail" placeholder="Enter Your Email" required>
            <button type="submit" class="reset-btn">Reset Password</button>
            <a href="index.jsp" class="back-to-login">Back to Login</a>
        </form>
    </div>
    <script src="forgot-password.js"></script>
</body>
</html>
<%-- 
    Document   : login
    Created on : Jan 9, 2025, 8:05:11 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" >
        <title>JSP Page</title>
    </head>
    <body>
         <%@include  file="common/menu.jspf"%>
        <div class="login-wrapper"> 
            <form action="login" method="POST">
                <h2>Login</h2>
                <div class="input-field">
                    <input type="text" name="username" required>
                    <label>Enter your username</label>
                </div>
                <div class="input-field">
                    <input type="password" name="password" required>
                    <label>Enter your password</label>
                </div>
                <div class="forget">
                    <label for="remember">
                        <input type="checkbox" id="remember">
                        <p>Remember me</p>
                    </label>
                    <a href="#">Forgot password?</a>
                </div>
                <button type="submit" name="action" value="login">Log In</button>
                <div class="register">
                    <p>Don't have an account? <a href="register">Register</a></p>
                </div>
            </form>
        </div>

        <%@include  file="common/footer.jspf"%>
    </body>
</html>

<%-- 
    Document   : register
    Created on : Jan 9, 2025, 9:29:22 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" >
        <script type="text/javascript" src="${pageContext.request.contextPath}/javascript/newjavascript.js"></script>
        <title>Register</title>
    </head>
    <body>
        <%@include  file="common/menu.jspf"%>
        <div class="login-wrapper">
            <form action="register" id="registerForm" method="POST">
                <h2>Register</h2>

                <!-- First Name -->
                <div class="input-field">
                    <input type="text" name="firstname" id="firstname" maxlength="10" required>
                    <label>First Name</label>
                </div>

                <!-- Last Name -->
                <div class="input-field">
                    <input type="text" name="lastname" id="lastname" maxlength="10" required>
                    <label>Last Name</label>
                </div>

                <!--Birth Date--> 
                <div class="input-field">
                    <input type="date" name="birthdate" placeholder="Birth Date" id="birthdate" maxlength="8" required>
                    <!--<label>Birth Date</label>-->
                </div>

                <!-- Phone Number -->
                <div class="input-field">
                    <input type="tel"  name="phonenumber" id="phonenumber" maxlength="9" required>
                    <label>Phone Number</label>
                </div>

                <!-- Email -->
                <div class="input-field">
                    <input type="email" name="email" id="email" maxlength="25" required>
                    <label>Email</label>
                </div>

                <!-- Username (Auto filled) -->
                <div class="input-field">
                    <input type="text" id="username" name="username" readonly>
                    <!--<label>Username</label>-->
                </div>

                <!--Password-->
                <div class="input-field">
                    <input type="password" name="password" id="password" maxlength="15" required>
                    <label>Password</label>
                </div>

                <!--Confirm Password-->
                <div class="input-field">
                    <input type="password" name="confirmPassword" id="confirmPassword" maxlength="15" required>
                    <label>Confirm Password</label>
                </div>

                <!-- Submit Button -->
                <button type="submit" name="action" value="save">Register</button>

                <div class="register">
                    <p>Already have an account? <a href="login">Login</a></p>
                </div>
            </form>
        </div>
        <%@include  file="common/footer.jspf"%>
    </body>
</html>

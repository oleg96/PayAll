<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>PayAll - Registration</title>
        <link href="css/base.css" rel="stylesheet">
        <link href="css/menu.css" rel="stylesheet">
    </head>
    <body>
        <nav>
            <ul>
                <li><a href="index.jsp"><span>Main</span></a></li>
                <li><a href="registration.jsp"><span>Register</span></a></li>
                <li><a href="#"><span>Log In</span></a></li>
            </ul>
        </nav>
        <form class="register" action="register.jsp">
            <p>E-mail:</p>
            <input class="auth" type="email" name="login" required>
            <p>Password:</p>
            <input class="auth" type="password" name="pass" required>
            <p>Confirm password:</p>
            <input class="auth" type="password" name="pass" required>
            <p align="center"><input class="buttons" type="submit" value="Register"></p>
        </form>
    </body>
</html>

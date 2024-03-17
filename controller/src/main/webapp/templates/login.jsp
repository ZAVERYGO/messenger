<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17.03.2024
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="../templates/style.css">
</head>
<body>

<form class="form" action="../api/login" method="POST">

    <div class="div"> ${message} </div>

    <input class="input" type="text" placeholder="Логин" name="login">

    <input class="input" type="password" placeholder="Пароль" name="password">

    <button class="btn" type="submit">Вход</button>

    <a href="../ui/signUp">Sign Up</a>
</form>
</body>
</html>

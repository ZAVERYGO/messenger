<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17.03.2024
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link rel="stylesheet" href="../templates/style.css">
</head>
<body>
<form class="form" action="../api/user" method="post">
    <input class="input" type="text" placeholder="Ваше имя" name="firstName">

    <input class="input" type="text" placeholder="Ваша фамилия" name="lastName">

    <input class="input" type="text" placeholder="Ваше отчество" name="patronymic">

    <input class="input" type="date" placeholder="Дата рождения" name="dayOfBirth">

    <input class="input" type="text" placeholder="Логин" name="login">

    <input class="input" type="password" placeholder="Пароль" name="password">

    <button class="btn" type="submit">Регистрация</button>
</form>
</body>
</html>

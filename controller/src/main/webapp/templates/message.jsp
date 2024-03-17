<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 18.03.2024
  Time: 00:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Message</title>
    <link rel="stylesheet" href="/messenger-1.0-SNAPSHOT/templates/style.css">
</head>
<body>
<form class="form" action="/messenger-1.0-SNAPSHOT/api/message" method="POST">

    <input class="input" type="text" placeholder="Кому" name="recipient">

    <input class="input" type="text" placeholder="текст" name="text">

    <button class="btn" type="submit">Отправить</button>
</form>
</body>
</html>

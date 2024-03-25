<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Statistics</title>
</head>
<body>
<table border="1">
    <caption>Статистика</caption>
    <tr>
        <th>Количество активных пользователей</th>
        <th>Количество зарегистрированных пользователей</th>
        <th>Общее количесто сообщений</th>
    </tr>
    <tr>
        <td>${allStat.activeUser.quantity}</td>
        <td>${allStat.allUser}</td>
        <td>${allStat.allMessage}</td>
    </tr>
</table>
</body>
</html>
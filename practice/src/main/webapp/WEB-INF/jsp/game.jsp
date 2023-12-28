<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Hands" %>
<%
Hands hands = (Hands) application.getAttribute("hands");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Game</title>
</head>
<body>
  <h2>じゃんけん</h2><br>
  <form action="Game" method="post">
    <input type="radio" name="user" value="0">グー
    <input type="radio" name="user" value="1">チョキ
    <input type="radio" name="user" value="2">パー<br>
    <input type="submit" value="送信">
  </form>
  <% if (hands != null) { %>
    <p>結果:<%= hands.getResult() %></p>
  <% } %>
</body>
</html>
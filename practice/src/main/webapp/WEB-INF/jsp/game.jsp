<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Hands" %>
<%
Hands hands = (Hands) request.getAttribute("hands");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Game</title>
</head>
<body>
  <h2>じゃんけん</h2>
  <form action="Game" method="post">
    <input type="radio" name="user" value="0" checked>グー
    <input type="radio" name="user" value="1">チョキ
    <input type="radio" name="user" value="2">パー<br>
    <input type="submit" value="送信">
  </form>
  <% if (hands != null) { %>
    <p>user:<%= hands.getUserHand() %></p>
    <p>com:<%= hands.getComHand() %></p>
    <p>result:<%= hands.getResult() %></p>
  <% } %>
</body>
</html>
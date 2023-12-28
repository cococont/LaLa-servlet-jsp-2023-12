<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Player" %>
<%
Player p = (Player) request.getAttribute("player");
String msg = null;
if (p != null) {
  msg = p.getMsg();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Game</title>
<link rel="stylesheet" href=<%= request.getContextPath() + "/css/style.css" %>>
</head>
<body>
  <form action="" method="post">
    1～99の数字を入力:<br>
    <input type="number" min="1" max="99" name="user">
    <input type="submit">
  </form>
<% if (msg != null) { %>
  <p>
    Result:<%= msg %>
  </p>
<% } %>
<% if (msg == "正解") { 
  String src = request.getContextPath() + "/img/atari.png"; %>
  <img alt="" src=<%= src %>>
<% } %>
</body>
</html>
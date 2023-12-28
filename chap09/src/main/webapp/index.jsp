<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Human" %>
<%
Human human = (Human) application.getAttribute("human");
application.removeAttribute("human");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index.jsp</title>
</head>
<body>
  <h2>Index.jsp</h2>
  <p><%= human.getName() %>は<%= human.getAge() %>歳です</p>
</body>
</html>
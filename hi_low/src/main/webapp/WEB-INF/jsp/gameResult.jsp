<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Object msg = request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Game Result</title>
</head>
<body>
  <p>
    Result:<%= msg %>
  </p>
  <a href="game">もう一回</a>
</body>
</html>
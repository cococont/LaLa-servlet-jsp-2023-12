<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Human" %>
<%
// Object obj =request.getAttribute("human");
// Human h = null;
// if (obj instanceof Human) {
// 	h = (Human) request.getAttribute("human");
// }
Human h = (Human) request.getAttribute("human");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <p>
    <%= h.getName() %>さんは<%= h.getAge() %>才です
  <p>
</body>
</html>
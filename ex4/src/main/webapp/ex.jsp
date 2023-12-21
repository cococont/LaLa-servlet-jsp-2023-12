<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ex.Employee" %>
<%
Employee emp = new Employee("0001", "湊 雄輔");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% for (int i = 0; i < 10; i++) { 
		String style = ""; %>
	<% if (i % 3 == 0) {
		style = "style=color:red"; %>
	<% } %>
	<p <%= style %>>IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です</p>
	<% } %>
</body>
</html>
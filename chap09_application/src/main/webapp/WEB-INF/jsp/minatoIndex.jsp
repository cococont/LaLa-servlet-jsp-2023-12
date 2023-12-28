<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.SiteEV" %>
<%
SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>minatoIndex</title>
</head>
<body>
  <h2>湊くんのページ</h2>
  <p>
    <a href="MinatoIndex?action=like">いいね</a>
    <%= siteEV.getLike() %>人
    <a href="MinatoIndex?action=dislike">よくないね</a>
    <%= siteEV.getDislike() %>人
  </p>
  <h3>湊くんとは！？</h3>
  <hr>
</body>
</html>
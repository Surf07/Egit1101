<%@ page import="java.util.Date, java.text.DateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
  //メソッドの宣言
  private String GetDate() {
    DateFormat df = DateFormat.getTimeInstance(DateFormat.LONG);
    Date date = new Date();
    return df.format(date);
  }
%>
<h1>Display Date </h1>
    <p>This page was loaded on <%= new java.util.Date()%></p>
    <p>This page was loaded on <%= GetDate()%></p>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8"
	import="java.time.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello JSP!</title>
</head>
<body>
ようこそ！JSP＆サーブレットの世界へ！
<%
	LocalDateTime local = LocalDateTime.now();
	out.println(local.getHour());
	out.println(":");
	out.println(local.getMinute());
%>

<!-- 午前と午後の判定結果 -->
現在は
<%
	// Calendarの日時が午前であるか午後であるかを判定する;
	String value = "";
	if ( local.getHour() < 12 ) {
		value = "午前中";
	} else  {
		value = "午後";
	}
	out.println(value);
%>
ですね。
</body>
</html>
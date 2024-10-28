<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>구구단</title>
</head>
<body>
	<% int dan = Integer.parseInt(request.getParameter("dan")); %>
	<h1> 구구단 <% out.println(dan); %>단 </h1>
	<%
		for (int i = 1; i <= 9; i++) {
			out.println(dan + " x " + i + " = " + (dan * i));
	%>
	<br>
	<%
		}
	%>
	<form action="ex14.jsp">
		<input type="submit" value="돌아가기">
	</form>
</body>
</html>
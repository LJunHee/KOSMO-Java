<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>구구단 출력</h1>
	<form action="ex12_2.jsp">
		<select name="gugu">
			<%
				for (int i = 2; i < 10; i++) {
			%>
			<option value=<%out.print(i);%>><%out.print(i);%>단</option>
			<%
				}
			%>
			<input type = "submit" value = "출력">
		</select>
	</form>
</body>
</html>
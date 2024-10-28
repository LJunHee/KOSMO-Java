<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단</h1>
	<table width="100%">
		<tr>
			<%
				for (int i = 2; i <= 9; i++) {
			%>
			<td>
				<%
					for (int j = 1; j <= 9; j++) {
							out.println(i + " x " + j + " = " + (i * j));
				%> <br> <%
 	}
 	}
 %>
			</td>
		</tr>
	</table>
	<form action="ex14.jsp">
		<input type="submit" value="돌아가기">
	</form>

</body>
</html>
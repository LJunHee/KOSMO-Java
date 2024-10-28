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
	<%
		int su = Integer.parseInt(request.getParameter("gugu"));
	%>
	<ul>
		<%
			for (int i = 1; i < 10; i++) {
		%>
		<li>
			<%
				out.print(su + "x" + i + "=" + su * i);
			%>
		</li>
		<%
			}
		%>
	</ul>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%!
String func(int j,int i){
	return "<td>"+j+"x"+i+"="+(j*i)+"</td>";
}
%>
<body>
	<h1>±¸±¸´Ü</h1>
	<table width="100%">
		<tr>
		<%for(int i=2; i<10; i++){ %>
			<td><%out.print(i); %>´Ü</td>
		<%} %>
		</tr>
		<%
		for(int i=1; i<10; i++){
			out.println("<tr>");
				for(int j=2; j<10; j++){
					out.print(func(j, i));
				}
			out.println("</tr>");
		}
		%>
	</table>
</body>
</html>
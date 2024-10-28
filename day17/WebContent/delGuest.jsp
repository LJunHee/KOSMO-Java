<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta http-equiv="refresh" content="0; url=guest.jsp">
<title>Insert title here</title>
</head>
<body>
<%
	int idx=Integer.parseInt(request.getParameter("idx"));
	java.util.List list=(java.util.List)application.getAttribute("guest");
	list.remove(idx);
%>
</body>
</html>
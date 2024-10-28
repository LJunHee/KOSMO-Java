<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>request 내장객체</h1>
<%
	//client info
	String msg1 = request.getRemoteAddr();
	String msg2 = request.getRemoteHost();
	int port = request.getRemotePort();
	System.out.println(msg1);
	System.out.println(msg2);
	System.out.println(port);
	System.out.println("--------------------------");
	
	//server info
	String msg4 = request.getLocalAddr();
	String msg5 = request.getLocalName();
	int port2 = request.getLocalPort();
	System.out.println(msg4);
	System.out.println(msg5);
	System.out.println(port2);
	

%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"
	import= "java.util.Date"
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%!
	//@�� ��Ƽ�� - Ŭ���� ��
	//!�� ����� - Ŭ���� �� �޼��� �� (����, �޼���)
	static int su = 1111;
	int su2 = 2222;
	static void func01(){}
	void func02(){}
	class Inner{}
%>
<body>
	<h1>jsp �׽�Ʈ ������</h1>
	<%
		//��ũ��Ʈ �� - �޼���� (main)
		
		// ���� ��ü
		for (int i = 0; i < 3; i++) {
			out.println("ȭ�鿡 ���<br>");
			System.out.println(new Date());
		}
	
		for (int i = 0; i < 3; i++) {
	%>
	<% out.println("�и�"); %>
	<br>
	<%}%>
	
</body>
</html>
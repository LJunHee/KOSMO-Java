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
	//@는 디렉티브 - 클래스 밖
	//!는 선언부 - 클래스 안 메서드 밖 (변수, 메서드)
	static int su = 1111;
	int su2 = 2222;
	static void func01(){}
	void func02(){}
	class Inner{}
%>
<body>
	<h1>jsp 테스트 페이지</h1>
	<%
		//스크립트 릿 - 메서드안 (main)
		
		// 내장 객체
		for (int i = 0; i < 3; i++) {
			out.println("화면에 출력<br>");
			System.out.println(new Date());
		}
	
		for (int i = 0; i < 3; i++) {
	%>
	<% out.println("분리"); %>
	<br>
	<%}%>
	
</body>
</html>
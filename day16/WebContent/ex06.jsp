<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>request parameter(매개변수)</h1>
<%
java.util.Map<String,String[]> map = request.getParameterMap();
java.util.Set<String> keys = map.keySet();
Iterator<String> ite = keys.iterator();

while(ite.hasNext()) {
	String key = ite.next();
	String[] vals = map.get(key);
	System.out.println(java.util.Arrays.toString(vals));
}

/*
java.util.Enumeration<String> names;
names = request.getParameterNames();
while(names.hasMoreElements()){
	String name = names.nextElement();
	String[] vals = request.getParameterValues(name);
	for(int i =0; i<vals.length; i++){
		System.out.println(vals[i]);
	}
}
/*
	String id = request.getParameter("id");
	out.println(id);
	out.println("<br>");
	
	String pw = request.getParameter("pw");
	out.println("<br>");
	out.println(pw);
	
	String ra1 = request.getParameter("ra1");
	out.println(ra1);
	out.println("<br>");
	String ra2 = request.getParameter("ra1");
	out.println(ra2);
	out.println("<br>");
	String ra3 = request.getParameter("ra1");
	out.println(ra3);
	out.println("<br>");

	String[] ck1 = request.getParameterValues("ch1");
	out.println(java.util.Arrays.toString(ck1));
	out.println("<br>");
*/
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta http-equiv="refresh" content="0; url=index.jsp">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.*" %>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String pw=request.getParameter("pw");
String re=request.getParameter("re");

Map<String,String> map=new HashMap<>();
map.put("id", id);
map.put("pw",pw);
map.put("name", name);

List<Map<String,String>> users;
Object obj=application.getAttribute("join");
if(obj==null){
	users=new ArrayList<>();
	application.setAttribute("join", users);
}else users=(List)obj;

users.add(map);
%>


</body>
</html>
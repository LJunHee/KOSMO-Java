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
String pw=request.getParameter("pw");

Object obj= application.getAttribute("join");
if(obj!=null){
	List<Map<String,String>> list=(List)obj;
	for(int i=0; i<list.size(); i++){
		Map<String,String> map=list.get(i);
		if(id.equals(map.get("id"))&&pw.equals(map.get("pw"))){
			// 로그인 가능
			// 서버 접속마다 서로 다른 정보 저장공간(메모리)
			session.setAttribute("result", map.get("name"));
		}
	}
}
%>
</body>
</html>
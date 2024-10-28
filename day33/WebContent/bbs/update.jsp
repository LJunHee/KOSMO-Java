<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import = "com.bbs.model.*" %>
<%
if(request.getMethod().equals("POST")){
	request.setCharacterEncoding("utf-8");
	int num = Integer.parseInt(request.getParameter("num"));
	String sub = request.getParameter("sub").trim();
	String id = request.getParameter("id").trim();
	String content = request.getParameter("content");
	
	if(sub.isEmpty()||id.isEmpty()){
		response.sendRedirect("edit.jsp?num="+num);
		return;
	}
	
	BbsDao dao = new BbsDao();
	dao.updateOne(num, sub, id, content);
}
response.sendRedirect("./");
%>
</body>
</html>
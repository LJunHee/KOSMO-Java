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
	
	String sub = request.getParameter("sub").trim();
	String id = request.getParameter("id").trim();
	String content = request.getParameter("content");
	
	if(sub.isEmpty()||id.isEmpty()) {
		response.sendRedirect("add.jsp");
		return;
	}
	
	BbsDao dao = new BbsDao();
	dao.add(sub,id,content);
}

response.sendRedirect("./");
%>
</body>
</html>
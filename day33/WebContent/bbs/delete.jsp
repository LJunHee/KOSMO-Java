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
if("POST".equals(request.getMethod())){
	int num = Integer.parseInt(request.getParameter("num"));
	BbsDao dao = new BbsDao();
	dao.deleteOne(num);
}
%>
</body>
</html>
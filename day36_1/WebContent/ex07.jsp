<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=pageContext.getRequest().getServletContext().getInitParameter("public01") %><br>
	<%=pageContext.getSession().getServletContext().getInitParameter("public01") %><br>
	<%=pageContext.getServletContext().getInitParameter("public01") %>
	<%=request.getServletContext().getInitParameter("public01") %><br>
	<%=session.getServletContext().getInitParameter("public01") %><br>
	<%=application.getInitParameter("public01") %><br>
	<hr>
	<%=request.getContextPath() %><br>
	<%=pageContext.getRequest().getServletContext().getContextPath() %><br>
	<%=pageContext.getServletContext().getContextPath() %><br>
	<%=pageContext.getServletConfig().getServletContext().getContextPath() %><br>
	<%=session.getServletContext().getContextPath() %><br>
	<%=application.getContextPath() %><br>
	
	
</body>
</html>
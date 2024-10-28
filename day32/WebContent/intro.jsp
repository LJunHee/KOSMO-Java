<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="template/head.jsp">
	<jsp:param value="." name="path"/>
</jsp:include>
</head>
<body>
<jsp:include page="template/header.jsp"></jsp:include>
<jsp:include page="template/menu.jsp">
	<jsp:param value="." name="path"/>
</jsp:include>
<img alt="" src="https://www.inje.ac.kr/kor/assets/images/sub/gimhae-campus-1.jpg">
<jsp:include page="template/footer.jsp"></jsp:include>
</body>
</html>
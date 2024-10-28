<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/jquery.bxslider.min.css">
<jsp:include page="template/head.jsp">
	<jsp:param value="." name="path"/>
</jsp:include>
<script type="text/javascript" src="js/jquery.bxslider.js"></script>
<script type="text/javascript">
$(function(){
	$('.carousel').bxSlider({auto:true});
});
</script>
</head>
<body>
<jsp:include page="template/header.jsp"></jsp:include>
<jsp:include page="template/menu.jsp">
	<jsp:param value="." name="path"/>
</jsp:include>

<div class="carousel">
	<div><img src="imgs/main1.jpg"/></div>
	<div><img src="imgs/main2.jpg"/></div>
	<div><img src="imgs/main3.jpg"/></div>
	<div><img src="imgs/main4.jpg"/></div>
	<div><img src="imgs/main5.jpg"/></div>
	<div><img src="imgs/main6.jpg"/></div>
</div>

<jsp:include page="template/footer.jsp"></jsp:include>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="<%=request.getParameter("path")%>/css/bootstrap.min.css">
<style type="text/css">
.header>h1{
	background-image: url("<%=request.getParameter("path")%>/imgs/logo.png");
	background-repeat: no-repeat;
	text-indent: -999px;
}
.carousel img{
	width: 100%;
}
.header>p{
	float:right;
}
</style>
<script type="text/javascript" src="<%=request.getParameter("path")%>/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="<%=request.getParameter("path")%>/js/bootstrap.min.js"></script>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="login" class="com.user.model.UserBean" scope="session"></jsp:useBean>
<div class="container">
	<div class="row">
		<div class="header col-md-12">
			<h1>인제대학교</h1>
		<p>
			<%
			if(login!=null){
				if(login.isResult()){
					out.println(login.getName()+"님 로그인 중...<a href =\"/day32/login/logout.jsp\">Logout</a>");
				}
			}
			%>
		</p>
		</div>
	</div>
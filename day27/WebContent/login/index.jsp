<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href ="../css/frame.css">
<style type="text/css">
#content {}

#content>h1{
	margin-top : 50px;
	text-align : center;
}


</style>
<script type="text/javascript"></script>
</head>
<body>
	<div>
		<div class="header">
			<h1>인제대학교</h1>

			<div>
				<form action="login/">
					<input type="text" id="" name = "id" />
					<input type="text" pw="" name = "pw" />
					<button type="submit">login</button>
					<button type="button">join</button>
				</form>
			</div>
		</div>
		<div id="menu">
			<ul>
				<li><a href="../">home</a></li>
				<li><a href="../intro.jsp">intro</a></li>
				<li><a href="../bbs/">bbs</a></li>
				<li><a href="../login/">login</a></li>
			</ul>
		</div>
		<div id="content">
		<!-- content begin -->
			<h1>게시판</h1>
			
			<p><a href="add.jsp">입력</a></p>
		<!-- content end -->
		</div>
		<div id="footer">
			<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
			<p>Copyright&copy; 1996-2022 INJE University. All rights
				reserved.</p>
		</div>
	</div>
</body>
</html>
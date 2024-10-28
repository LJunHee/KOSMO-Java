<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
<script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
        <img alt="Brand" src="../imgs/logo.png">
      </a>
    </div>
    <ul class="nav navbar-nav">
    	<li><a href="../index.do">HOME</a></li>
    	<li><a href="../intro.do">INTRO</a></li>
    	<li class="active"><a href="./list.do">EMP</a></li>
    	<li><a href="../login/login.do">LOGIN</a></li>
    </ul>
  </div>
</nav>
<%@ page import = "java.util.*,com.emp.model.*" %>
<%
EmpDto bean = (EmpDto)request.getAttribute("bean");
%>
	<div class="container">
		<div id="content" class="row">
			<div class="col-md-12">
			<!-- content begin-->
			<h2 class = "page-header">edit list</h2>
			<form action ="edit.do" method = "post">
				<div class = "form-group">
					<label>empno</label><input readonly name = "empno" class="form-control" value = "<%=bean.getEmpno()%>"/>
				</div>
				<div class = "form-group">
					<label>ename</label><input name = "ename" class="form-control" value = "<%=bean.getEname()%>"/>
				</div>
				<div class = "form-group">
					<label>pay</label><input name = "pay" class="form-control" value = "<%=bean.getPay()%>"/>
				</div>
				<div class = "form-group">
					<button class = "btn btn-primary btn-block">수정</button>
					<button type = "reset" class = "btn btn-default btn-block">취소</button>
					<button type = "button" class = "btn btn-default btn-block" onclick = "history.back();">뒤로</button>
				</div>
			</form>
			<!-- content end-->
			</div>
		</div>
		<div id="footer" class="row">
			<div class="col-md-12">
				<address>
					<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
					<p>Copyright &copy; INJE University. All rights reserved.</p>
				</address>
			</div>
		</div>
	</div>
</body>
</html>
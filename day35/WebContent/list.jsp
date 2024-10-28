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
	<div class="container">
		<div id="content" class="row">
			<div class="col-md-12">
			<!-- content begin-->
			<h2>emp list</h2>
			<table class="table">
				<thead>
					<tr>
						<th>사번</th>
						<th>이름</th>
						<th>금액</th>
						<th>날짜</th>
					</tr>
				</thead>
				<tbody>
					<%@ page import = "java.util.*,com.emp.model.*" %>
					<%
					for(EmpDto bean: (List<EmpDto>)request.getAttribute("alist")){
					%>
					<tr>
						<td><a href="detail.do?empno=<%=bean.getEmpno()%>"><%=bean.getEmpno() %></a></td>
						<td><a href="detail.do?empno=<%=bean.getEmpno()%>"><%=bean.getEname() %></a></td>
						<td><a href="detail.do?empno=<%=bean.getEmpno()%>"><%=bean.getPay() %></a></td>
						<td><a href="detail.do?empno=<%=bean.getEmpno()%>"><%=bean.getHiredate() %></a></td>
					</tr>
					<%} %>
				</tbody>
			</table>
			<nav aria-label="Page navigation" class = "text-center">
			  <ul class="pagination">
			    <li>
			      <a href="#" aria-label="Previous">
			        <span aria-hidden="true">&laquo;</span>
			      </a>
			    </li>
			    <%
			    for(int i=(int)request.getAttribute("begin"); i<=(int)request.getAttribute("limit"); i++){
			    %>
			    <li><a href="?p=<%=i %>"><%=i %></a></li>
			    <%} %>
			    <li>
			      <a href="#" aria-label="Next">
			        <span aria-hidden="true">&raquo;</span>
			      </a>
			    </li>
			  </ul>
			</nav>
			<p><a href="add.do" class="btn btn-primary btn-block" role="button">입력</a></p>
			<style>
				table tr>td:first-child,table tr>td:last-child{
					width:100px;
				}
			</style>
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
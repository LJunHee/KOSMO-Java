<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- bootstrap theme css -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>

<!-- bootstrap JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/day34/index.do">
        인제대학교
      </a>
    </div>
	  <div class="navbar-nav">
	  	<a class="navbar-text" href="/day34/intro.do">intro</a>
	  	<a class="navbar-text" href="/day34/dept/list.do">dept</a>
	  	<a class="navbar-text" href="/day34/emp/list.do">emp</a>
	  	<a class="navbar-text" href="/day34/login/form.do">login</a>
	  </div>
  </div>
  <%@ page import = "com.home.model.*" %>
  <%
  EmpDto bean = null;
  bean = (EmpDto)request.getAttribute("bean");
  %>
</nav>
	<div class="container">
		<div class="row">
			<div id="content" class="col-md-12">
				<!-- content begin -->
				<h2 class="page-header">상세페이지</h2>
				<form method="post">
				  <div class="form-group">
				    <label for="sabun">사번</label>
				    <input name="sabun" class="form-control" id="sabun" value="<%=bean.getEmpno()%>">
				  </div>
				  <div class="form-group">
				    <label for="ename">이름</label>
				    <input name="ename" class="form-control" id="ename" value="<%=bean.getEname()%>">
				  </div>
				  <div class="form-group">
				    <label for="mgr">사수</label>
				    <input name="mgr" class="form-control" id="mgr" value="<%=bean.getMgr()==0?"미정":bean.getMgr()%>">
				  </div>
				  <div class="form-group">
				    <label for="pay">연봉</label>
				    <input name="pay" class="form-control" id="pay" value="<%=bean.getPay()%>">
				  </div>
				  <div class="form-group">
				    <label for="dname">부서명</label>
				    <input name="dname" class="form-control" id="dname" value="<%=bean.getDname()==null?"미배정":bean.getDname()%>">
				  </div>
				  <div class="form-group">
					<a href ="editDept.do?sabun=<%=bean.getEmpno()%>" class="btn btn-primary" role="button">부서배정</a>				  
					<a href ="editMgr.do?sabun=<%=bean.getEmpno()%>" class="btn btn-primary" role="button">사수배정</a>	  
					<a href ="delete.do?sabun=<%=bean.getEmpno()%>" class="btn btn-danger" role="button">삭제</a>	  
				    <button type="button" class="btn btn-default" onclick="history.back();">뒤로</button>
				  </div>
				</form>
				<!-- content end -->
			</div>
		</div>
		<div class="row">
			<div id="footer" class="col-md-12">
				<address>
					<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
					<p>Copyright &copy; INJE University. All rights reserved.</p>
				</address>
			</div>
		</div>
	</div>
</body>
</html>
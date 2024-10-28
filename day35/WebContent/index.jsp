<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
        <img alt="Brand" src="imgs/logo.png">
      </a>
    </div>
    <ul class="nav navbar-nav">
    	<li class="active"><a href="./index.do">HOME</a></li>
    	<li><a href="./intro.do">INTRO</a></li>
    	<li><a href="./emp/list.do">EMP</a></li>
    	<li><a href="./login/login.do">LOGIN</a></li>
    </ul>
  </div>
</nav>
	<div class="container">
		<div id="content" class="row">
			<div class="col-md-12">
			<!-- content begin-->
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
    <li data-target="#carousel-example-generic" data-slide-to="4"></li>
    <li data-target="#carousel-example-generic" data-slide-to="5"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="imgs/main1.jpg" alt="...">
    </div>
    <div class="item">
      <img src="imgs/main2.jpg" alt="...">
    </div>
    <div class="item">
      <img src="imgs/main3.jpg" alt="...">
    </div>
    <div class="item">
      <img src="imgs/main4.jpg" alt="...">
    </div>
    <div class="item">
      <img src="imgs/main5.jpg" alt="...">
    </div>
    <div class="item">
      <img src="imgs/main6.jpg" alt="...">
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>			
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
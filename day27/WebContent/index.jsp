<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/frame.css">
<style type="text/css">
#loop {
	position: relative;
	overflow: hidden;
}

#loop>ul {
	list-style: none;
	width: 4800px;
}

#loop>ul>li {
	float: left;
}

#loop>ul>li>img {
	width: 800px;
	height: 240px;
}

#loop a {
	display: block;
	width: 50px;
	height: 240px;
	background-color: black;
	position: absolute;
	text-align: center;
	line-height: 240px;
	text-decoration: none;
	color: white;
	font-size: 72px;
	font-weight: bold;
	opacity: 0.3;
}

#loop a:last-child {
	left: 750px;
}
</style>
<script type="text/javascript">
	var loopImg, interval;
	var cnt = 0;
	var prv, nxt;
	var loopNext = function() {
		cnt++;
		if (cnt == 6)
			cnt = 0;
		loopImg.style.marginLeft = '-' + (8 * cnt) + '00px';
	};
	var loopPrev = function() {
		cnt--;
		if (cnt < 0)
			cnt = 5;
		loopImg.style.marginLeft = '-' + (8 * cnt) + '00px';
	};
	window.onload = function() {
		loopImg = document.querySelector('#content>#loop>ul');
		loopImg.outerHTML = loopImg.outerHTML + '<a href="#">&lt;</a>'
				+ '<a href="#">&gt;</a>';
		loopImg = document.querySelector('#content>#loop>ul');
		var alink = document.querySelectorAll('#content>#loop>ul~a');
		prv = alink[0];
		nxt = alink[1];
		prv.onclick = function(e) {
			e.preventDefault();
			loopPrev();
			clearInterval(interval);
			interval = setTimeout(function() {
				nxt.click();
			}, 3000);
		}
		nxt.onclick = function(e) {
			e.preventDefault();
			loopNext();
			clearInterval(interval);
			interval = setTimeout(function() {
				nxt.click();
			}, 3000);
		};
		interval = setTimeout(function() {
			nxt.click();
		}, 3000);
	};
</script>
</head>
<body>
	<div>
		<div class="header">
			<h1>인제대학교</h1>
			<div>
				<form action="./login/">
					<input type="text" name="id" /> <input type="password" name="pw" />
					<button type="submit">login</button>
					<button type="button">join</button>
				</form>
			</div>
		</div>
		<div id="menu">
			<ul>
				<li><a href="./">home</a></li>
				<li><a href="./intro.jsp">intro</a></li>
				<li><a href="./bbs/">bbs</a></li>
				<li><a href="./login/">login</a></li>
			</ul>
		</div>
		<div id="content">
			<!-- content begin -->
			<div id="loop">
				<ul>
					<li><img alt="" src="imgs/main1.jpg"></li>
					<li><img alt="" src="imgs/main2.jpg"></li>
					<li><img alt="" src="imgs/main3.jpg"></li>
					<li><img alt="" src="imgs/main4.jpg"></li>
					<li><img alt="" src="imgs/main5.jpg"></li>
					<li><img alt="" src="imgs/main6.jpg"></li>
				</ul>
			</div>
			<!-- content end -->
		</div>
		<div id="footer">
			<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
			<p>Copyright &copy; 2024 INJE University. All rights reserved.</p>
		</div>
	</div>
</body>
</html>
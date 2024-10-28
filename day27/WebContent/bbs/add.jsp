<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href ="../css/frame.css">
<style type="text/css">
#content{}
#content>h1{
	margin-top:50px;
	text-align: center;
}
#content>form{
	width: 80%;
	margin: 10px auto;
}
#content>form>div{
	padding-top: 30px;
}
#content>form>div>label{
	display:inline-block;
	width: 100px;
}
#content>form>div>input{
	width: 80%;
	height: 35px;
	border: 0px solid gray;
	border-bottom: 2px solid gray;
	
}
#content>form>div>textarea{
	width: 100%;
	height: 200px;
	margin: 0px auto;
}
#content>form>div>button{
	display: block;
	background-color: #2E8B57;
	color:white;
	width: 100%;
	height: 50px;
	text-align: center;
	line-height: 50px;
	margin: 10px auto;
	border-radius: 10px;
	text-decoration: none;
}
#content form span {
	display : block;
	color : red;
	font-style : italic;
	text-align : right;
}
</style>

<script type="text/javascript">
var form, input1,input2,err,div1,div2;
var add = function() {
	if(div1.querySelector('span')) {
	div1.removeChild(err);
	}
	if(div2.querySelector('span')) {
	div2.removeChild(err);
	}
	err = document.createElement('span');
	if(input1.value == '') {
		err.appendChild(document.createTextNode('* 제목은 필수입력'));
		div1.prepend(err);
		return false;
	}
	if(input2.value == ''){
		err.appendChild(document.createTextNode('* 글쓴이는 필수입력'));
		div2.prepend(err);
		return false;		
	}
};

window.onload = function() {
	form = document.querySelector('#content form');
	input1 = form.querySelectorAll('input')[0];
	input2 = form.querySelectorAll('input')[1];
	div1 = form.querySelectorAll('div')[0];
	div2 = form.querySelectorAll('div')[1];
	form.onsubmit = add;	
	input1.onfocus = function(e) {
		this.value='';
	}
	input1.onblur = function(e) {
		if(this.value=='') {
			this.value='제목없음';
		}
	}
};
</script>
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
			<h1>입력페이지</h1>
			<form action="insert.jsp">
				<div>
					<label for="sub">제목</label>
					<input name="sub" id="sub" value="제목없음"/>
				</div>
				<div>
					<label for="id">글쓴이</label>
					<input name="id" id="id"/>
				</div>
				<div>
					<textarea name="content"></textarea>
				</div>	
				<div>
					<button type="submit">입력</button>
					<button type="reset">취소</button>
					<button type="button" onclick = "history.back();">뒤로</button>				
				</div>
			</form>
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
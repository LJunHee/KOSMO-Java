<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/frame.css">
<style type="text/css">
#content {
	
}

#content>h1 {
	margin-top: 50px;
	text-align: center;
}

#content>form {
	width: 80%;
	margin: 10px auto;
}

#content>form>div {
	padding-top: 30px;
}

#content>form>div>label {
	display: inline-block;
	width: 100px;
}

#content>form>div>input {
	width: 80%;
	height: 35px;
	border: 0px solid gray;
	border-bottom: 2px solid gray;
}

#content>form>div>textarea {
	width: 100%;
	height: 200px;
	margin: 0px auto;
}

#content>form>div>button {
	display: block;
	background-color: green;
	color: white;
	width: 100%;
	height: 50px;
	text-align: center;
	line-height: 50px;
	margin: 10px auto;
	border-radius: 10px;
	text-decoration: none;
}

#content>form>div>button:nth-child(2) {
	background-color: red;
}

#content form span {
	display: block;
	color: red;
	font-style: italic;
	text-align: right;
}
</style>
<script type="text/javascript">
	var h1, form, input1, input2, textarea, delBtn;
	var edit = function(e) {
		//valid
	};
	window.onload = function() {
		h1 = document.querySelector('#content>h1');
		form = document.querySelector('#content form');
		input1 = form.querySelectorAll('input')[1];
		input2 = form.querySelectorAll('input')[2];
		delBtn = form.querySelectorAll('button')[1];
		textarea = form.querySelector('textarea');
		form.onsubmit = function(e) {
			input1.readOnly = false;
			input2.readOnly = false;
			textarea.readOnly = false;
			h1.innerHTML = h1.innerText.replace('상세', '수정');
			form.onsubmit = edit;
			return false;
		};
		delBtn.onclick = function(e) {
			if (confirm('삭제하시겠습니까?')) {
				form.action = 'delete.jsp';
				form.method = 'post';
				form.onsubmit = true;
				form.submit();
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
				<form action="../login/">
					<input type="text" name="id" /> <input type="password" name="pw" />
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
			<%@ page import="java.sql.*, com.inje.OracleDB"%>
			<%
				String num = request.getParameter("num");
				String sql = "select sub,id,nalja,content from bbs02 where num=" + num;
				String sub = null, id = null, nalja = null, content = "";
				try (
				    Connection conn = OracleDB.getConnection();
				    Statement stmt = conn.createStatement();
				    ResultSet rs = stmt.executeQuery(sql);
				) {
					if (rs.next()) {
						sub = rs.getString(1);
						id = rs.getString(2);
						nalja = rs.getDate(3).toString();
						content = rs.getString(4);
					}
					if (content == null) content = "";
				}
			%>
			<h1>
				상세페이지(<%=num%>)
			</h1>
			<form action="edit.jsp">
				<input type="hidden" name="num" value="<%=num%>">
				<div>
					<label for="sub">제목</label> <input name="sub" id="sub"
						value="<%=sub%>" readonly="readonly" />
				</div>
				<div>
					<label for="id">글쓴이</label> <input name="id" id="id"
						value="<%=id%>" readonly="readonly" />
				</div>
				<div>
					<label for="nalja">날짜</label> <input id="nalja" value="<%=nalja%>"
						disabled="disabled" />
				</div>
				<div>
					<textarea name="content" readonly="readonly"><%=content%></textarea>
				</div>
				<div>
					<button type="submit">수정</button>
					<button type="button">삭제</button>
					<button type="button" onclick="history.back();">뒤로</button>
				</div>
			</form>
			<!-- content end -->
		</div>
		<div id="footer">
			<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
			<p>Copyright &copy; 2024 INJE University. All rights reserved.</p>
		</div>
	</div>
</body>
</html>









<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width ="800" align = "center">
		<tr>
			<td colspan="2" align = "center">
			<h1>학생성적관리프로그램(ver 0.11.0)</h1>
			</td>
		</tr>
		<tr>
			<td valign = "top" bgcolor = "#999999" width="150" align = "center">
			<br>
				<a href ="list.jsp" style = "color:red;">보 기</a><br><br><br>
				<a href ="add.jsp" style = "color:red;">입 력</a><br><br><br>
				<a href ="edit.jsp" style = "color:red;">수 정</a><br><br><br>
				<a href ="del.jsp" style = "color:red;"	>삭 제</a>
			</td>
			<td>
				<!-- begin content -->
				<h2>학생 데이터 입력</h2>
				<form action="insert.jsp">
					<table width = "500" align = "center">
						<tr>
							<td width = "100" bgcolor ="#999999">학번</td>
							<td><input type = "text" name="num"></td>
						</tr>
						<tr>
							<td  bgcolor ="#999999">이름</td>
							<td><input type = "text" name="name"></td>
						</tr>
						<tr>
							<td  bgcolor ="#999999">국어</td>
							<td><input type = "text" name="kor"></td>
						</tr>
						<tr>
							<td bgcolor ="#999999">영어</td>
							<td><input type = "text" name="eng"></td>
						</tr>
						<tr>
							<td  bgcolor ="#999999">수학</td>
							<td><input type = "text" name="math"></td>
						</tr>
						<tr>
							<td colspan = "2" align = "center">
								<input type = "submit" value="입 력">
								<input type = "reset" value="취 소">
							</td>
						</tr>
					</table>
				</form>
				<!-- end content -->
			</td>
		</tr>
		<tr>
			<td colspan="2" align = "center" bgcolor="gray">
			<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
			<p>Copyright &copy; 2024 INJE University. All rights reserved.</p>
			</td>
		</tr>
	</table>
</body>
</html>
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
			<h1>�л������������α׷�(ver 0.11.0)</h1>
			</td>
		</tr>
		<tr>
			<td valign = "top" bgcolor = "#999999" width="150" align = "center">
			<br>
				<a href ="list.jsp" style = "color:red;">�� ��</a><br><br><br>
				<a href ="add.jsp" style = "color:red;">�� ��</a><br><br><br>
				<a href ="edit.jsp" style = "color:red;">�� ��</a><br><br><br>
				<a href ="del.jsp" style = "color:red;"	>�� ��</a>
			</td>
			<td>
				<!-- begin content -->
				<h2>�л� ������ �Է�</h2>
				<form action="insert.jsp">
					<table width = "500" align = "center">
						<tr>
							<td width = "100" bgcolor ="#999999">�й�</td>
							<td><input type = "text" name="num"></td>
						</tr>
						<tr>
							<td  bgcolor ="#999999">�̸�</td>
							<td><input type = "text" name="name"></td>
						</tr>
						<tr>
							<td  bgcolor ="#999999">����</td>
							<td><input type = "text" name="kor"></td>
						</tr>
						<tr>
							<td bgcolor ="#999999">����</td>
							<td><input type = "text" name="eng"></td>
						</tr>
						<tr>
							<td  bgcolor ="#999999">����</td>
							<td><input type = "text" name="math"></td>
						</tr>
						<tr>
							<td colspan = "2" align = "center">
								<input type = "submit" value="�� ��">
								<input type = "reset" value="�� ��">
							</td>
						</tr>
					</table>
				</form>
				<!-- end content -->
			</td>
		</tr>
		<tr>
			<td colspan="2" align = "center" bgcolor="gray">
			<p>����ķ�۽� (50834) �泲 ���ؽ� ������ 197</p>
			<p>Copyright &copy; 2024 INJE University. All rights reserved.</p>
			</td>
		</tr>
	</table>
</body>
</html>
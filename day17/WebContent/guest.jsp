<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="800" align="center">
	<tr>
		<td colspan="2">
			<img alt="logo" src="/day17/imgs/main_logo.png">
		</td>
		<td colspan="2">&nbsp;</td>
		<td colspan="2" align="right">
			<%
			Object obj2=session.getAttribute("result");
			if(obj2==null){ %>
			[<a href="loginform.jsp">LOGIN</a>]
			[<a href="joinform.jsp">JOIN</a>]
			<%
			}else{
				out.print(obj2.toString()+"님 로그인 중...");	
			%>
			<a href="logout.jsp">[LOGOUT]</a>
			<%	
			}
			%>
		</td>
	</tr>
	<tr>
		<td width="200" bgcolor="gray">&nbsp;</td>
		<td width="100" bgcolor="gray" align="center">[<a href="/day17/index.jsp">HOME</a>]</td>
		<td width="100" bgcolor="gray" align="center">[<a href="/day17/intro.jsp">INTRO</a>]</td>
		<td width="100" bgcolor="gray" align="center">[<a href="/day17/bbs.jsp">B B S</a>]</td>
		<td width="100" bgcolor="gray" align="center">[<a href="/day17/guest.jsp">GUEST</a>]</td>
		<td width="200" bgcolor="gray">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="6" align="center" height="400" valign="top">
		<!-- content begin -->
			<h1>방명록</h1>
			<form action="addGuest.jsp">
			<table width="500">
				<tr>
					<td width="120">글쓴이</td>
					<td><input type="text" name="id"></td>
					<td width="100" rowspan="2">
						<input type="submit" style="height:100%;width:100%;">
					</td>
				</tr>
				<tr>
					<td>남길글</td>
					<td><textarea name="content" rows="3" cols="40"></textarea></td>
				</tr>
			</table>
			</form>
			<%@page import="java.util.List" %>
			<%
			Object obj=application.getAttribute("guest");
			
			List<String[]> list=null;
			if(obj!=null) list=(List)obj;
			%>
			<table width="500" border="1" cellspacing="0">
			<%
			if(list!=null){
				for(int i=0; i<list.size(); i++){
			%>
				<tr>
					<td width="80"><%=list.get(i)[0] %></td>
					<td><%=list.get(i)[1] %></td>
					<td width="100"><a href="delGuest.jsp?idx=<%=i%>">[삭제]</a></td>
				</tr>
			<%
				}
			}
			%>
			</table>

		<!-- content end -->
		</td>
	</tr>
	<tr>
		<td colspan="6" bgcolor="gray" align="center">
			<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
			<p>TEL. 055-334-7111</p>
			<p>E-mail. webmaster@inje.ac.kr</p>
			<font color="white">
			Copyright &copy; 1996-2022 INJE University. All rights reserved.
			</font>
		</td>
	</tr>

</table>
</body>
</html>
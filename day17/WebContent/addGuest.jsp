<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta http-equiv="refresh" content="1; url=guest.jsp">
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
		<td colspan="6" align="center" height="400">
		<!-- content begin -->
<%@ page import="java.util.*" %>
<%
String id=request.getParameter("id");
String content=request.getParameter("content");

String[] row=new String[]{id,content};

Object obj=application.getAttribute("guest");
List<String[]> list=null;
if(obj==null)
	list=new ArrayList<>();
else list=(List)obj;
list.add(row);
application.setAttribute("guest", list);
%>
<h1>입력성공</h1>
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
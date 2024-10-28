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
			Object obj=session.getAttribute("result");
			if(obj==null){ %>
			[<a href="loginform.jsp">LOGIN</a>]
			[<a href="joinform.jsp">JOIN</a>]
			<%
			}else{
				out.print(obj.toString()+"님 로그인 중...");	
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
		<img alt="" src="https://www.inje.ac.kr/PDS/M_banner/20240624%EB%8B%A8%EC%B6%95%EA%B7%BC%EB%AC%B4%EC%8B%A4%EC%8B%9C%EC%95%88%EB%82%B4(1).jpg">
		<img alt="" src="https://www.inje.ac.kr/PDS/M_banner/20230912%EC%A2%8B%EC%9D%80%EC%82%AC%EC%9D%B43.jpg">
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
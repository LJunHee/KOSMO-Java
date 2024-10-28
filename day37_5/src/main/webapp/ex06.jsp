<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jstl 반복문</h1>
	<ul>
		<c:forEach begin="11" end="20" var="i" step="2" varStatus="status">
		<li>${i }
				-${status.index }
				-${status.count }
				-${status.current }
				-${status.first }		
				-${status.last }		
		</li>
		</c:forEach>
	</ul>
	
<%
String[] arr1={"item1","item2","item3","item4"};
pageContext.setAttribute("arr1",arr1);
%>
	<ul>
	<c:forEach items="${arr1 }" var="msg">
		<li>${msg }</li>
	</c:forEach>
	</ul>
<%
java.util.ArrayList list=null;
list=new java.util.ArrayList();
list.add(new com.emp.model.EmpDto(1,1111,"tester1",new java.util.Date()));
list.add(new com.emp.model.EmpDto(2,2222,"tester2",new java.util.Date()));
list.add(new com.emp.model.EmpDto(3,3333,"tester3",new java.util.Date()));
list.add(new com.emp.model.EmpDto(4,4444,"tester4",new java.util.Date()));
pageContext.setAttribute("list",list);
%>	
	<ul>
	<c:forEach items="${list }" var="bean">
		<li>${bean.empno } - ${bean.ename } - ${bean.pay }</li>
	</c:forEach>
	</ul>
</body>
</html>








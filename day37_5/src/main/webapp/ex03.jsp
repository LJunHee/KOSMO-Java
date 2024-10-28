<%@page import="com.emp.model.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String[] arr1 = {"item1","item2","item3","item4"};
pageContext.setAttribute("arr1",arr1);
%>
	<h1>el hrr</h1>
	<ul>
		<li>${arr1[0] }</li>
		<li>${arr1[1] }</li>
		<li>${arr1[2] }</li>
		<li>${arr1[3] }</li>
	</ul>
<%@ page import = "java.util.*" %>
<%
ArrayList list = new ArrayList();
list.add("list1");
list.add("list2");
list.add("list3");
list.add("list4");
pageContext.setAttribute("list",list);
%>
	<ol>
		<li>${list[0] }</li>
		<li>${list[1] }</li>
		<li>${list[2] }</li>
		<li>${list[3] }</li>
	</ol>
<%
HashMap map = new HashMap();
map.put("key1","val1");
map.put("key2","val2");
map.put("key3","val3");
map.put("key4","val4");
pageContext.setAttribute("map",map);
%>
	<ul>
		<li>${map['key1'] }</li>
		<li>${map['key2'] }</li>
		<li>${map['key3'] }</li>
		<li>${map['key4'] }</li>
	</ul>
	<ul>
		<li>${map.key1 }</li>
		<li>${map.key2 }</li>
		<li>${map.key3 }</li>
		<li>${map.key4 }</li>
	</ul>
<%
EmpDto bean = new EmpDto();
bean.setEmpno(11111);
bean.setPay(10000);
bean.setEname("tester");
bean.setHiredate(new Date());
pageContext.setAttribute("bean",bean);
%>
	<ul>
		<li>${bean.empno }</li>
		<li>${bean.ename }</li>
		<li>${bean.pay }</li>
		<li>${bean.hiredate }</li>
	</ul>
</body>
</html>
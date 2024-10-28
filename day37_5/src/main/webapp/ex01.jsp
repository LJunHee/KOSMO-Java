<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>el language (el 표현식)</h1>
	<table>
		<thead>
			<tr>
				<th>자료형</th>
				<th>자바</th>
				<th>el</th>
				<th>출력</th>
				<th>etc</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>숫자(정수)</td>
				<td><%=1234 %></td>
				<td>${1234 }</td>
				<td>＄{1234 }</td>
				<td></td>
			</tr>
			<tr>
				<td>숫자(실수)</td>
				<td><%=3.14+1 %></td>
				<td>${3.14+1 }</td>
				<td>＄{3.14 }</td>
				<td></td>
			</tr>
			<tr>
				<td>문자열</td>
				<td><%="문자열" %></td>
				<td>${"문자열" }</td>
				<td>＄{"문자열" }</td>
				<td></td>
			</tr>
			<tr>
				<td>문자열</td>
				<td><%="문자열" %></td>
				<td>${'문자열' }</td>
				<td>＄{'문자열' }</td>
				<td></td>
			</tr>
			<tr>
				<td>boolean</td>
				<td><%=true %></td>
				<td>${true }</td>
				<td>＄{true }</td>
				<td></td>
			</tr>
			<tr>
				<td>boolean</td>
				<td><%=false %></td>
				<td>${false }</td>
				<td>＄{false }</td>
				<td></td>
			</tr>
			<tr>
				<td>객체</td>
				<td><% String msg = null; out.print(msg); %></td>
				<td>${null }</td>
				<td>＄{null }</td>
				<td></td>
			</tr>
			<tr>
				<td>연산자</td>
				<td><%=1+2 %></td>
				<td>${1+2 }</td>
				<td>＄{1+2 }</td>
				<td></td>
			</tr>
			<tr>
				<td>연산자</td>
				<td><%=1-2 %></td>
				<td>${1-2 }</td>
				<td>＄{1-2 }</td>
				<td></td>
			</tr>
			<tr>
				<td>연산자</td>
				<td><%=2*3 %></td>
				<td>${2*3 }</td>
				<td>＄{2*3 }</td>
				<td></td>
			</tr>
			<tr>
				<td>연산자</td>
				<td><%=6/2 %></td>
				<td>${6/2 }</td>
				<td>＄{6/2 }</td>
				<td></td>
			</tr>
			<tr>
				<td>연산자</td>
				<td><%=5/2 %></td>
				<td>${5/2 }</td>
				<td>＄{5/2 }</td>
				<td></td>
			</tr>
			<tr>
				<td>연산자</td>
				<td><%=5%2 %></td>
				<td>${5%2 }</td>
				<td>＄{5%2 }</td>
				<td></td>
			</tr>
			<tr>
				<td>연산자</td>
				<td><%=5%2 %></td>
				<td>${5 div 2 }</td>
				<td>＄{5 div 2 }</td>
				<td></td>
			</tr>
			<tr>
				<td>연산자</td>
				<td><%=5%2 %></td>
				<td>${5 mod 2 }</td>
				<td>＄{5 mod 2 }</td>
				<td></td>
			</tr>
			<tr>
				<td>비교연산</td>
				<td><%=5 > 2 %></td>
				<td>${5 > 2 }</td>
				<td>＄{5 > 2 }</td>
				<td></td>
			</tr>
			<tr>
				<td>비교연산</td>
				<td><%=5 == 2 %></td>
				<td>${5 == 2 }</td>
				<td>＄{5 == 2 }</td>
				<td></td>
			</tr>
			<tr>
				<td>비교연산</td>
				<td><%=5 == 5 %></td>
				<td>${5 == 5 }</td>
				<td>＄{5 == 5 }</td>
				<td></td>
			</tr>
			<tr>
				<td>비교연산</td>
				<td><%=5 == 5 %></td>
				<td>${5 eq 5 }</td>
				<td>＄{5 eq 5 }</td>
				<td></td>
			</tr>
			<tr>
				<td>비교연산</td>
				<td><%=5 > 3 %></td>
				<td>${5 gt 3 }</td>
				<td>＄{5 gt 3 }</td>
				<td></td>
			</tr>
			<tr>
				<td>비교연산</td>
				<td><%=5 < 3 %></td>
				<td>${5 lt 3 }</td>
				<td>＄{5 lt 3 }</td>
				<td></td>
			</tr>
			<tr>
				<td>비교연산</td>
				<td><%=5 >= 3 %></td>
				<td>${5 ge 3 }</td>
				<td>＄{5 ge 3 }</td>
				<td></td>
			</tr>
			<tr>
				<td>비교연산</td>
				<td><%=5 <= 3 %></td>
				<td>${5 le 3 }</td>
				<td>＄{5 le 3 }</td>
				<td></td>
			</tr>
			<tr>
				<td>삼항연산자</td>
				<td><%=3>5?"크다":"작다" %></td>
				<td>${3>5?'크다':'작다' }</td>
				<td>＄{3>5?'크다':'작다' }</td>
				<td></td>
			</tr>
		</tbody>
	</table>
</body>
</html>
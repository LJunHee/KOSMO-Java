<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../template/head.jspf" %>
</head>
<body>
<%@ include file="../template/menu.jspf" %>
<div class="container">
	<ol class="breadcrumb">
	  <li><a href="${root }/">Home</a></li>
	  <li><a href="${root }/dept/">List</a></li>
	  <li class="active">${title }</li>
	</ol>
	<h2 class="page-header">${title } page<small>(${bean.deptno })</small></h2>
	<form action="./${bean.deptno }" method="post">
		<div class="form-group">
			<input type="text" name="deptno" value="${bean.deptno }" class="form-control" readonly/>
		</div>
		<div class="form-group">
			<input type="text" name="dname" value="${bean.dname }" class="form-control" ${readonly }/>
		</div>
		<div class="form-group">
			<input type="text" name="loc" value="${bean.loc }" class="form-control" ${readonly }/>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary">수정</button>
			${readonly ne null?'<button type="button" class="btn btn-danger">삭제</button>': ''}
			<button type="reset" class="btn btn-default">취소</button>
			<button type="button" class="btn btn-default"onclick="history.back();">뒤로</button>
		</div>
	</form>
</div>
<script type="text/javascript">
$('form').find('button').filter((idx,ele)=>$(ele).hasClass('btn-danger')).click(e=>{
	$.ajax({
		url:'${root}'+"/dept/"+'${bean.deptno}',
		type:'delete',
		success:data=> {
			if(data.result=='true')location.href='./'
			else console.log('실패')
			}
	});
});
$('form').one('submit',e=>{
	e.preventDefault();
	$('form').find('input:gt(0)').removeAttr('readonly');
	$('form').prev().html($('form').prev().html().replace('Detail','Update'));
	$('ol>li').filter((idx,ele)=>$(ele).hasClass('active')).text('Update');
	$('form').find('button').filter((idx,ele)=>$(ele).hasClass('btn-danger')).remove();
	$('form').one('submit',e=>{
		e.preventDefault();
		const param=$('form').serialize();
		console.log(param);
		$.ajax({
			url:'${root}'+"/dept/"+'${bean.deptno}',
			data:param,
			type:'put',
			success:data=> {
				if(data.result=='true')location.href='./'
				else console.log('실패')
				},
			error:(xhr,errMsg)=>console.log(errMsg)
		});
	});
});
</script>
</body>
</html>













<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../template/head.jspf" %>
<script type="text/javascript">
// var f1=function(){return 100};
// var f2=()=>{return 100;};
// var f3=()=>100;

// var f4=function(a,b){return a+b;};
// var f5=(a,b)=>a+b;

	$(function(){
		$('form button')
			.filter((idx,ele)=>$(ele).hasClass('btn-danger'))
			.click(e=>$.post(
				'delete.do',
				'idx='+$('form input').eq(0).val(),
				data=>{
					if($(data).find('result').html()=='true')
						location.href='list.do';
					else alert($(data).find('empno').html()+'번이 존재하지 않습니다');
					}
				)
		);
	});
</script>
</head>
<body>
<%@ include file="../template/menu.jspf" %>
<h2 class="page-header">${detail==null?"edit":"detail"} page</h2>
<form action="${detail==null?'update':'edit'}.do" method="post">
	<div class="form-group">
		<label>empno</label>
		<input type="text" name="empno" class="form-control" value="${bean.empno }" readonly/>
	</div>
	<div class="form-group">
		<label>ename</label><span class="text-danger">${enameErr }</span>
		<input type="text" name="ename" class="form-control" value="${bean.ename }" ${detail }/>
	</div>
	<div class="form-group">
		<label>hiredate</label>
		<input type="text" class="form-control" value="${bean.hiredate }" readonly/>
	</div>
	<div class="form-group">
		<label>pay</label><span class="text-danger">${payErr }</span>
		<input type="text" name="pay" class="form-control" value="${bean.pay }" ${detail }/>
	</div>
	<div class="form-group">
		<button class="btn btn-primary btn-block">수정</button>
		<button type="${detail==null?'reset':'button' }" class="btn btn-${detail==null?'default':'danger'} btn-block">${detail==null?'취소':'삭제'}</button>
		<button type="button" class="btn btn-default btn-block" onclick="history.back();">뒤로</button>
	</div>
</form>
<%@ include file="../template/footer.jspf" %>
</body>
</html>
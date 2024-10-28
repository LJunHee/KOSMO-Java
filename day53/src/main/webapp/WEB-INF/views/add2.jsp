<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<script type="text/javascript">
$(function(){
	var file=$('form #file');
	file.find('button').click(e=>{
		file.append('<br/><input type="file" name="files"/>');
	});
});
</script>
</head>
<body>
	<form action="./add2" method="post" enctype="multipart/form-data">
		<div>
			<input name="name" placeholder="name"/>
		</div>
		<div id="file">
			<button type="button">추가</button>
			<input type="file" name="files"/>
		</div>
		<div>
			<button>입력</button>
		</div>
	</form>
</body>
</html>
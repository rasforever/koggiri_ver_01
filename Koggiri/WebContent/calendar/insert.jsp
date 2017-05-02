<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script type="text/javascript">
$(function(){

	$(".datepicker").datepicker({

	dateFormat : "yy/mm/dd"

	});

});


</script>
</head>
<body>
	<form action="send.cal">
	내용: <input type="text" name="title"><br>
	시작일: <input type="text" class="datepicker" name="start"><br>
	종료일: <input type="text" class="datepicker" name="end"><br>
	</form>
</body>
</html>
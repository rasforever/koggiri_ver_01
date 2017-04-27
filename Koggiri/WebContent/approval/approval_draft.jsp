<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script>
	$(function() {
		$(".datepicker").datepicker({
			dateFormat : "yy/mm/dd"
		});
	});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form>
		사&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;번 : <input type="text" name="emp_id" disabled>&nbsp;&nbsp;&nbsp; 
		이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름 : <input type="text" name="emp_nm" disabled> <br>
		소&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;속 : <input type="text" name="dept_nm" disabled>&nbsp;&nbsp;&nbsp; 
		직&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;급 : <input type="text" name="pos_nm" disabled> <br>
		기&nbsp;안&nbsp;일 : <input type="text" name="draft_dt" class="datepicker"><br>
		제목 : <input type="text" name = "draft_title"><br>
	 	내용 : <br>
	 	<textarea rows="20" cols="100" name = "draft_content"></textarea>
		<br>
		<input type="submit" value="등록">
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>업무등록</h3>
<hr>
<form action="ta_insertAction.do" method="post"> 	
	금주업무실적:<br>
	<textarea rows="6" cols="70" name="ta_weekresult"></textarea>
	</div>
	<br>
	<div>
	차주업무계획:<br>
	<textarea rows="6" cols="70" name="ta_nextresult"></textarea>
	<div>
	<br>
	<div>
	<input type="submit" value="등록">
	<input type="reset" value="취소">
	</div>
</form>
</body>
</html>
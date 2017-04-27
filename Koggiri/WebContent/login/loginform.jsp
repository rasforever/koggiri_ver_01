<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 폼</title>
</head>
<body>
	<form action="loginform.login" method="post">
		ID <input type="text" name="mem_id" maxlength="15"><br> 
		PW <input type="password" name="mem_pw" maxlength="15"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>
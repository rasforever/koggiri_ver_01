<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/login.css">
<title>로그인 폼</title>
</head>
<body>
<div id="login_outer" align="center" valign="middle">
	<form action="loginform.login" method="post">
	<div id="login">
	<img src="../images/koggiri.PNG">
		<table id="logtable">
		<tr>
		<td><input type="text" name="mem_id" maxlength="15" placeholder="아이디를 입력하세요" class="idpw"></td>
		<td rowspan="2"><input type="submit" value="LOGIN" id="loginbt"></td>
		</tr>
		<tr>
		<td><input type="password" name="mem_pw" maxlength="15" placeholder="비밀번호를 입력하세요" class="idpw"></td>
		</tr>
		</table>
	</div>


	</form>

</div>
</body>
</html>
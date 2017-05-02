<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="changePw.pw" method="post">
<p>
	현재 비밀번호 <br/><input type="password" name="curPw">
	<c:if test ="${errors.curPw }">현재 암호를 입력하세요.</c:if>
	<c:if test = "${errors.badCurPw }">현재 암호가 일치하지 않습니다.</c:if>
</p>
<p>
	새 비밀번호 <br/><input type="password" name="newPw">
	<c:if test="${errors.newPw }">새 암호를 입력하세요.</c:if>
</p>
<input type="submit" value="비밀번호 변경">
</form>
</body>
</html>
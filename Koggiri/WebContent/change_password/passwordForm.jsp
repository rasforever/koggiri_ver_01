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
	���� ��й�ȣ <br/><input type="password" name="curPw">
	<c:if test ="${errors.curPw }">���� ��ȣ�� �Է��ϼ���.</c:if>
	<c:if test = "${errors.badCurPw }">���� ��ȣ�� ��ġ���� �ʽ��ϴ�.</c:if>
</p>
<p>
	�� ��й�ȣ <br/><input type="password" name="newPw">
	<c:if test="${errors.newPw }">�� ��ȣ�� �Է��ϼ���.</c:if>
</p>
<input type="submit" value="��й�ȣ ����">
</form>
</body>
</html>
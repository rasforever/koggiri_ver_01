<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../Main/header.jsp"></jsp:include>
	<form action="passcheck.admin" method="post">
		아이디 <%=session.getAttribute("mem_id")%>
		<br>
		<input type="password" name="mem_pw" maxlength="15" placeholder="비밀번호를 입력하세요" class="idpw">
		<input type="submit" value="확인">
	</form>
	<jsp:include page="../Main/footer.jsp"></jsp:include>
</body>
</html>
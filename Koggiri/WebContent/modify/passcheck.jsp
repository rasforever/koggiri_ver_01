<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/modify.css">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<jsp:include page="../Main/header.jsp"></jsp:include>
	<form action="passcheck.admin" method="post">
	<br><br><br><br><br><br><br><br>
	<br><br><br><br><br><br><br><br>
	<div id="passcheck">
		<label id="id_label">아이디 '&nbsp;<%=session.getAttribute("mem_id")%>&nbsp;'</label>
		<br>
		<input type="password" name="mem_pw" maxlength="15" placeholder="비밀번호를 입력하세요" class="idpw_pw">
		<input type="submit" value="확인" id="pw_btn">
		</div>
	</form>
	<br><br><br><br><br><br><br><br>
	<br><br><br><br><br><br><br><br>
	<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
			</div>
	</div>
</body>

</html>
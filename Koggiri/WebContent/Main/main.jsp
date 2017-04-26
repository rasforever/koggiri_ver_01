<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<div id="main_header">
		<jsp:include page="header.jsp" />
	</div>
	<div id="main_contain" align="center">
	<br>
	<br>
	<br>
	<br>
	<br>
	<table id="main_tab">
		<tr>
		<td><jsp:include page="main_mail.jsp" /></td>
		<td><jsp:include page="main_notice.jsp" /></td>
		<td><jsp:include page="main_appr.jsp" /></td>
		<tr>
		<td><jsp:include page="main_cal.jsp" /></td>
		<td><jsp:include page="main_important.jsp" /></td>
		<td><jsp:include page="main_test.jsp" /></td>
		</tr>
	</table>
		<br>
	<br>
	<br>
	<br>
	<br>
	</div>

	<div id="main_footer">
	<jsp:include page="footer.jsp" />
	</div>
</body>
</html>
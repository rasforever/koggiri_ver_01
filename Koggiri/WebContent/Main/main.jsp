<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<div id="main_outer" align="center">
	<div id="main_header" align="center">
		<jsp:include page="header.jsp" />
	</div>
	<div id="main_contain" align="center">
		<br> <br>
		<table id="main_tab" align="center">
			<tr>
				<td><span>MyInformation</span><br><jsp:include
						page="main_my.jsp" /></td>
				<td><span>Notice</span><br><jsp:include
						page="main_notice.jsp" /></td>
				<td><span>Approval</span><br><jsp:include
						page="main_appr.jsp" /></td>
			<tr />
			<tr>
				<td><span>Mail</span><br><jsp:include page="main_mail.jsp" /></td>
				<td><span>Calendar</span><br><jsp:include
						page="main_cal.jsp" /></td>
				<td><span>Important</span><br><jsp:include
						page="main_important.jsp" /></td>

			</tr>
		</table>
		<br> <br>
	</div>
	<div id="main_footer">
		<jsp:include page="footer.jsp" />
	</div>
	</div>
</body>
</html>
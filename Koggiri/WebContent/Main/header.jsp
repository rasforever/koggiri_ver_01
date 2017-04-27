<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String emp_nm =(String) session.getAttribute("emp_nm");
	System.out.println(emp_nm);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/main.css">
<title>Insert title here</title>

</head>
<body>

	<div id="header" align="center">
		<div id="log" align="right">
			<span> <%=emp_nm %>님 접속 중입니다.</span> <a href="#">로그아웃</a>
		</div>
		<div id="main_top" align="center">
		<div id="main_logo">
		<img src="../images/koggiri.PNG">
		</div>
		<div id="main_menu">
			<ul>
				<li><a href="#">공지사항</a></li>
				<li><a href="#">일정</a></li>
				<li><a href="#">메일</a></li>
				<li><a href="#">결재</a></li>
				<li><a href="#">문서</a></li>
				<li><a href="#">업무</a></li>
				<li><a href="#">회의</a></li>
				<li><a href="#">조직도</a></li>

			</ul>
		</div>
	</div>
</div>
	<form>
</body>
</html>
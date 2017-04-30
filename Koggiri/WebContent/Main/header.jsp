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
<link type="text/css" rel="stylesheet" href="../style/main_menu.css">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script>
	$(document).ready(function(){
		$("#btnlogout").click(function(){
			location.href="../logout/logoutform.login";
		});
	});
</script>
</head>
<body>

	<div id="header" align="center">
		<div id="log" align="right">
			<span> <%=emp_nm %>님 접속 중입니다.</span>  <a href="#" id="btnlogout">로그아웃</a>
		</div>
		<div id="main_top" align="center">
		<div id="main_logo">
		<a href="../Main/main.jsp"><img src="../images/koggiri.PNG"></a>
		</div>
		
	<div class="main_menu">

		<ul>
			<li><a href="#">공지사항</a>
				<ul>
					<li><a href="../Noticeboard/listAction.noticeboard">공지합니다</a></li>
					<li><a href="#">알립니다</a></li>
				</ul></li>

			<li><a href="#">일정</a></li>
			<li><a href="#">메일</a></li>
			<li><a href="#">결재</a></li>
			<li><a href="#">문서</a></li>
			<li><a href="#">업무</a></li>
			<li><a href="#">회의</a>
				<ul>
					<li><a href="#">그림회의</a></li>
					<li><a href="#">화상회의</a></li>
				</ul></li>
			<li><a href="#">조직도</a></li>

		</ul>
	</div>
	</div>
</div>
	<form>
</body>
</html>
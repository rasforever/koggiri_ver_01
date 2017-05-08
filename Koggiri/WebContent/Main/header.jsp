<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String emp_nm = (String) session.getAttribute("emp_nm");
	System.out.println(emp_nm);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/main.css">
<link type="text/css" rel="stylesheet" href="../style/main_menu.css">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.1/themes/base/jquery-ui.css" />
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src='lib/moment.min.js'></script>
<script src='fullcalendar.js' charset="euc-kr"></script>
<script src='locale/ko.js'></script>
<link type="text/css" rel="stylesheet" href="jquery.qtip.min.css" />
<script type="text/javascript" src="jquery.qtip.min.js"></script>
<script>
	$(document).ready(function() {
		$("#btnlogout").click(function() {
			location.href = "../logout/logoutform.login";
		});
	});
</script>
</head>
<body>

	<div align="center">
		<div id="header" align="center">
			<div id="log" align="right">
				<span> <%=emp_nm%>님 접속 중입니다.<!-- 해당 사원의 이름을 표시 -->
				</span> <a href="#" id="btnlogout">로그아웃</a> <!-- 로그아웃을 누르면 로그인 창으로 이동 -->
			</div>

					<div class="main_menu" align="center" style="width: 1100px">
							<a href="../Main/main.jsp"><img src="../images/koggiri.PNG"></a>
						<ul style="width: 900px">
							<li><a href="#">공지사항</a>
								<ul>
									<li><a href="../Noticeboard/listAction.noticeboard">공지합니다</a></li>
									<li><a href="../Importantboard/listAction.importantboard">알립니다</a></li>
								</ul></li>

							<li><a href="../calendar/index.jsp">일정</a></li>
							<li><a href="#">메일</a></li>
							<li><a href="#">결재</a>
								<ul>
									<li><a href="../approval/approval_list_s.approval">결재목록</a></li>
									<li><a href="../approval/approval_insertForm.approval">결재작성</a></li>
								</ul>
							</li>
							<li><a href="#">문서</a></li>
							<li><a href="#">업무</a></li>
							<li><a href="#">회의</a>
								<ul>
									<li><a href="#">그림회의</a></li>
									<li><a href="#">화상회의</a></li>
								</ul></li>
							<li><a href="../member_chart/chart.ch">조직도</a></li>

						</ul>
					</div>
				</div>
			</div>
</body>
</html>
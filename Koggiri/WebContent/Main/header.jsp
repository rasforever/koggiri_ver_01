<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String emp_nm = (String) session.getAttribute("emp_nm");
	String mem_id = (String) session.getAttribute("mem_id");
	request.setAttribute("mem_id", mem_id);
	request.setAttribute("emp_nm",emp_nm);
	System.out.println(emp_nm);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link type="text/css" rel="stylesheet" href="../style/main.css">
<link type="text/css" rel="stylesheet" href="../style/main_menu.css">
<link type="text/css" rel="stylesheet" href="../style/chart.css">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script src='lib/moment.min.js'></script>
<script src='fullcalendar.js' charset="euc-kr"></script>
<script src='locale/ko.js'></script>
<link type="text/css" rel="stylesheet" href="jquery.qtip.min.css" />
<script type="text/javascript" src="jquery.qtip.min.js"></script>


<title>Insert title here</title>



<script>
	$(document).ready(function() {
		$("#btnlogout").click(function() {
			location.href = "../logout/logoutform.login";
		});
	});
</script>
<script type="text/javascript">

$(function(){
  //id 가 Tabs 인 div 태그를 탭형태로 출력해줍니다.
  $( "#Tabss" ).tabs({ 
     select: function(event, ui) {                   
           window.location.replace(ui.tab.hash);
        }
  });
 
});


	   $('#Tabss').click(function() {
	      $('#chart_detail').empty();
	   });

</script>
</head>
<body>

	<div align="center">
		<div id="header" align="center">
			<div id="log" align="right">

				
				<c:if test="${mem_id!='master' }">
				<span> ${emp_nm }님 접속 중입니다.
				</span>
				</c:if>
				<c:if test="${mem_id=='master' }">
				<span> ${mem_id }님 접속 중입니다.
				</span>
				<c:if test="${mem_id=='master' }">
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a id="master_log" href="../admin/searchEmp.admin">관리자 페이지</a>
			
				</c:if>
				</c:if>
				│ <a href="../modify/passcheck.jsp" id="myimp">내 정보 수정</a> │
				 <a href="#" id="btnlogout">로그아웃</a>

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
							<li><a href="../Document/listAction.document">문서</a></li>
							<li><a href="#">업무</a>
							    <ul>
									<li><a href="../Task/ta_insertformAction.task">업무작성</a></li>
									<li><a href="../Task/ta_listAction.task">업무목록</a></li>
								</ul>
								</li>
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
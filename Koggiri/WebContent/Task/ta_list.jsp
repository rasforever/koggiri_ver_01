<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <script src="jquery.js"></script>
    <script type="text/javascript" src="jquery-ui.min.js"></script>
 	<link rel="stylesheet" type="text/css" media="screen" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/themes/base/jquery-ui.css">
	<link rel="stylesheet" type="text/css" media="screen" href="../jquery-ui-1.8.14/themes/base/jquery-ui.css">
	<link rel="stylesheet" type="text/css" href="../style/task.css">
	<link rel="stylesheet" type="text/css" href="../style/board.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function() {
    var startDate;
    var endDate;
    
    $('.week-picker').datepicker( {
        showOtherMonths: true,
        selectOtherMonths: true,
		selectWeek:true,
        onSelect: function(dateText, inst) { 
            var date = $(this).datepicker('getDate');
            startDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() - date.getDay() + 1);
            endDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() - date.getDay() + 5);
			var dateFormat = 'yy/mm/dd'
            startDate = $.datepicker.formatDate( dateFormat, startDate, inst.settings );
            endDate = $.datepicker.formatDate( dateFormat, endDate, inst.settings );

			$('.week-picker').val(startDate + '~' + endDate);
            
            setTimeout("applyWeeklyHighlight()", 100);
        },
		beforeShow : function() {
			setTimeout("applyWeeklyHighlight()", 100);
		}
    });
});

function applyWeeklyHighlight() {

	$('.ui-datepicker-calendar tr').each(function() {

		if ($(this).parent().get(0).tagName == 'TBODY') {
			$(this).mouseover(function() {
				$(this).find('a').css({
					'background' : '#ffffcc',
					'border' : '1px solid #dddddd'
				});
				$(this).find('a').removeClass('ui-state-default');
				$(this).css('background', '#ffffcc');
			});
			
			$(this).mouseout(function() {
				$(this).css('background', '#ffffff');
				$(this).find('a').css('background', '');
				$(this).find('a').addClass('ui-state-default');
			});
		}

	});
}
</script>
</head>
<body>
<div align="center">
   <div id="main_header"><jsp:include page="../Main/header.jsp" /></div>
	<br><br><br><br>
	<div id="task" align="center">
	<h3 align="center">Task</h3>
	<br><br>
	<table id="task_table">
		<tr>
			<th>글번호</th>
			<th>업무기간</th>			
			<th>작성일자</th>				
		</tr>
			<c:forEach var = "task" items = "${list}">
		<tr align="center">
		<td>${task.ta_seq}</td>
		<td><a href="ta_detailAction.task?ta_seq=${task.ta_seq}">${task.ta_date}</a></td>
		<td>${task.ta_regdate}</td>
		</tr>
		</c:forEach>
			</table>
			</div>
		<br>
		<div id="bottom" align="center">
			<!--페이징 처리할 곳 -->
			<!-- 1.한 페이지당 글의 갯수  2.전체 총 글의 갯수  3.시작페이지  4.마지막페이지  -->
			<!-- 현재페이지, start_row, end_row  -->

			<!--[이전] 버튼 만들기!  -->
			<c:if test="${task_listModel.startPage > 5}">
				<a href="ta_listAction.task?pageNum=${task_listModel.startPage - 5 }">[이전]</a>
			</c:if>
			<!-- 페이지 목록  -->
			<c:forEach var="pageNo" begin="${task_listModel.startPage}"
				end="${task_listModel.endPage}">
				<c:if test="${task_listModel.requestPage == pageNo }">
					<b>
				</c:if>
				<!-- <b>태그는 글씨를 두껍게 해주는 태그 -->
				<a href="ta_listAction.task?pageNum=${ pageNo}">[${pageNo}]</a>
				<c:if test="${task_listModel.requestPage == pageNo }">
					</b>
				</c:if>
			</c:forEach>
			<!-- [이후] 버튼 만들기!  -->
			<c:if test="${task_listModel.endPage < task_listModel.totalPageCount}">
				<a href="ta_listAction.task?pageNum=${task_listModel.startPage + 5 }">[이후]</a>
			</c:if>
		</div>
		<!-- bottom div -->
		<br>
		<br>
		<form action="ta_listAction.task" method="post">
			<div align="right" id="task_search">
				<input type="hidden" name="temp" value="temp"></input> 
			   <input type="text" name="searchKey" size="22" class="week-picker" placeholder="업무기간을 선택하세요" >
			   <input type="submit" value="검색" id="search_btn">
			</div>
		</form> 
		<br> <br> <br><br> <br> <br>
		<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
		</div>
</body>
</html>
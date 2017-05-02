<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table width="500" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th>글번호</th>
			<th>업무시작일~업무마감일</th>			
			<th>작성일자</th>			
			<th>조회수</th>			
		</tr>
			<c:forEach var = "task" items = "${list}">
		<tr>
		<td>${task.ta_seq}</td>
		<td><a href="ta_detailAction.task?ta_seq=${task.ta_seq}">${task.ta_startdate} ~ ${task.ta_enddate}</a></td>
		<td>${task.ta_regdate}</td>
		<td>${task.ta_hitcount}</td>
		</tr>
		</c:forEach>
			</table>
	<br>
	
	<br>
		<br>
		<div id="ta_page">
			<!--페이징 처리할 곳 -->
			<!-- 1.한 페이지당 글의 갯수  2.전체 총 글의 갯수  3.시작페이지  4.마지막페이지  -->
			<!-- 현재페이지, start_row, end_row  -->

			<!--[이전] 버튼 만들기!  -->
			<c:if test="${Task_ListModel.startPage > 5}">
				<a href="ta_listAction.task?pageNum=${Task_ListModel.startPage - 5 }">[이전]</a>
			</c:if>
			<!-- 페이지 목록  -->
			<c:forEach var="pageNo" begin="${Task_ListModel.startPage}"
				end="${Task_ListModel.endPage}">
				<c:if test="${Task_ListModel.requestPage == pageNo }">
					<b>
				</c:if>
				<!-- <b>태그는 글씨를 두껍게 해주는 태그 -->
				<a href="ta_listAction.task?pageNum=${ pageNo}">[${pageNo}]</a>
				<c:if test="${Task_ListModel.requestPage == pageNo }">
					</b>
				</c:if>
			</c:forEach>
			<!-- [이후] 버튼 만들기!  -->
			<c:if test="${Task_ListModel.endPage < Task_ListModel.totalPageCount}">
				<a href="ta_listAction.task?pageNum=${Task_ListModel.startPage + 5 }">[이후]</a>
			</c:if>
		</div>
		<!-- ta_page div -->
		<br>
		<br>
			<form action="ta_listAction.task" method="post">
			<div align="left" id="task_search">
				<input type="hidden" name="temp" value="temp"></input> 
				<input type="checkbox" name="area" value="ta_startdate">시작일 
					<input type="checkbox" name="area" value="ta_enddate">종료일
					<input type="text" name="searchKey" size="30"></input> <input
					type="submit" value="검색" id="search_btn">
			</div>
		</form>
		<br> <br> <br><br> <br> <br>
</body>
</html>
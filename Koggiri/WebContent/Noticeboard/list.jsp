
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/board.css">
<title>Insert title here</title>
</head>
<body>
	<div id="main_header" align="center">
		<jsp:include page="../Main/header.jsp" />
	</div>
	<div align="center">
			<br><br><br><br>
	<div class="list" align="center">
		<h3>Notice</h3>
		<br><br>
		<table id="list_tb">
			<tr>
				<th width="100">글번호</th>
				<th width="400">제목</th>
				<th width="150">작성자</th>
				<th width="150">작성일자</th>
				<th width="150">조회수</th>
			</tr>
			<c:forEach var="board" items="${list }">
				<tr>
					<td align="center">${board.n_id }</td>
					<td><a href="detailAction.noticeboard?n_id=${board.n_id }">${board.n_title }</a></td>
					<td align="center">${board.n_emp_nm}</td>
					<td align="center">&nbsp;&nbsp;<fmt:formatDate  pattern="YYYY/MM/dd HH:mm" value= "${board.n_date }"/></td>
					<td align="center">${board.n_hit }</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<br> <span id="insert_a"><a href="insertFormAction.noticeboard">글쓰기</a></span>
		<br>
		<br>
		<div id="bottom">
			<!--페이징 처리할 곳 -->
			<!-- 1.한 페이지당 글의 갯수  2.전체 총 글의 갯수  3.시작페이지  4.마지막페이지  -->
			<!-- 현재페이지, start_row, end_row  -->

			<!--[이전] 버튼 만들기!  -->
			<c:if test="${listModel.startPage > 5}">
				<a href="listAction.noticeboard?pageNum=${listModel.startPage - 5 }">[이전]</a>
			</c:if>
			<!-- 페이지 목록  -->
			<c:forEach var="pageNo" begin="${listModel.startPage}"
				end="${listModel.endPage}">
				<c:if test="${listModel.requestPage == pageNo }">
					<b>
				</c:if>
				<!-- <b>태그는 글씨를 두껍게 해주는 태그 -->
				<a href="listAction.noticeboard?pageNum=${ pageNo}">[${pageNo}]</a>
				<c:if test="${listModel.requestPage == pageNo }">
					</b>
				</c:if>
			</c:forEach>
			<!-- [이후] 버튼 만들기!  -->
			<c:if test="${listModel.endPage < listModel.totalPageCount}">
				<a href="listAction.noticeboard?pageNum=${listModel.startPage + 5 }">[이후]</a>
			</c:if>
		</div>
		<!-- bottom div -->
		<br>
		<br>
		<form action="listAction.noticeboard" method="post">
			<div align="left" id="search_div">
				<input type="hidden" name="temp" value="temp"></input> <input
					type="checkbox" name="area" value="n_title">제목</input> <input
					type="checkbox" name="area" value="n_content">내용</input> <input
					type="text" name="searchKey" size="30"></input> 
					<input type="submit" value="검색" id="search_btn">
			</div>
			<!-- search_div div -->
		</form>
			</div>
		<br> <br> <br><br> <br> <br>
	</div>
	<!-- list div -->
	<div id="main_footer">
		<jsp:include page="../Main/footer.jsp" />
	</div>

</body>
</html>
















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
			<th>제목</th>
			<th>작성자</th>			
			<th>작성일자</th>			
			<th>조회수</th>			
		</tr>
		<c:forEach var = "board" items = "${list }">
		<tr>
			<td>${board.n_id }</td>
			<td><a href="detailAction.noticeboard?n_id=${board.n_id }">${board.n_title }</a></td>
			<td>${board.n_emp_id}</td>			
			<td>${board.n_date }</td>			
			<td>${board.n_hit }</td>			
		</tr>
		</c:forEach>
	</table>
	<br><br>
	
	<!--페이징 처리할 곳 -->
	<!-- 1.한 페이지당 글의 갯수  2.전체 총 글의 갯수  3.시작페이지  4.마지막페이지  -->
	<!-- 현재페이지, start_row, end_row  -->
	
	<!--[이전] 버튼 만들기!  -->
	<c:if test="${listModel.startPage > 5}">
		<a href = "listAction.noticeboard?pageNum=${listModel.startPage - 5 }">[이전]</a>
	</c:if>
	
	<!-- 페이지 목록  -->
	<c:forEach var="pageNo" begin = "${listModel.startPage}" end = "${listModel.endPage}">
		<c:if test="${listModel.requestPage == pageNo }"><b></c:if> <!-- <b>태그는 글씨를 두껍게 해주는 태그 -->
			<a href = "listAction.noticeboard?pageNum=${ pageNo}">[${pageNo}]</a>
		<c:if test="${listModel.requestPage == pageNo }"></b></c:if>
	</c:forEach>
	
	<!-- [이후] 버튼 만들기!  -->
	 <c:if test="${listModel.endPage < listModel.totalPageCount}">
	 	<a href = "listAction.noticeboard?pageNum=${listModel.startPage + 5 }">[이후]</a>
	 </c:if>
	
	
	<form action="listAction.noticeboard" method ="post">
		<input type = "checkbox" name = "area" value = "n_title">제목</input>
		<input type = "checkbox" name = "area" value = "n_emp_id">작성자</input>
		<input type = "text" name = "searchKey" size = "10"></input>
		<input type = "submit" value = "검색">
	
	</form>
</body>
</html>















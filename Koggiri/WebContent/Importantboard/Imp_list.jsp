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
		<c:forEach var="imp_board" items = "${list}">
		<tr>
			<td>${imp_board.i_id }</td>
			<td><a href="detailAction.importantboard?i_id=${imp_board.i_id }">${imp_board.i_title }</a></td>
			<td>${imp_board.i_emp_id}</td>			
			<td>${imp_board.i_date }</td>			
			<td>${imp_board.i_hit }</td>			
		</tr>
		</c:forEach>
	</table>
	
	<a href="Imp_insertForm.jsp">글쓰기</a>
	<br>
	<br>
	
	<!--  페이징 처리 영역  -->
	
	<!-- [이전] 버튼 만들기 -->
	<c:if test="${imp_listModel.imp_startPage > 5}">
		<a href="listAction.importantboard?pageNum=${imp_listModel.imp_startPage - 5}">[이전]</a>
	</c:if>
	
	<!-- [1][2][3] 버튼 만들기  -->
	<c:forEach var="pageNo" begin="${imp_listModel.imp_startPage}" end="${imp_listModel.imp_endPage}">
		<c:if test="${imp_listModel.imp_requestPage == pageNo }">
		<b>
		</c:if>
		
		<a href="listAction.importantboard?pageNum=${pageNo }">[${pageNo }]</a>
		
		<c:if test="${imp_listModel.imp_requestPage == pageNo }">
		</b>
		</c:if>
	</c:forEach>
	
	<!-- [이후] 버튼 만들기 -->
	<c:if test="${imp_listModel.imp_endPage < imp_listModel.imp_totalPageCount}">
		<a href="listAction.importantboard?pageNum=${imp_listModel.imp_startPage + 5}">[이후]</a>
	</c:if>


	<form action="listAction.importantboard" method ="post">
		<input type = "hidden" name="temp" value = "temp"></input>
		<input type = "checkbox" name = "area" value = "i_title">제목</input>
		<input type = "checkbox" name = "area" value = "i_content">내용</input>
		<input type = "text" name = "searchKey" size = "10"></input>
		<input type = "submit" value = "검색">
	</form>
</body>
</html>
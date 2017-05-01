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
	<form action="listAction.importantboard" method ="post">
		<input type = "hidden" name="temp" value = "temp"></input>
		<input type = "checkbox" name = "area" value = "i_title">제목</input>
		<input type = "checkbox" name = "area" value = "i_content">내용</input>
		<input type = "text" name = "searchKey" size = "10"></input>
		<input type = "submit" value = "검색">
	</form>
</body>
</html>
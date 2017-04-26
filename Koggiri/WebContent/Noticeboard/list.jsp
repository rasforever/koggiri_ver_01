
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
	<br>
	
	<form action="listAction.do" method ="post">
		<input type = "checkbox" name = "area" value = "n_title">제목</input>
		<input type = "checkbox" name = "area" value = "n_emp_id">작성자</input>
		<input type = "text" name = "searchkey" size = "10"></input>
		<input type = "submit" value = "검색">
	
	</form>
</body>
</html>















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
			<th>금주업무실적</th>			
			<th>차주업무계획</th>			
			<th>작성일자</th>			
			<th>조회수</th>			
		</tr>
			<c:forEach var = "task" items = "${list}">
		<tr>
		<td>${task.ta_seq}</td>
		<td>${task.ta_weekresult}</td>
		<td>${task.ta_nextresult}</td>
		<td>${task.ta_regdate}</td>
		<td>${task.ta_hitcount}</td>
		</tr>
		</c:forEach>
			</table>
	<br>
</body>
</html>
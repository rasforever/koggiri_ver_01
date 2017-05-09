<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../style/task.css">
<title>Insert title here</title>
</head>
<body>
<h3>상세보기</h3>
	<table border="1" id="task_table02">
	     <tr>
			<td >작성일</td>
			<td><fmt:formatDate value= "${task.ta_regdate}"/></td>
			<td>글번호</td>
			<td>${task.ta_seq }</td>
		</tr>

		<tr>
			<td>업무기간</td>
			<td colspan="3">${task.ta_date}</td>
		</tr>
		<tr>
		    <td>주간업무일지</td>
			<td colspan="3">${task.ta_weekresult}</td>
		<tr>
		     <td>차주업무계획</td>	
			<td colspan="3">${task.ta_nextresult}</td>
		</tr>
				<a href="ta_updateformAction.task?ta_seq=${task.ta_seq}">수정</a>
				<a href="ta_deleteAction.task?ta_seq=${task.ta_seq}">삭제</a>
	</table>
</body>
</html>
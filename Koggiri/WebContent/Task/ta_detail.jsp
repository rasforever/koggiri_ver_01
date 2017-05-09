<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상세보기</h3>
	<table border="1">
	     <tr height="30">
			<td width="150">작성일</td>
			<td colspan="3"><fmt:formatDate value= "${task.ta_regdate}"/></td>
		</tr>
		<tr height="30">
			<td width="150">글번호</td>
			<td width="150">${task.ta_seq }</td>
			<td width="150">조회수</td>
			<td width="150">${task.ta_hitcount}</td>
		</tr>

		<tr height="30">
			<td width="150">업무기간</td>
			<td colspan="3">${task.ta_date}</td>
		</tr>
		<tr height="30">
		    <td width="150">주간업무일지</td>
			<td colspan="4">${task.ta_weekresult}</td>
		<tr height="30">
		     <td width="150">차주업무계획</td>	
			<td colspan="4">${task.ta_nextresult}</td>
		</tr>
		
		<tr height="30">
			<td colspan="4">
			
				<a href="ta_updateformAction.task?ta_seq=${task.ta_seq}">수정</a>
				<a href="ta_deleteAction.task?ta_seq=${task.ta_seq}">삭제</a>
		</tr>
		
		

	</table>
</body>
</html>
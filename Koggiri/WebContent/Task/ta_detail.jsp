<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../style/task.css">
<link rel="stylesheet" type="text/css" href="../style/board.css">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<div id="main_header"><jsp:include page="../Main/header.jsp" /></div>
<br><br><br><br>
<div id="detail">
<h3>Task</h3>
<br><br><hr><br>
	<table id="task_table02">
	     <tr>
			<th width="100">작성일</th>
			<td width="800"><fmt:formatDate value= "${task.ta_regdate}"/></td>
			<th width="100">글번호</th>
			<td>${task.ta_seq }</td>
		</tr>

		<tr>
			<th>업무기간</th>
			<td colspan="3">${task.ta_date}</td>
		</tr>
		<tr>
		    <th>주간업무일지</th>
			<td colspan="3" class="detail_td">${task.ta_weekresult}</td>
		<tr>
		     <th>차주업무계획</th>	
			<td colspan="3" class="detail_td">${task.ta_nextresult}</td>
		</tr>
			</table>
			<br><br>
			<div align="right">
				<a class="detail_btn" href="ta_updateformAction.task?ta_seq=${task.ta_seq}">수정</a>
				<a class="detail_btn" href="ta_deleteAction.task?ta_seq=${task.ta_seq}">삭제</a>
			</div>
			</div>
			</div><br><br><br><br><br>
						<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
</body>
</html>
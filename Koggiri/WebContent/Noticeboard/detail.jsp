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
			<td width="150">글번호</td>
			<td width="150">${board.n_id }</td>
			<td width="150">조회수</td>
			<td width="150">${board.n_hit }</td>
		</tr>
		<tr height="30">
			<td width="150">작성자</td>
			<td width="150">${board.n_emp_id }</td>
			<td width="150">작성일</td>
			<td width="150"><fmt:formatDate value= "${board.n_date }"/></td>
		</tr>

		<tr height="30">
			<td width="150">제목</td>
			<td colspan="3">${board.n_title }</td>
		</tr>
		<tr height="30">
			<td colspan="4">${board.n_content }</td>
		</tr>
		
		<tr height="30">
			<td colspan="4">
			
				<a href="updateFormAction.noticeboard?n_id=${board.n_id} ">수정</a>
				<a href="deleteAction.noticeboard?n_id=${board.n_id} ">삭제</a>
		</tr>
		
		

	</table>
</body>
</html>









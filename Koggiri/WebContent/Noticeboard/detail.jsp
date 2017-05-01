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
<div align="center">
<div class="detail" align="center">
	<h3>상세보기</h3>
	<div>
	<table  id="detail_tb">
		<tr>
			<th width="50">글번호</th>
			<td width="500">${board.n_id }</td>
			<th width="50">조회수</th>
			<td width="50">${board.n_hit }</td>
		<tr>
			<th width="50">작성자</th>
			<td width="500">${board.n_emp_id }</td>
			<th width="50">작성일</th>
			<td width="80"><fmt:formatDate value= "${board.n_date }"/></td>
		</tr>
		<tr>
			<th width="50">제목</th>
			<td width="500" colspan="3">${board.n_title }</td>
		</tr>

		<tr>
		
			<td colspan="4"><hr>내용 : ${board.n_content }<hr></td>
		</tr>
	</table>
		</div>
					<a href="listAction.noticeboard">목록</a>
				<a href="updateFormAction.noticeboard?n_id=${board.n_id} ">수정</a>
				<a href="deleteAction.noticeboard?n_id=${board.n_id} ">삭제</a>

	</div>
	</div>
</body>
</html>









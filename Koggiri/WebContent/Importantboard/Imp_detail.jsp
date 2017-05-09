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
<div id="main_header" align="center">
				<jsp:include page="../Main/header.jsp" />
			</div>
			<br><br><br><br>
<div class="detail" align="center">
	<h3>Important</h3>
	<br><br>
	<hr><br>
	<div>
		<table id="detail_tb">
		<tr>
			<th width="50">글번호</th>
			<td width="500">&nbsp;&nbsp;${imp_board.i_id }</td>
			<th width="50">조회수</th>
			<td width="50">&nbsp;&nbsp;${imp_board.i_hit }</td>
		</tr>
		<tr>
			<th width="50">작성자</th>
			<td width="500">&nbsp;&nbsp;${imp_board.i_emp_nm }</td>
			<th width="50">작성일</th>
			<td width="80">&nbsp;&nbsp;<fmt:formatDate value= "${imp_board.i_date }"/></td>
		</tr>

		<tr>
			<th  width="50"  class="bt">제목</th>
			<td width="500" colspan="3" class="bt">&nbsp;&nbsp;${imp_board.i_title }</td>
		</tr>
		
		<tr>
			<td colspan="4" height="400" class="bt">${imp_board.i_content }</td>
		</tr>
	</table>
	</div>
	<br><br>
	<div id="rud" align="left">
				<a href="listAction.importantboard">목록</a>
				<a href="updateFormAction.importantboard?i_id=${imp_board.i_id}">수정</a>
				<a href="deleteAction.importantboard?i_id=${imp_board.i_id}">삭제</a>
</div>
</div>
<br><br><br><br>
						<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
			</div>
		

</div>
</body>
</html>









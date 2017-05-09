<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%><!--커스텀 태그는 반드시 선언해줘야함  -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/document.css">
<link type="text/css" rel="stylesheet" href="../style/board.css">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div id="main_header" align="center">
		<jsp:include page="../Main/header.jsp" />
	</div>
	<br><br><br><br>
	<div id="doc_detail">
	<h3 align="cneter">Document</h3>
	<br><br><hr><br>
	<table id="document_table02">
		<tr>
			<th>글번호</th>
			<td width="720">${doc_board.f_id }</td>
			<th>작성일</th>
			<td ><fmt:formatDate value="${doc_board.f_date}"
					pattern="yyyy/MM/dd/ hh:mm" /></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td colspan="3">${doc_board.f_emp_nm }</td>
			
		</tr>
		<tr >
			<th>파일</th>
			<td colspan="3"><a
				href="Doc_download.jsp?filename=${doc_board.f_fname }">${doc_board.f_fname }</a>
			</td>
		</tr>
		<tr >
			<th>제목</th>
			<td colspan="3">${doc_board.f_title }</td>
		</tr>
		<tr >
		<th>내용</th>
			<td colspan="3"  height="400" id="detail_td">${doc_board.f_content }</td>
		</tr>
	
	</table>
	<br><br>
	<div id="doc_btn" align="right">
		<a href="listAction.document">목록</a> 
		<a href="updateFormAction.document?f_id=${doc_board.f_id }">수정</a>
		<a href="deleteAction.document?f_id=${doc_board.f_id }">삭제</a>
		</div>
</div>
</div>
<br><br><br><br><br><br>
<div id="main_footer">
		<jsp:include page="../Main/footer.jsp" />
	</div>
</body>
</html>
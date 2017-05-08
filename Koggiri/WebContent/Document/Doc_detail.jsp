<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><!--커스텀 태그는 반드시 선언해줘야함  -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>문서함세부보기</h3>
	<table border="1">
		<tr height="30">
			<td width="150">글번호</td>
			<td width="150">${doc_board.f_id }</td>
		</tr>
		<tr height="30">
			<td width="150">작성자</td>
			<td width="150">${doc_board.f_name }</td>
			<td width="150">작성일</td>
			<td width="150">
				<fmt:formatDate value="${doc_board.f_date}" pattern="yyyy-MM-dd"/>
			</td>
		</tr>			
		<tr height="30">
			<td width="150">파일</td>
			<td colspan="3">
				<a href="Doc_download.jsp?filename=${doc_board.f_fname }">${doc_board.f_fname }</a>
			</td>			
		</tr>
		<tr height="30">
			<td width="150">제목</td>
			<td colspan="3">${doc_board.f_title }</td>			
		</tr>
		<tr height="30">			
			<td colspan="4">${doc_board.f_content }</td>			
		</tr>
		<tr height="30">
					
			<td colspan="4">
				<a href="updateFormAction.document?f_id=${doc_board.f_id }">수정</a>
				<a href="Doc_list.jsp">취소</a>
			</td>	
			
			
				
					
		</tr>
	</table>



</body>
</html>
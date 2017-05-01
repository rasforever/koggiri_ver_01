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
	<h3>상세보기</h3>
	<table >
		<tr>
			<th width="50">문서번호</th>
			<td width="500">${approvaldetail.app_id }</td>
			<th width="50">문서타입</th>
			<td width="50">${approvaldetail.app_type_nm }</td>
		</tr>
		<tr>
			<th width="50">부서명</th>
			<td width="500">${approvaldetail.dept_nm }</td>
			<th width="50">진행상태</th>
			<td width="50">${approvaldetail.app_pro_nm }</td>
		</tr>
		<tr>
			<th width="50">기안자</th>
			<td width="500">${approvaldetail.draft_emp_nm }</td>
			<th width="50">결재자</th>
			<td width="50">${approvaldetail.app_emp_nm }</td>
		</tr>
		<tr>
			<th width="50">기안일</th>
			<td width="500">${approvaldetail.draft_dt }</td>
			<th width="50">결재일</th>
			<td width="50">${approvaldetail.app_dt }</td>
		</tr>
		<tr>
			<th width="50">제목</th>
			<td width="500" colspan="3">${approvaldetail.app_title }</td>
		</tr>
		<tr>		
			<td colspan="4"><hr>내용 : ${approvaldetail.app_context }<hr></td>
		</tr>
	</table>
				<a href="approval_list_r.approval?type=0">목록</a>
				<a href="approval_updateFormAction.approval?app_id=${approvaldetail.app_id} ">수정</a>
				<a href="approval_deleteAction.approval?app_id=${approvaldetail.app_id} ">삭제</a>


</body>
</html>



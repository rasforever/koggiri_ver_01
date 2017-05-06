<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String type_cd = request.getParameter("type_cd");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/board.css">

<title>Insert title here</title>

</head>
<body>

		<input type="hidden" name="emp_id" value="k15010201">
	<h3>상세보기</h3>
	<table>
		<tr>
			<th width="50">문서번호</th>
			<td width="500">${approval.app_id }</td>
			<th width="50">문서타입</th>
			<td width="50">${approval.app_type_nm }</td>
		</tr>
		<tr>
			<th width="50">부서명</th>
			<td width="500">${approval.dept_nm }</td>
			<th width="50">진행상태</th>
			<td width="50">${approval.app_pro_nm }</td>
		</tr>
		<tr>
			<th width="50">기안자</th>
			<td width="500">${approval.draft_emp_nm }</td>
			<th width="50">결재자</th>
			<td width="50">${approval.app_emp_nm }</td>
		</tr>
		<tr>
			<th width="50">기안일</th>
			<td width="500">${approval.draft_dt }</td>
			<th width="50">결재일</th>
			<td width="50">${approval.app_dt }</td>
		</tr>
		<tr>
			<th width="50">제목</th>
			<td width="500" colspan="3">${approval.app_title }</td>
		</tr>
		<tr>
			<td colspan="4"><hr>내용 : ${approval.app_context }
				<hr></td>
		</tr>

	</table>


	<%
		if (type_cd.equals("rw")) {
	%>

	<a
		href="approval_updateAction_App.approval?app_id=${approval.app_id}&app_pro_cd=2&app_emp_id=${approval.app_emp_id } ">승인</a>&nbsp;&nbsp;
	<a
		href="approval_updateAction_App.approval?app_id=${approval.app_id}&app_pro_cd=3&app_emp_id=${approval.app_emp_id }  ">부결</a>&nbsp;&nbsp;
	<a
		href="approval_updateAction_App.approval?app_id=${approval.app_id}&app_pro_cd=4&app_emp_id=${approval.app_emp_id }  ">반려</a>
	<br>
	<br>
	<%
		}
	%>
	<a href="approval_list_s.approval?type=0">목록</a>&nbsp;&nbsp;
	<%
		if (type_cd.equals("sp")) {
	%>
	<a href="approval_updateForm.approval?app_id=${approval.app_id} ">수정</a>&nbsp;&nbsp;
	<a href="approval_deleteAction.approval?app_id=${approval.app_id} ">삭제</a>
	<%
		}
	%>

</body>
</html>



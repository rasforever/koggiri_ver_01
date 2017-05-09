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
<link type="text/css" rel="stylesheet" href="../style/approval.css">

<title>Insert title here</title>

</head>
<body>
<div align="center">
<div id="main_header"><jsp:include page="../Main/header.jsp" /></div>
	<br><br><br><br>
	<div id="app_contain" align="center"> 
		<input type="hidden" name="emp_id" value="k15010201">
	<h3 align="center">상세보기</h3>
	<br><br>
	<table id="app_table03">
		<tr>
			<th>문서번호</th>
			<td width="700px">${approval.app_id }</td>
			<th>문서타입</th>
			<td>${approval.app_type_nm }</td>
		</tr>
		<tr>
			<th>부서명</th>
			<td >${approval.dept_nm }</td>
			<th>진행상태</th>
			<td>${approval.app_pro_nm }</td>
		</tr>
		<tr>
			<th>기안자</th>
			<td >${approval.draft_emp_nm }</td>
			<th>결재자</th>
			<td>${approval.app_emp_nm }</td>
		</tr>
		<tr>
			<th>기안일</th>
			<td>${approval.draft_dt }</td>
			<th>결재일</th>
			<td >${approval.app_dt }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3">${approval.app_title }</td>
		</tr>
		<tr>
			<td colspan="4"><hr>내용 : ${approval.app_context }
				<hr></td>
		</tr>

	</table>
<br>
</div>

	<%
		if (type_cd.equals("rw")) {
	%>

	<a class="bottom_app" href="approval_updateAction_App.approval?app_id=${approval.app_id}&app_pro_cd=2&app_emp_id=${approval.app_emp_id } ">승인</a>&nbsp;&nbsp;
	<a class="bottom_app" href="approval_updateAction_App.approval?app_id=${approval.app_id}&app_pro_cd=3&app_emp_id=${approval.app_emp_id }  ">부결</a>&nbsp;&nbsp;
	<a class="bottom_app" href="approval_updateAction_App.approval?app_id=${approval.app_id}&app_pro_cd=4&app_emp_id=${approval.app_emp_id }  ">반려</a>
	<br>
	<br>
	<%
		}
	%>
	<a class="bottom_app" href="approval_list_s.approval?type=0">목록</a>
	<%
		if (type_cd.equals("sp")) {
	%>
	<a class="bottom_app" href="approval_updateForm.approval?app_id=${approval.app_id} ">수정</a>&nbsp;&nbsp;
	<a class="bottom_app" href="approval_deleteAction.approval?app_id=${approval.app_id} ">삭제</a>
	<%
		}
	%>

	<br><br><br><br><br><br>
	<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
			</div>
</body>
</html>



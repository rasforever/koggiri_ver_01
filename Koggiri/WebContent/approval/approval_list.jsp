
<%@page import="java.util.function.Function"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/approval.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<%
	String type = request.getParameter("type");
	String type_cd = request.getParameter("type_cd");
	String type_nm = "";
	if (type != null){
		if (type.equals("1")){
			type_nm = "R";
		} else {
			type_nm = "S";
		}
	}
	
%>
<link rel="stylesheet" href="jquery.tabs.css" type="text/css" media="print, projection, screen">
<script type="text/javascript" src="script/approval.js"></script>
<script type="text/javascript">

$(function (){
	if (<%=type%> == 1){
		$('#r_approval').show();
		$('#s_approval').hide();		
	} else {		
		$('#r_approval').hide();
		$('#s_approval').show();
	}
});
function rs_type(obj) {
	if (obj == 1){
		$('#r_approval').show();
		$('#s_approval').hide();
	} else {
		$('#r_approval').hide();
		$('#s_approval').show();
	}
}


</script>
</head>
<body>
	<ul>
		<li><a href="#" onclick="rs_type(0)">내가 보낸 결재</a></li>
		<li><a href="#" onclick="rs_type(1)">내가 받은 결재</a></li>
	</ul>
	<form action="approval_list_s.approval" method="post">
		<div id="s_approval">
			<input type="button" id="s_approval_all" name="s_approval_all" value="전체" onclick="approval_type('s')"> 
			<input type="button" id="s_approval_p" name="s_approval_p" value="진행중결재" onclick="approval_type('sp')"> 
			<input type="button" id="s_approval_e" name="s_approval_e" value="완료결재" onclick="approval_type('se')"> 
			<input type="button" id="s_approval_c" name="s_approval_c" value="부결/반려결재"  onclick="approval_type('sc')">
			<input type="button" id="s_approval_t" name="s_approval_t" value="임시저장결재" onclick="approval_type('st')">
		</div>
		<div id ="r_approval">			
			<input type="button" id="r_approval_all" name="r_approval_all" value="전체" onclick="approval_type('r')"> 
			<input type="button" id="r_approval_w" name="r_approval_w" value="결재대기중" onclick="approval_type('rw')"> 
			<input type="button" id="r_approval_p" name="r_approval_p" value="결재진행중" onclick="approval_type('rp')"> 
			<input type="button" id="r_approval_c" name="r_approval_e" value="결재완료" onclick="approval_type('re')">
			<input type="button" id="r_approval_r" name="r_approval_c" value="결재부결/반려" onclick="approval_type('rc')">	
		</div>
		
	</form>
	<table border=1>
		<thead>
			<tr>
				<th>결재문서번호</th>
				<th>제안일</th>
				<th>결재구분</th>
				<th>관리부서</th>
				<th>기안자</th>
				<th>결재자</th>
				<th>진행상태</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var = "approval" items = "${approvallist }">
				<tr>
					<input type="hidden" name="draft_emp_id" value="${approval.draft_emp_id }">
					<input type="hidden" name="app_emp_id" value="${approval.app_emp_id }">
					<td><a href="approval_detail<%=type_nm %>Action.approval?app_id=${approval.app_id }&type_nm=<%=type_nm %>&type_cd=<%=type_cd %>">${approval.app_id }</a></td>
					<td><a href='approval_detail<%=type_nm %>Action.approval?app_id=${approval.app_id }&type_nm=<%=type_nm %>&type_cd=<%=type_cd %>'>${approval.draft_dt }</a></td>
					<td><a href='approval_detail<%=type_nm %>Action.approval?app_id=${approval.app_id }&type_nm=<%=type_nm %>&type_cd=<%=type_cd %>'>${approval.app_type_nm }</a></td>
					<td><a href='approval_detail<%=type_nm %>Action.approval?app_id=${approval.app_id }&type_nm=<%=type_nm %>&type_cd=<%=type_cd %>'>${approval.dept_nm }</a></td>
					<td><a href='approval_detail<%=type_nm %>Action.approval?app_id=${approval.app_id }&type_nm=<%=type_nm %>&type_cd=<%=type_cd %>'>${approval.draft_emp_nm }</a></td>
					<td><a href='approval_detail<%=type_nm %>Action.approval?app_id=${approval.app_id }&type_nm=<%=type_nm %>&type_cd=<%=type_cd %>'>${approval.app_emp_nm }</a></td>
					<td><a href='approval_detail<%=type_nm %>Action.approval?app_id=${approval.app_id }&type_nm=<%=type_nm %>&type_cd=<%=type_cd %>'>${approval.app_pro_nm }</a></td>				
				</tr>
		</c:forEach>
		</tbody>		
	</table>
	<div id="bottom">
			<!--페이징 처리할 곳 -->
			<!-- 1.한 페이지당 글의 갯수  2.전체 총 글의 갯수  3.시작페이지  4.마지막페이지  -->
			<!-- 현재페이지, start_row, end_row  -->

			<!--[이전] 버튼 만들기!  -->
			<c:if test="${approval_List.startPage > 5}">
				<a href="approval_list_<%=type_cd %>.approval?pageNum=${approval_List.startPage - 5 }">[이전]</a>
			</c:if>
			<!-- 페이지 목록  -->
			<c:forEach var="pageNo" begin="${approval_List.startPage}"
				end="${approval_List.endPage}">
				<c:if test="${approval_List.requestPage == pageNo }">
					<b>
				</c:if>
				<!-- <b>태그는 글씨를 두껍게 해주는 태그 -->
				<a href="approval_list_<%=type_cd %>.approval?pageNum=${ pageNo}">[${pageNo}]</a>
				<c:if test="${approval_List.requestPage == pageNo }">
					</b>
				</c:if>
			</c:forEach>
			<!-- [이후] 버튼 만들기!  -->
			<c:if test="${approval_List.endPage < approval_List.totalPageCount}">
				<a href="approval_list_<%=type_cd %>.approval?pageNum=${approval_List.startPage + 5 }">[이후]</a>
			</c:if>
		</div>
		<!-- bottom div -->
</body>
</html>















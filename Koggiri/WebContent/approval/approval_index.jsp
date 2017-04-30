
<%@page import="java.util.function.Function"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<% 
	String rs_type="0";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/approval.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>

<link rel="stylesheet" href="jquery.tabs.css" type="text/css" media="print, projection, screen">
<script type="text/javascript">
$(function (){
	$('#r_approval').show();
	$('#s_approval').hide();
});
function rs_type(obj) {
	if (obj == 0){
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
		<li><a href="#" onclick="rs_type(0)">내가 받은 결재</a></li>
		<li><a href="#" onclick="rs_type(1)">내가 보낸 결재</a></li>
	</ul>
	<form action="test.approval" method="post">
		<div id ="r_approval">
			<input type="button" id="r_approval_w" name="r_approval_w" value="결재대기중" onclick="approval_type('rw')"> 
			<input type="button" id="r_approval_p" name="r_approval_p" value="결재진행중" onclick="approval_type('rp')"> 
			<input type="button" id="r_approval_c" name="r_approval_e" value="결재완료" onclick="approval_type('re')">
			<input type="button" id="r_approval_r" name="r_approval_c" value="결재부결/반려" onclick="approval_type('rc')">	
		</div>
		<div id="s_approval">
			<input type="button" id="s_approval_p" name="s_approval_p" value="진행중결재" onclick="approval_type('sp')"> 
			<input type="button" id="s_approval_e" name="s_approval_e" value="완료결재" onclick="approval_type('se')"> 
			<input type="button" id="s_approval_c" name="s_approval_c" value="부결/반려결재"  onclick="approval_type('sc')">
			<input type="button" id="s_approval_t" name="s_approval_t" value="임시저장결재" onclick="approval_type('st')">
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
		<c:forEach var = "approval_list" items = "${list }">
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>				
			</tr>
		</c:forEach>
		</tbody>
	</table>

</body>
</html>















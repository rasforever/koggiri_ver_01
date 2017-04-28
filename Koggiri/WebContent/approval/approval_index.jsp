
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
<%
%>
</head>
<body>
	<ul>
		<li><a href=# onclick="">내가 받은 결재</a></li>
		<li><a href=# onclick="">내가 보낸 결재</a></li>
	</ul>
	<form action="test.approval" method="post">
	<%if %>
		<input type="button" id="r_approval_w" name="r_approval_w" value="결재대기중"> 
		<input type="button" id="r_approval_p" name="r_approval_p" value="결재진행중"> 
		<input type="button" id="r_approval_c" name="r_approval_e" value="결재완료">
		<input type="button" id="r_approval_r" name="r_approval_c" value="결재부결/반려">		
	<%}else{ %>	
		<input type="button" id="s_approval_p" name="s_approval_p" value="진행중결재"   > 
		<input type="button" id="s_approval_e" name="s_approval_e" value="완료결재" > 
		<input type="button" id="s_approval_c" name="s_approval_c" value="부결/반려결재" >
		<input type="button" id="s_approval_t" name="s_approval_t" value="임시저장결재" >
	<%} %>
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
	</table>

</body>
</html>















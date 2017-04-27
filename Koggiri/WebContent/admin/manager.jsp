<%@page import="koggiri.admin_emp.model.Search"%>
<%@page import="koggiri.admin_emp.model.SearchedEmp"%>
<%@page import="java.util.List"%>
<%@page import="koggiri.admin_emp.model.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script type="text/javascript">
$(function(){ 
	$("#join").click(function(){
		$.ajax({ type: 'get' ,
				url: 'joinus.jsp' ,
				dataType : 'text' ,
				success: function(data) {
					$("#joindiv").html(data).toggle(); 
					} 
				});
			})	
})



</script>

</head>
<body>
	<form action="searchEmp.admin" method="post">
	<select name="area">
    <option value="">검색옵션</option>
    <option value="emp_id">사번</option>
    <option value="emp_nm">이름</option>
    <option value="dept_nm">부서</option>
    <option value="pos_nm">직급</option>
	</select>
	<input type="text" name="searchKey">
	<input type="submit" value="검색"	>
	</form>
	
	<input type="button" id="join" value="입사발령"/>

	<table border="1">
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>부서</th>
			<th>직급</th>
		</tr>  <!-- 밑에는 내용 뿌려줄것 -->
		<c:forEach var = "SearchedEmp" items = "${list }">
		<tr>
			<td>${SearchedEmp.emp_id }</td>
			<td>${SearchedEmp.emp_nm }</td>
			<td>${SearchedEmp.dept_nm }</td>			
			<td>${SearchedEmp.pos_nm }</td>						
		</tr>
		</c:forEach>
	</table>
	
	<div id="joindiv"></div>
</body>

</html>
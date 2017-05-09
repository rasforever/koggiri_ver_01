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
<link rel="stylesheet" href="../style/manager.css">
<script type="text/javascript">
$(document).ready(function() {
	$("#join").click(function(){
		$.ajax({ type: 'get' ,
				url: 'joinus.jsp' ,
				dataType : 'text' ,
				success: function(data) {
					
					if($("#joindiv").children().length==0){
					$("#joindiv").html(data);
					}else if($("#joindiv").children().length>0){
						$("#joindiv").empty();
					}
					
					} 
				});
			});
	
	$("#temp").click(function(){
		$.ajax({ type: 'get' ,
				url: 'temppass.jsp' ,
				dataType : 'text' ,
				success: function(data) {
					
					if($("#joindiv").children().length==0){
					$("#joindiv").html(data);
					}else if($("#joindiv").children().length>0){
						$("#joindiv").empty();
					}
					
					} 
				});
			});
	
})




</script>

</head>
<body>
	<div align="center">
	<div id="haeder">
	<jsp:include page="../Main/header.jsp"></jsp:include>
	</div>
	<br><br><br><br><br>
	<div id="manager" align="left">

	<form action="searchEmp.admin" method="post">
	<select name="area">
    <option value="">검색옵션</option>
    <option value="emp_id">사번</option>
    <option value="emp_nm">이름</option>
    <option value="dept_nm">부서</option>
    <option value="pos_nm">직급</option>
	</select>
	<input type="text" name="searchKey" size="30px">
	<input type="submit" value="검색" id="manager_search_btn">
	
	</form>
	
	<input type="button" id="join" value="입사발령"/>
	
	<input type="button" id="temp" value="임시비밀번호 부여"/>
	<table id="manager_table" >
		<tr >
			<th>사번</th>
			<th>이름</th>
			<th>부서</th>
			<th>직급</th>
		</tr>  <!-- 밑에는 내용 뿌려줄것 -->
		
		<c:forEach var = "SearchedEmp" items = "${list }">
		<tr align="center">
			<td>${SearchedEmp.emp_id }</td>
			<td>${SearchedEmp.emp_nm }</td>
			<td>${SearchedEmp.dept_nm }</td>			
			<td>${SearchedEmp.pos_nm }</td>						
		</tr>
		</c:forEach>
	</table>
	</div>
	<div id="joindiv">
	<c:if test="${mem_pw!=null }">
	<br>사번 '${id }' 님의 임시비밀번호는 '${mem_pw }' 로 부여 되었습니다.
	</c:if>
	</div>

	<br><br><br>
	<div id="footer">
	<jsp:include page="../Main/footer.jsp"></jsp:include>
	</div>
	</div>
</body>

</html>
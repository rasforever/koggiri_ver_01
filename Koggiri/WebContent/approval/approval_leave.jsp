<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script type="text/javascript" src="script/approval.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="leaveAction.approval" method="post">
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input type="text" name="emp_id" value="${einfo.emp_id }" disabled>&nbsp;&nbsp;&nbsp; 
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input type="text" name="emp_nm" value="${einfo.emp_nm }" disabled> <br>
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input type="text" name="dept_nm" value="${einfo.dept_nm }" disabled>&nbsp;&nbsp;&nbsp; 
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input type="text" name="pos_nm" value="${einfo.pos_nm }" disabled> <br>
		��&nbsp;��&nbsp;�� : <input type="text" name="leave_st_dt" class="datepicker">~<input type="text" name="leave_ed_dt" class="datepicker"><br>
		�ް����� :<select name ="leave_t_cd">
		<c:forEach var="leavetype" items="${leavelist}"> 
			<option  value="${leavetype.leave_t_cd}">${leavetype.leave_t_nm} </option>
		</c:forEach></select>
		��󿬶��� : <input type="text" name = "leave_tel"><br>
	 	�ް����� : <br>
	 	<textarea rows="20" cols="100" name = "leave_content"></textarea>
		<br>
		<input type="submit" value="���">
	</form>

</body>
</html>
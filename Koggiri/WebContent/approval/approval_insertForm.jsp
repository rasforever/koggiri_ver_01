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
<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="approval_insertAction.approval" method="post">
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input type="text" name="emp_id" value="${einfo.emp_id }" disabled>&nbsp;&nbsp;&nbsp; 
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input type="text" name="emp_nm" value="${einfo.emp_nm }" disabled> <br>
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input type="text" name="dept_nm" value="${einfo.dept_nm }" disabled>&nbsp;&nbsp;&nbsp; 
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input type="text" name="pos_nm" value="${einfo.pos_nm }" disabled> <br>
		��&nbsp;��&nbsp;�� : <input type="text" name="draft_dt" class="datepicker"><br>
		��û���� :  <select name ="app_type" onchange="typesel(this)" > 
		<c:forEach var="apptype" items="${applist}"> 
			<option value="${apptype.app_type_cd}">${apptype.app_type_nm} </option>			
		</c:forEach></select>&nbsp;&nbsp;&nbsp; 
		���� : <input type="text" name = "draft_title"><br>
	 	���� : <br>
	 	<textarea rows="20" cols="100" id="draft_content" name = "draft_content">
	 	</textarea>
	 	<script type="text/javascript">
			 	CKEDITOR.replace( 'draft_content',{
			 	    'filebrowserUploadUrl':'/ckeditor/upload.jsp?'
			 	    +'realUrl=http://www.localhost.com/�������ε�ɵ��丮��'
			 	    +'&realDir=�������ε�ɵ��丮��'
			 	});
        </script>
		<br>
		<input type="submit" value="���">
	</form>

</body>
</html>
<%@page import="koggiri.approval.model.AppType"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="script/approval.js"></script>

</head>
<body>
	<form action="approval_updateAction.approval" method="post">

		<input type="hidden" name="dept_id" value="${einfo.dept_id }">
		<input type="hidden" name="emp_id" value="k15010201">
		<input type="hidden" name="app_id" value="${approval.app_id }">

		사&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;번 : <input
			type="text" id="draft_emp_id" name="draft_emp_id"
			value="${einfo.emp_id }" disabled>&nbsp;&nbsp;&nbsp;
		이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름 : <input
			type="text" name="draft_emp_nm" value="${einfo.emp_nm }" disabled>
		<br> 소&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;속 : <input
			type="text" name="dept_nm" value="${einfo.dept_nm }" disabled>&nbsp;&nbsp;&nbsp;
		직&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;급 : <input
			type="text" name="pos_nm" value="${einfo.pos_nm }" disabled>
		<br> 기&nbsp;안&nbsp;일 : <input type="text" name="draft_dt"
			class="datepicker" value ="${approval.draft_dt }"><br> 신청종류 :  <input
			type="text" name="app_type_nm" value="${approval.app_type_nm }" disabled>		
		<br>
		결재자 : <input type="text" name="app_emp_id" value="${approval.app_emp_id }"><br>		
		&nbsp;&nbsp;&nbsp; 제목 : <input type="text" name="app_title" value="${approval.app_title }"><br>
		
		<textarea rows="20" cols="100" id="app_context" name="app_context">
		${approval.app_context }
	 	</textarea>
		<script type="text/javascript">
			CKEDITOR.replace('app_context', {
				'filebrowserUploadUrl' : '/ckeditor/upload.jsp?'
					+ 'realUrl=http://www.localhost.com/서버업로드될디렉토리명'
					+ '&realDir=서버업로드될디렉토리명'
			});				
		</script>
			
		<br> <input type="submit" value="수정"><input type="reset"
			value="취소">
		<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
			</div>	
	</form>
</body>
</html>
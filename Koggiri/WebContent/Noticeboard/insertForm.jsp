<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String emp_nm = (String) session.getAttribute("emp_nm");
	System.out.println("get id : " + emp_nm);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/board.css">
<title>Insert title here</title>
</head>
<body>
	<form action="insertAction.noticeboard" method="post">
		<div align="center">
				<jsp:include page="../Main/header.jsp" />
			<br> <br> <br> <br>
			<div class="board" align="center">

					
				<h3 align="center">Notice</h3>
				<br><br>
				<hr>
				<br> <br> 제목 &nbsp;<input type="text" name="n_title"
					size="143"><br><br>
				<input type="hidden" name="n_emp_id" value="<%=emp_nm%>">
				<textarea rows="50" cols="190" name="n_content"></textarea>
				<script type="text/javascript">
					CKEDITOR.replace('n_content', {
						'filebrowserUploadUrl' : '/ckeditor/upload.jsp?'
							+ 'realUrl=http://www.localhost.com/서버업로드될디렉토리명'
							+ '&realDir=서버업로드될디렉토리명'
					});
				</script>
				<br> <br> <input type="submit" value="등록" id="bnt">


			</div>
			<br> <br> <br>
			<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
			</div>
		</div>
	</form>
</body>
</html>
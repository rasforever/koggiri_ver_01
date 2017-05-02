<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
<!-- 추가해준 부분  -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/board.css">
<title>Insert title here</title>
</head>
<body>

	<form action="insertAction.importantboard" method="post">
		<div align="center">
			<jsp:include page="../Main/header.jsp" />
			<br> <br> <br> <br>
			<div class="board" align="center">


				<h3 align="center">Important</h3>
				<br>
				<br>
				<hr>
				<br> <br> 제목 &nbsp;<input type="text" name="i_title"
					size="143"><br>
				<br>
				<textarea rows="50" cols="190" name="i_content"></textarea>

				<script type="text/javascript">	/*추가해준 부분  */
					CKEDITOR.replace('i_content', {
						'filebrowserUploadUrl' : '/ckeditor/upload.jsp?'
							+ 'realUrl=http://www.localhost.com/서버업로드될디렉토리명'
							+ '&realDir=서버업로드될디렉토리명'
					});
				</script>
				<br>
				<br> <input type="submit" value="등록" id="bnt">
			</div>
			<br>
			<br>
			<br>
			<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
			</div>
		</div>

	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/board.css">
<title>Insert title here</title>
</head>
<body>

	<h3 align="center">공지사항 작성</h3>
	<div align="center">
	<form action="insertAction.noticeboard" method="post">
		<div class="board" align="center">
			<br>
			<br>
			제목 &nbsp;&nbsp;<input type="text" name="n_title" size="190">
			<br>
			<br>
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
	</form>
</div>
</body>
</html>
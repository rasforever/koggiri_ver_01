<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>글 작성</h3>
<hr>
<form action="insertAction.noticeboard" method="post">

 	제목 : <input type="text" name = "n_title"><br>
 	내용 : <br>
 	<textarea rows="30" cols="190" name = "n_content"></textarea>
 		 	<script type="text/javascript">
			 	CKEDITOR.replace( 'n_content',{
			 	    'filebrowserUploadUrl':'/ckeditor/upload.jsp?'
			 	    +'realUrl=upload'
			 	    +'&realDir=upload'
			 	});
            </script>
		<br>
	<br>
	<input type="submit" value="등록">

</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="insertAction.document" method="post" enctype="multipart/form-data">

제목 : <input type="text" name="f_title"/><br/>
작성자 : <input type="text" name="f_writer"/><br/>
내용 : <textarea rows="10" cols="20" name="f_content"></textarea>
문서 : <input type="file" name="filename"><br/>
<input type="submit"/>


</form>

</body>
</html>
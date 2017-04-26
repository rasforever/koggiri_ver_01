<%@page import="kosta.model.Board"%>
<%@page import="kosta.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action= "updateAction.do?seq=${board.seq }" method="post">
		제목: <input type="text" name = "title" "><br>
		내용:<br>
		<textarea rows="6" cols="70" name ="contents">
		</textarea>
		
	<br><br>
	<input type="submit" value="수정완료">
	</form>

	
	

</body>
</html>
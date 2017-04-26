<%@page import="java.util.ArrayList"%>
<%@page import="kosta.model.Board"%>
<%@page import="java.util.List"%>
<%@page import="kosta.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
   request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="board" class="kosta.model.Board"></jsp:useBean>
<jsp:setProperty property="*" name="board" />

<%
   BoardDao dao = BoardDao.getInstance();
   dao.insertBoard(board);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <a href="insert_form.jsp">글쓰기</a>
   <a href="list.jsp">글목록</a>
</body>
</html>









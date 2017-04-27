<%@page import="koggiri.task.model.TaskDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="task" class="koggiri.task.model.Task"></jsp:useBean>
<jsp:setProperty property="*" name="task" />

<%
	TaskDao dao = TaskDao.getInstance();
	dao.insertTask(task);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="ta_insertform.jsp">글쓰기</a>
	
	<a href="ta_list.jsp">글목록</a>
</body>
</html>
<%@page import="koggiri.calendar.model.Event"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.json.simple.JSONObject"%>

<%
 	String eventData = request.getParameter("eventData");
	JSONParser parser = new JSONParser();
	Object obj = parser.parse(eventData);
	JSONObject jsonObj = (JSONObject) obj;
	String title = (String) jsonObj.get("title");
	String start = (String) jsonObj.get("start");
	String end = (String) jsonObj.get("end");
	Event event = new Event(title,start,end);
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	
</head>
<body>

</body>
</html>
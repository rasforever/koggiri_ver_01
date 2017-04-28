<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src='lib/jquery.min.js'></script>

<link rel='stylesheet' href='fullcalendar.css' />

<script src='lib/moment.min.js'></script>
<script src='fullcalendar.js'></script>
<script type="text/javascript">
$(document).ready(function() {

    // page is now ready, initialize the calendar...

    $('#calendar').fullCalendar({
        // put your options and callbacks here
        
    })

});
</script>
<style type="text/css">
 
 #calendar{
 	width: 50%;
 	height: 50%;
 }
</style>
</head>
<body>
	<div id='calendar'></div>
</body>
</html>
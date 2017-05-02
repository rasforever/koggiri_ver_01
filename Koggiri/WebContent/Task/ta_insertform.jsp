<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/i18n/datepicker-ko.js"></script>
<link rel="stylesheet"
   href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script type="text/javascript" src="script/task.js"></script> 
<link rel="stylesheet" href="/css/jquery.datetimepicker.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<title>Insert title here</title>
</head>
<body>
오늘 날짜 : <span id="today"></span>
<form action="ta_insertAction.task" method="post">
	<h3>업무등록</h3>
	<hr>
		<div>
		시작일:<input type="text" name="ta_startdate" class="datepicker1" >
		종료일:<input type="text" name="ta_enddate" class="datepicker2">
		</div>
		<div>
		금주업무실적:<br>
		<textarea rows="6" cols="70" name="ta_weekresult"></textarea>
		</div>
		<br>
		<div>
			차주업무계획:<br>
			<textarea rows="6" cols="70" name="ta_nextresult"></textarea>
			</div>
				<br>
				<div>
					<input type="submit" value="등록"> <input type="reset"
						value="취소">
				</div>
</form>
</body>
</html>
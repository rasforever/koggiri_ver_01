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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ta_updateAction.task?ta_seq=${task.ta_seq}" method="post">
		
		<h3>업무수정</h3>
		
		<table border="1" cellpadding="0" cellspacing="0">
		<tr height="30">
			<td width="80">업무기간</td>
			<td width="170">
				<input type="text" name="ta_date" class="week-picker" value="${task.ta_date}">
			</td>			
		</tr>
		
		<tr height="30">
			<td width="80">금주업무실적</td>
			<td width="170">
				<textarea rows="6" cols="70" name="ta_weekresult"></textarea>
			</td>			
		</tr>
		
		<tr height="30">
			<td width="80">차주업무계획</td>
			<td width="170">
				<textarea rows="6" cols="70" name="ta_nextresult"></textarea>
			</td>			
		</tr>
		<tr height="30">			
			<td colspan="4" align="center">
				<input type="submit" value="수정완료">&nbsp;&nbsp;
				<input type="reset" value="취소">
			</td>			
		</tr>
	</table>	
	</form>

</body>
</html>
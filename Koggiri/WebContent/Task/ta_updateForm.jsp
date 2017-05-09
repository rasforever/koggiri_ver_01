<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="jquery.js"></script>
<script type="text/javascript" src="jquery-ui.min.js"></script>
<link rel="stylesheet" type="text/css" media="screen"
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/themes/base/jquery-ui.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="../jquery-ui-1.8.14/themes/base/jquery-ui.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="../style/task.css">
		<link rel="stylesheet" type="text/css" href="../style/board.css">
<script type="text/javascript">
	$(function() {
		var startDate;
		var endDate;

		$('.week-picker').datepicker({
			changeMonth:true,
			changeYear:true,
			showOtherMonths : true,
			selectOtherMonths : true,
			selectWeek : true,
			onSelect : function(dateText, inst) {
				var date = $(this).datepicker('getDate');
				startDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() - date.getDay() + 1);
				endDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() - date.getDay() + 5);
				var dateFormat = 'yy/mm/dd'
				startDate = $.datepicker.formatDate(dateFormat, startDate, inst.settings);
				endDate = $.datepicker.formatDate(dateFormat, endDate, inst.settings);

				$('.week-picker').val(startDate + '~' + endDate);

				setTimeout("applyWeeklyHighlight()", 100);
			},
			beforeShow : function() {
				setTimeout("applyWeeklyHighlight()", 100);
			}
		});
	});

	function applyWeeklyHighlight() {
		$('.ui-datepicker-calendar tr').each(function() {

			if ($(this).parent().get(0).tagName == 'TBODY') {
				$(this).mouseover(function() {
					$(this).find('a').css({
						'background' : '#ffffcc',
						'border' : '1px solid #dddddd'
					});
					$(this).find('a').removeClass('ui-state-default');
					$(this).css('background', '#ffffcc');
				});

				$(this).mouseout(function() {
					$(this).css('background', '#ffffff');
					$(this).find('a').css('background', '');
					$(this).find('a').addClass('ui-state-default');
				});
			}

		});
	}
</script>
</head>
<body>
<div align="center">
<div id="main_header"><jsp:include page="../Main/header.jsp" /></div>
<br><br><br><br>
<form action="ta_updateAction.task?ta_seq=${task.ta_seq}" method="post">
		<div id="update">
		<h3>Task</h3>
		<br><br>
		<hr>
		<br>
		<table id="update_table">
		<tr>
			<th>업무기간</th>
			<td>
				<input type="text"name="ta_date" class="week-picker" value="${task.ta_date}">
			</td>			
		</tr>
		
		<tr>
			<th>금주업무실적</th>
			<td>
				<textarea  name="ta_weekresult"></textarea>
			</td>			
		</tr>
		
		<tr>
			<th>차주업무계획</th>
			<td>
				<textarea rows="20" cols="130" name="ta_nextresult"></textarea>
			</td>			
		</tr>
	</table>
	<br><br>
	<div id="update_bottom" align="center">
				<input type="submit" value="수정완료">&nbsp;&nbsp;
				<input type="reset" value="취소">

	</div>
	</div>
	</form>
</div>
</body>
</html>
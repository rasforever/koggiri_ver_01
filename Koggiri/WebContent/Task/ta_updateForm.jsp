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
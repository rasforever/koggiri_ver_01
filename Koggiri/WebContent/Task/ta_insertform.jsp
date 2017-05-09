<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
<head>
<script src="jquery.js"></script>
<script type="text/javascript" src="jquery-ui.min.js"></script>
<link rel="stylesheet" type="text/css" media="screen"
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/themes/base/jquery-ui.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="../jquery-ui-1.8.14/themes/base/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="../style/task.css">
<link rel="stylesheet" type="text/css" href="../style/board.css">
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
	<div align="center">
		<div id="main_header"><jsp:include page="../Main/header.jsp" /></div>
		<br>
		<br>
		<br>
		<br>
		<form action="ta_insertAction.task" method="post">
			
			<div id="task" align="left">
			<h3 align="center">Task</h3>
			<br><br>
				 <input type="text" name="ta_date" size="40" class="week-picker"
					placeholder="업무기간을 선택하세요"> <br>
				<br> <label class="week_label">금주 업무계획</label>
				<div id="week_p">
					<textarea rows="20" cols="160" name="ta_weekresult"
						placeholder="금주의 계획을 작성하세요"></textarea><br>
						
				</div>
				<br> <label class="week_label">차주 업무계획</label>
				<div id="nextweek_p">
					<textarea rows="20" cols="160" name="ta_nextresult"
						placeholder="차주의 계획을 작성하세요"></textarea>
				</div>
			</div>
			<br>
			<div id="insert_btn">
				<input type="submit" value="등록" class="ta_insert_btn">&nbsp;&nbsp; <input type="reset" value="취소" OnClick="javascript:history.back(-1)" class="ta_insert_btn">
			</div>
		</form>
	</div>
	<br><br><br>
			<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
</body>
</html>
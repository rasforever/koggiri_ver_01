<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <script src="jquery.js"></script>
    <script type="text/javascript" src="jquery-ui.min.js"></script>
 	<link rel="stylesheet" type="text/css" media="screen" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/themes/base/jquery-ui.css">
	<link rel="stylesheet" type="text/css" media="screen" href="../jquery-ui-1.8.14/themes/base/jquery-ui.css">

<script type="text/javascript">
$(function() {
    var startDate;
    var endDate;
    
    $('.week-picker').datepicker( {
        showOtherMonths: true,
        selectOtherMonths: true,
		selectWeek:true,
        onSelect: function(dateText, inst) { 
            var date = $(this).datepicker('getDate');
            startDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() - date.getDay() + 1);
            endDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() - date.getDay() + 5);
			var dateFormat = 'yy/mm/dd'
            startDate = $.datepicker.formatDate( dateFormat, startDate, inst.settings );
            endDate = $.datepicker.formatDate( dateFormat, endDate, inst.settings );

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
<form action="ta_insertAction.task" method="post">
	<h3>업무등록</h3>
	<hr>
		<div>
		업무기간:<input type="text" name="ta_date"  size="22" class="week-picker" >
		</div>
		<div>
		금주업무실적:<br>
		<textarea rows="6" cols="70"  name="ta_weekresult"></textarea>
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
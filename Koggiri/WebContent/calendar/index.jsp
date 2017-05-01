<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src='lib/jquery.min.js'></script>
<script src='json2.js'></script>
<link rel='stylesheet' href='fullcalendar.css' />

<script src='lib/moment.min.js'></script>
<script src='fullcalendar.js' charset="euc-kr"></script>
<script src='locale/ko.js'></script>
<script type="text/javascript">
	var eventData;
	var eventDatalist=[];
	$(document).ready(function() {
	
    // page is now ready, initialize the calendar...
	
	$('#calendar').fullCalendar({
		header: {
			left: 'prev,next today',
			center: 'title',
			right: 'month,agendaWeek,agendaDay'
		},
		
		navLinks: true, // can click day/week names to navigate views
		selectable: true,
		selectHelper: true,
		select: function(start, end) { 
			var title = prompt('Event Title:');
		
			if (title) {
				eventData = {
					title: title,
					start: start,
					end: end
				}
				eventDatalist.push(eventData);
				
				
				$('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
								
			}
		
			$('#calendar').fullCalendar('unselect');
			
			
		},
		editable: true,
		eventLimit: true // allow "more" link when too many events
		
		
	});
	
    $('#post').click(function(){
    	
    	for(var i=0;i<eventDatalist.length;i++){
    	$.ajax({
    		
        	type:"POST",
        	url:"send.cal",
        	
			data: JSON.stringify(eventDatalist[i])
			,
			contentType: "application/json"
			
        	 
         });
    	}	
    });
	 	
});	

	
</script>
<style type="text/css">
    body {
        margin :40px 10px;
        padding : 0;
        font-family : "Lucida Grande", Helvetica, Arial, Verdana,sans-serif;
        font-size : 14px;
    }
    #calendar {
        max-width : 900px;
        margin : 0 auto;
    }
</style>
</head>
<body>
	<div id='calendar'></div>
	
	<div id="result">
		<table border="1">
		
		</table>
	</div>
	<button id="post">전송1</button>
	<button id="post2">전송2</button>
</body>
</html>
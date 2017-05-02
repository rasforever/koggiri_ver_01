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
	
	
	$(document).ready(function() {
	
    // page is now ready, initialize the calendar...
	var count;
    
    
	$('#calendar').fullCalendar({
		header: {
			left: 'prev,next today',
			center: 'title',
			right: 'month,agendaWeek,agendaDay'
		},
		
		    eventAfterAllRender: function (view) {
		    	
		    	$.ajax({
		    		   type:"GET",
		    		   url:"cnt.cal",
		    		   dataType:'text',
		    		   success:function(data){
		    			   count = Number(data);
		    			  /*  alert(count);
		    			   alert(cal.length); */
		    		   }
		    	   })
		   	
		    },
		navLinks: true, // can click day/week names to navigate views
		selectable: true,
		selectHelper: true,
		select: function(start, end) { 
			var title = prompt('Event Title:');
		
			if (title) {
			var	eventData = {
					title: title,
					start: start,
					end: end
				}
				
				
				
				$('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
								
			}
		
			$('#calendar').fullCalendar('unselect');
			
			
		},
		editable: true,
		eventLimit: true, // allow "more" link when too many events
		eventClick: function(event, element) {

	        event.title = prompt('Event Title:');
			
	        $('#calendar').fullCalendar('updateEvent', event);
			
	    },
	    //event의 사이즈를 줄였다 늘였다 할 수 있는 기능
	    eventResizeStart: function(event) {     
	        startDateOnStart = event.start;
	        endDateOnStart = event.end;         
	    },
	    eventResizeStop: function(event) {  
	        // I added 1 sec delay because in my experience the event object needs some time to update.
	        setTimeout(
	            function(){
	                 startDateOnStop = event.start;
	                 endDateOnStop = event.end;
	        }, 1000);                   
	    }, 
	    eventSources: { // 데이터 받고 뿌려주기
            url: 'get.cal',
            type: 'GET', 
            
        }
		
	});
	   var cal=[];
	 cal=$('#calendar').fullCalendar( 'clientEvents');
	 
      //event store in var End
        
      /*  $('#post1').click(function(){ 
    	   $.ajax({
    		   type:"GET",
    		   url:"cnt.cal",
    		   dataType:'text',
    		   success:function(data){
    			   count = Number(data);
    			   alert(count);
    			   alert(cal.length);
    		   }
    	   })
    	   
       }) */
	//id가 post인 버튼 클릭시 eventDatalist라는 json형식의 배열을 for문으로 하나하나 서블릿으로 post방식으로 데이터를 전송한다.
    $('#post').click(function(){
    	
    	
    	var newcal ="";
    	for(var i =count; i<cal.length;i++){
    		newcal = newcal + JSONtoString(cal[i])+",";
    		
    	}
    	newcal = "["+newcal.substring(0,newcal.length-1)+"]"; // json 배열 스트링형식으로의 변환
    	
    	console.log(newcal);
    	$.ajax({
            
            type:"POST",
            url:"send.cal",
           
                   data: newcal
                   ,
                   
                   success:function(){
                          alert("성공");
                   },
                   error:function(){
                          alert("실패");
                   }
            
        });
	/* 	console.log(newcal); */
    }); 
    
	

});	
	//json array 을 string으로 변환하는 함수
	function JSONtoString(object) {
	    var results = [];
	    for (var property in object) {
	        var value = object[property];
	        if(property.toString()!="start" && property.toString()!="end"){ 
	            results.push('"'+property.toString() +'"'+ ': ' + '"'+value+'"');
	        }else if(property.toString()=="start" || property.toString()=="end"){ // 속성이 start,end일때 13자리 값을 날짜로 변환
	        	results.push('"'+property.toString() +'"'+ ': ' + '"'+new moment(value).format("YYYY-MM-DD")+'"');
	        }
	        }
	             
	        return '{' + results.join(', ') + '}';
	} 
	
/* 	function popup(){
		var url = "insert.jsp";
		var name = "일정 등록 페이지";
		window.open(url,name,"width=200,height=200")
		
	} */
	
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
	<input id='post' type="button" value="일정 등록">
	<input id='post1' type="button" value="일정 수정">

</body>
</html>
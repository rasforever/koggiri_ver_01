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

<link type="text/css" rel="stylesheet" href="jquery.qtip.min.css" />
<script type="text/javascript" src="jquery.qtip.min.js"></script>

<script type="text/javascript">
	
	
	$(document).ready(function() {
		
		
		var tooltip = $('<div/>').qtip({
			id: 'calendar',
			prerender: true,
			content: {
				text: ' ',
				title: {
					button: true
				}
			},
			position: {
				my: 'bottom center',
				at: 'top center',
				target: 'mouse',
				viewport: $('#calendar'),
				adjust: {
					mouse: false,
					scroll: false
				}
			},
			show: false,
			hide: false,
			style: 'qtip-light'
		}).qtip('api');
    // page is now ready, initialize the calendar...
	var count;
    var selected=[];
    var update;
    
	$('#calendar').fullCalendar({
		header: {
			left: 'prev,next today',
			center: 'title'/* ,
			right: 'month,agendaWeek,agendaDay' */
		},
		
		 events: { // 데이터 받고 뿌려주기
	            url: 'get.cal',
	            type: 'GET', 
	            
	        },     
		    
		    
		navLinks: false, // can click day/week names to navigate views
		selectable: true,
		selectHelper: true,
		select: function(start, end) { 
			
			var title = prompt('Event Title:');
			var content = prompt('Content: ');
			if (title) {
			var	eventData = {
					title: title,
					start: start,
					end: end,
					content: content
					
				}
				
				
				
			$('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
			
			var cal=[];
			
	     	 cal=$('#calendar').fullCalendar( 'clientEvents');	
	     	 console.log(cal);
	     	 
	     	
	     	
	     	cal[cal.length-1]._id = "_fc"+cal.length; // _id 1로 자꾸 지정되서 event개수만큼 으로 지정함.
	     	
	     	
	     	$.ajax({
	            
	            type:"POST",
	            url:"send.cal",
				data: JSONtoString(cal[cal.length-1])
	
	            
	        });
								
			}
			
			$('#calendar').fullCalendar('unselect');
	
		},
		editable: true,
		eventLimit: true, // allow "more" link when too many events
		eventClick: function(event, element) {
			
	        event.title = prompt('Event Title:');
			
	        $('#calendar').fullCalendar('updateEvent', event);
			
	        selected = event._id;
	        
	        var cal=[];
	     	 cal=$('#calendar').fullCalendar( 'clientEvents');
	    	   for(var i =0;i<cal.length;i++){
	    		   if(cal[i]._id==selected){
	    			   update = JSON.stringify(cal[i]);
	    		   }
	    	   }
	    	   $.ajax({
	    		   type:"POST",
	    		   url:"update.cal",
	    		   data:update
	    	   });
	        
	    },
	    //event의 사이즈를 줄였다 늘였다 할 수 있는 기능
	    eventResizeStart: function(event) {     
	        startDateOnStart = event.start;
	        endDateOnStart = event.end;
	        selected = event._id;
	        
	    },
	    eventResizeStop: function(event) {  
	        // I added 1 sec delay because in my experience the event object needs some time to update.
	        setTimeout(
	            function(){
	                 startDateOnStop = event.start;
	                 endDateOnStop = event.end;
	                 selected = event._id;
	                 
	                 
	        }, 1000);    
	       
	        
	    },
	    
	    eventResize: function(event, delta, revertFunc) { // 이벤트 크기 변경

	    	 var cal=[];
	     	 cal=$('#calendar').fullCalendar( 'clientEvents');
	        for(var i =0;i<cal.length;i++){
	    		   if(cal[i]._id==selected){
	    			  
	    			   update = JSON.stringify(cal[i]);
	    		   }
	    	   }
	    	   $.ajax({
	    		   type:"POST",
	    		   url:"update.cal",
	    		   data:update
	    	   });

	    },
	    eventMouseout:function( data, event, view ){
	    	   $(this).css('z-index', 8);

	           $('.tooltiptopicevent').remove();
	    },
	    eventMouseover: function( data, event, view ) {
	    	 /* var content = '<h3>'+event.content+'</h3>';
	    	tooltip.set({
				'content.text': content
			}).reposition(jsEvent).show(jsEvent);  */
			
	    	 tooltip = '<div class="tooltiptopicevent" style="width:auto;height:auto;background:#feb811;position:absolute;z-index:10001;padding:10px 10px 10px 10px ;  line-height: 200%;">' 
	    	 + data.content + '</div>';


	         $("body").append(tooltip);
	         $(this).mouseover(function (e) {
	             $(this).css('z-index', 10000);
	             $('.tooltiptopicevent').fadeIn('500');
	             $('.tooltiptopicevent').fadeTo('10', 1.9);
	         }).mousemove(function (e) {
	             $('.tooltiptopicevent').css('top', e.pageY + 10);
	             $('.tooltiptopicevent').css('left', e.pageX + 20);
	         });
			
	    }
        
		
	});
	
	
	 
      //event store in var End
        
        

});	
	//json을 string으로 변환하는 함수
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
	

</body>
</html>
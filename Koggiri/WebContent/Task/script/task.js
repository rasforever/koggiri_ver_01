$(function() {
	
	$("input[name='ta_startdate']").datepicker({
		onClose : function(selectedDate) {
			if(selectedDate != ""){
				  $("input[name='ta_enddate']").datepicker("option", "minDate", curDate);
            }
		}
	});

	$("input[name='ta_enddate']").datepicker({
		onClose : function(selectedDate) {
			if(selectedDate != ""){
				  $("input[name='ta_startdate']").datepicker("option", "maxdate", selectedDate);
            }
		}
	});
	
	$("#today").text(new Date().toLocaleDateString());
});
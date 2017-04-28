

$(function() {
	$(".datepicker").datepicker({
		dateFormat : "yy/mm/dd"
	});
});

function typesel(obj) {		
	if ($(obj).find('option:selected').val() == 0){
		$('#card_number').attr("disabled",false);
	} else {
		$('#card_number').attr("disabled",true);
	}
	
}
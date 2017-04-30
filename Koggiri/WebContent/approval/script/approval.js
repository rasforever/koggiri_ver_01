

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

function approval_type(obj) {
	if(obj == "rw"){
		alert(obj);
		loaction="approval_list_rw.approval";
	}else if(obj == "rp"){
		alert(obj);
	}else if(obj == "re"){
		alert(obj);
	}else if(obj == "rc"){
		alert(obj);
	}else if(obj == "sp"){
		alert(obj);
	}else if(obj == "se"){
		alert(obj);
	}else if(obj == "sc"){
		alert(obj);
	}else if(obj == "st"){
		alert(obj);
	}else if(obj == "r"){
		alert(obj);
		location.href = "approval_list_r.approval";
		alert(obj);
	}else if(obj == "s"){
		alert(obj);
		loaction="approval_list_s.approval";
	}
	
}


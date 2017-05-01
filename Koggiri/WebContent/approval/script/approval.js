

$(function() {
	$(".datepicker").datepicker({
		dateFormat : "yy/mm/dd"
	});
});

function typesel(obj) {		

		$('#draft_content').text("disabled");

	
}

function approval_type(obj) {
	if(obj == "rw"){
		location.href = "approval_list_rw.approval";
	}else if(obj == "rp"){
		location.href = "approval_list_rp.approval";
	}else if(obj == "re"){
		location.href = "approval_list_re.approval";
	}else if(obj == "rc"){
		location.href = "approval_list_rc.approval";
	}else if(obj == "sp"){
		location.href = "approval_list_sp.approval";
	}else if(obj == "se"){
		location.href = "approval_list_se.approval";
	}else if(obj == "sc"){
		location.href = "approval_list_sc.approval";
	}else if(obj == "st"){
		location.href = "approval_list_st.approval";
	}else if(obj == "r"){
		location.href = "approval_list_r.approval";
	}else if(obj == "s"){
		location.href ="approval_list_s.approval";
	}
	
}


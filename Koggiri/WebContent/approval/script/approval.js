

$(function() {
	$(".datepicker").datepicker({
		dateFormat : "yy/mm/dd"
	});
});

function typesel(obj) {
	alert($(obj).val());	
	
	var a = "<p><strong><span style='font-size:26px'>비용 신청서</span></strong></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><table border='1' cellpadding='0' cellspacing='0' style='width:634px'><tbody><tr><td><p>비용신청자&nbsp;</p></td><td>&nbsp;김성준</td></tr><tr><p>신청액&nbsp;</p></td><td>&nbsp;2016.12.14 ~ 2016.12.15</td></tr><tr><td><p>&nbsp;비용신청자 내역</p></td><td><p>&nbsp;양학타운에서 쉬고자 합니다.</p><p>새벽 늦게 자니깐 많이 힘듭니다.</p></td></tr></tbody></table><p>&nbsp;</p><p>&nbsp;</p><p>상기 내용과 같이 휴가신청서를 상신하오니 재가 바랍니다.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016 년&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12&nbsp; 월&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;일</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 신청자&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;김성준&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>";


	CKEDITOR.instances.draft_content.setData(a);
}

function approval_type(obj) {
	if (obj == "rw") {
		location.href = "approval_list_rw.approval";
	} else if (obj == "rp") {
		location.href = "approval_list_rp.approval";
	} else if (obj == "re") {
		location.href = "approval_list_re.approval";
	} else if (obj == "rc") {
		location.href = "approval_list_rc.approval";
	} else if (obj == "sp") {
		location.href = "approval_list_sp.approval";
	} else if (obj == "se") {
		location.href = "approval_list_se.approval";
	} else if (obj == "sc") {
		location.href = "approval_list_sc.approval";
	} else if (obj == "st") {
		location.href = "approval_list_st.approval";
	} else if (obj == "r") {
		location.href = "approval_list_r.approval";
	} else if (obj == "s") {
		location.href = "approval_list_s.approval";
	}

}
<%@page import="koggiri.approval.model.ReqType"%>
<%@page import="koggiri.approval.model.PayType"%>
<%@page import="java.util.List"%>
<%@page import="koggiri.approval.model.ApprovalService"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
 	ApprovalService service = ApprovalService.getInstance();
	List<PayType> paylist = service.PayTypeService();
	List<ReqType> reqlist = service.ReqTypeService();

    request.setAttribute("paylist", paylist); //중요! 
    request.setAttribute("reqlist", reqlist); //중요!     
       
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script>
	$(function() {
		$(".datepicker").datepicker({
			dateFormat : "yy/mm/dd"
		});
	});
	//선택 했을시 변경
	function typesel(obj) {		
		if ($(obj).find('option:selected').val() == 0){
			$('#card_number').attr("disabled",false);
		} else {
			$('#card_number').attr("disabled",true);
		}
		
	}
</script>
</head>
<body>
	<h3>비용신청서</h3>
	<form action="expensesAction.approval" method="post"
		enctype="multipart/form-data">
		<hr>
		사&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;번 : <input type="text" name="emp_id" disabled>&nbsp;&nbsp;&nbsp; 
		이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름 : <input type="text" name="emp_nm" disabled> <br>
		제&nbsp;&nbsp;&nbsp;&nbsp;목 : <input type="text" name="ex_title">&nbsp;&nbsp;&nbsp; 
		신&nbsp;청&nbsp;일 : <input type="text" name="ex_dt" class="datepicker"><br>
		결제종류 : <select name ="pay_t_cd" onchange="typesel(this)" >
		<c:forEach var="paytype" items="${paylist}"> 
			<option  value="${paytype.pay_t_cd}">${paytype.pay_t_nm} </option>
		</c:forEach></select> &nbsp;&nbsp;&nbsp; 
		카드번호 : <input type="text" id="card_number" name="card_number" > <br> 
		신청종류 :  <select name ="req_t_type" > 
		<c:forEach var="reqtype" items="${reqlist}"> 
			<option value="${reqtype.req_t_cd}">${reqtype.req_t_nm} </option>
		</c:forEach></select>&nbsp;&nbsp;&nbsp; 
		총&nbsp;금&nbsp;액 : <input type="text" name="ex_tot_pay"> <br>
		<hr>
		<input multiple="multiple" type="file" name="filename[]"
			onchange="dropfile();" /> <br> <input type="submit" value="등록">
	</form>


</body>
</html>








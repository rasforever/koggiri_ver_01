<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	
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
<style>
div {
	apperance: none;
	-webkit-apperance: none;
	width: 100px;
	height: 100px;
}
</style>
<script>
	$(function() {
		$(".datepicker").datepicker({
			dateFormat : "yy/mm/dd"
		});
	});
	var dropFile = function(event) {
		event.preventDefault();
	}
</script>
</head>
<body>
	<h3>비용신청서</h3>
	<hr>
	<form action="expensesAction.approval" method="post"
		enctype="multipart/form-data">
		제&nbsp;&nbsp;&nbsp;&nbsp;목 : <input type="text" name="ex_title">
		&nbsp;&nbsp;&nbsp; 신&nbsp;청&nbsp;일 : <input type="text"
			class="datepicker"><br> 결제종류 : <input type="text"
			name="title"> &nbsp;&nbsp;&nbsp; 카드번호 : <input type="text"
			name="title" disabled="disabled"> <br> 신청종류 : <input
			type="text" name="title"> &nbsp;&nbsp;&nbsp; 총&nbsp;금&nbsp;액
		: <input type="text" name="title"> <br>

		<hr>
		<div onchange="dropfile();"></div>
		<input id="file" multiple="multiple" type="file" name="filename[]" />
		<br> <input type="submit" value="등록">
	</form>


	</form>

</body>
</html>









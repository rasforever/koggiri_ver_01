<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script>

$(function(){

	$(".datepicker").datepicker({

	dateFormat : "yy/mm/dd"

	});

});

</script>

</head>
<body>
	<form action="" method="post">
		
		이름:  <input type="text" name="emp_nm"><br>
		직급: <select name="pos_id">
				<option value="">직급선택</option>
    			<option value="10">CEO</option>
   				<option value="11">이사</option>
    			<option value="12">부장</option>
    			<option value="13">차장</option>
				<option value="14">과장</option>
				<option value="15">대리</option>
				<option value="16">사원</option>
			</select><br>
		부서: <select name="pos_id">
				<option value="">부서선택</option>
    			<option value="MM">경영진</option>
   				<option value="PL">인사팀</option>
    			<option value="MT">관리팀</option>
    			<option value="SN">솔루션팀</option>
				<option value="BS">영업팀</option>
				<option value="SE">서비스팀</option>
				<option value="MG">마케팅팀</option>
			</select><br>
		입사일: <input type="text" class="datepicker" name="join_dt" /><br>


		
	</form>
</body>
</html>
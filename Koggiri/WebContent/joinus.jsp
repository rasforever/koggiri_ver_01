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
		
		�̸�:  <input type="text" name="emp_nm"><br>
		����: <select name="pos_id">
				<option value="">���޼���</option>
    			<option value="10">CEO</option>
   				<option value="11">�̻�</option>
    			<option value="12">����</option>
    			<option value="13">����</option>
				<option value="14">����</option>
				<option value="15">�븮</option>
				<option value="16">���</option>
			</select><br>
		�μ�: <select name="pos_id">
				<option value="">�μ�����</option>
    			<option value="MM">�濵��</option>
   				<option value="PL">�λ���</option>
    			<option value="MT">������</option>
    			<option value="SN">�ַ����</option>
				<option value="BS">������</option>
				<option value="SE">������</option>
				<option value="MG">��������</option>
			</select><br>
		�Ի���: <input type="text" class="datepicker" name="join_dt" /><br>


		
	</form>
</body>
</html>
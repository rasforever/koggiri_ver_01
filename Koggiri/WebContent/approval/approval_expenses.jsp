<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
      <script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
   
      <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
   
      <script>
         $(function() {
            $( ".datepicker" ).datepicker( {
               dateFormat:"yy/mm/dd"
            });
         });
      </script>
</head>
<body>
<h3>비용신청서</h3>
<hr>
<form action="expensesAction.do" method="post">
	제&nbsp;&nbsp;&nbsp;&nbsp;목 : <input type="text" name="ex_title"> &nbsp;&nbsp;&nbsp; 신 청 일 : <input type="text" class="datepicker"><br>
	결제종류 : <input type="text" name="title">  &nbsp;&nbsp;&nbsp; 카드번호 : <input type="text" name="title" disabled="disabled">  <br>
	내용 <br>
	<textarea rows="6" cols="70" name="contents"></textarea>
	<br>
	<input type="submit" value="등록">
</form>

</body>
</html>









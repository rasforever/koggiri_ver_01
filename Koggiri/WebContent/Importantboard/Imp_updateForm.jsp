<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateAction.importantboard?i_id=${imp_board.i_id}">
		
		<table border="1" cellpadding="0" cellspacing="0">
		<tr height="30">
			<td width="80">작성자</td>
			<td width="170">
				<input type="text" name="i_emp_id" value = "${imp_board.i_emp_id }" size="10">
			</td>			
		</tr>
		
		<tr height="30">
			<td width="80">제목</td>
			<td align="left" colspan="3">
				
					<input type = "text" name = "i_title" size ="50" value = "[수정]: ${imp_board.i_title}">				
			
			</td>						
		</tr>		
		<tr height="30">			
			<td colspan="4">
				<textarea rows="10" cols="70" name="i_content"></textarea>
			</td>			
		</tr>
		<tr height="30">			
			<td colspan="4" align="center">
				<input type="submit" value="수정완료">&nbsp;&nbsp;
				<input type="reset" value="취소">
			</td>			
		</tr>
	</table>




	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="../style/board.css">
</head>
<body>

	<form action="updateAction.noticeboard?n_id=${board.n_id }" method="post">
		<div align="center">
			<div class="update">
				<table border="1" cellpadding="0" cellspacing="0" id="update_tb">
					<tr height="30">
						<td width="70" align="center">작성자</td>
						<td>&nbsp;&nbsp;<input type="text" name="n_emp_id"
							value="${board.n_emp_id }" size="10" readonly="true" class="up_input"></td>
					</tr>

					<tr height="30">
						<td width="70" align="center">제목</td>
						<td align="left" colspan="3">&nbsp;&nbsp;<input type="text"
							name="n_title" size="50" value="[수정]: ${board.n_title}" class="up_input"></td>
					</tr>
					<tr height="30">
						<td colspan="4"><textarea rows="10" cols="70"
								name="n_content"></textarea></td>
					</tr>
				</table>
				
					<input type="submit" value="수정완료">&nbsp;&nbsp;
					<input type="reset" value="취소">
			</div>
		</div>
	</form>


</body>
</html>
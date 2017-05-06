<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="../style/board.css">
</head>
<body>

	<form action="updateAction.noticeboard?n_id=${board.n_id }"
		method="post">
		<div id="main_header" align="center">
			<jsp:include page="../Main/header.jsp" />
		</div>
		<br>
		<br>
		<br>
		<br>
		<div align="center">
			<div class="update">
				<h3 align="center">Notice</h3>
				<br>
				<br>
				<table id="update_tb">
					<tr>
						<th width="70" align="center">작성자
						</th>
						<td>&nbsp;&nbsp;<input type="text" name="n_emp_id"
							value="${board.n_emp_id }" size="10" readonly="true"
							class="up_input"></td>
					</tr>

					<tr align="center">
						<th width="70">제목
						</th>
						<td align="left" colspan="3">&nbsp;&nbsp;<input type="text"
							name="n_title" size="50" value="[수정]: ${board.n_title}"
							class="up_input"></td>
					</tr>
					<tr height="30">

						<td colspan="4"><textarea rows="10" cols="70"
								name="n_content">${board.n_content }</textarea></td>

						<script type="text/javascript">
							CKEDITOR.replace('n_content', {
								'filebrowserUploadUrl' : '/ckeditor/upload.jsp?'
									+ 'realUrl=http://www.localhost.com/서버업로드될디렉토리명'
									+ '&realDir=서버업로드될디렉토리명'
							});
						</script>


					</tr>
				</table>
				<br>
				<div id="detail_btn" align="center">
					<input type="submit" value="수정완료" class="det_btn">
					&nbsp;&nbsp; <input type=button value="취소"
						OnClick="javascript:history.back(-1)" class="det_btn">
				</div>

			</div>
			<br> <br> <br> <br>
			<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
			</div>
		</div>

	</form>


</body>
</html>
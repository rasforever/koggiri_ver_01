<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/board.css">
<link type="text/css" rel="stylesheet" href="../style/document.css">
<title>Insert title here</title>
</head>
<body>

	<form action="updateAction.document?f_id=${doc_board.f_id }" method="post">
		<div id="main_header" align="center">
			<jsp:include page="../Main/header.jsp" />
		</div>
		<br>
		<br>
		<br>
		<br>
		<div align="center">
			<div class="update">
				<h3 align="center">Document</h3>
				<br>
				<br>
				<hr>
				<br>
				<table id="doc_update_tb">
					<tr>
							
						<th >비밀번호</th>
						<td >
							<input type="password" name="f_pwd" size="150" id="update_text">
						</td>		
					</tr>
					<tr>
						<th>제목</th>
						<td align="left" colspan="3">&nbsp;&nbsp;
						<input type="text" name="f_title" size="140" value="[수정]: ${doc_board.f_title}"
							class="up_input"></td>
							
					</tr>
					
							<!--파일 업로드를 위해 작성해야할 부분  -->
					<tr height="30">
						<th>파일</th>
						<td colspan="3">
								<input type = "file" name= "f_fname">
						</td>
					</tr>
					
					
					<tr height="30">

						<td colspan="4"><textarea rows="10" cols="70"
								name="f_content">${doc_board.f_content }</textarea></td>

						<script type="text/javascript">
							CKEDITOR.replace('f_content', {
								'filebrowserUploadUrl' : '/ckeditor/upload.jsp?'
									+ 'realUrl=http://www.localhost.com/서버업로드될디렉토리명'
									+ '&realDir=서버업로드될디렉토리명'
							});
						</script>


					</tr>
				</table>
				<br><br>
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
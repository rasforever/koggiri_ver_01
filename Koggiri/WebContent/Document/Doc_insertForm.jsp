<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/document.css">
<link type="text/css" rel="stylesheet" href="../style/board.css">
<title>Insert title here</title>
</head>

<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>

<body>
<div align="center">
		<div id="main_header" align="center">
		<jsp:include page="../Main/header.jsp" />
	</div>
	<br><br><br><br>
	<form action="insertAction.document" method="post" enctype="multipart/form-data">
		<!--enctype을 이렇게 설정해야 파일 업로드 가능  -->
		<div id="document">
	<h3>Document</h3>
	<br><br><hr><br>
		<table id="document_table">
			<tr height="30">

				<th>비밀번호</th>
				<td><input type="password" name="f_pwd" size="150" placeholder="문서의 비밀번호를 설정하세요"></td>
			</tr>

			<!--파일 업로드를 위해 작성해야할 부분  -->
			<tr>
				<th>파일</th>
				<td><input type="file" name="f_fname"></td>
			</tr>


			<tr >
				<th>제목</th>
				<td><c:choose>
						<c:when test="${param.f_id == null}">
							<input type="text" name="f_title" size="150" placeholder="문서의 제목을 입력하세요">
						</c:when>
					</c:choose></td>
			</tr>

			<tr height="30">
				<td colspan="4"><textarea rows="10" cols="70" name="f_content"></textarea>
				</td>

				<script type="text/javascript">
					CKEDITOR.replace('f_content', {
						'filebrowserUploadUrl' : '/ckeditor/upload.jsp?'
							+ 'realUrl=http://www.localhost.com/서버업로드될디렉토리명'
							+ '&realDir=서버업로드될디렉토리명'
					});
				</script>
			</tr>
		</table>
		<br><br><br>
		<div id="doc_btn" align="center">
		<input type="submit" value="글쓰기">&nbsp;&nbsp; 
		<input type="reset" value="취소">
		</div>
		</div>

	</form>
</div>
<br><br><br><br>
<div id="main_footer">
		<jsp:include page="../Main/footer.jsp" />
	</div>
</body>
</html>
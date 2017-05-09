<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="../style/board.css">
<link type="text/css" rel="stylesheet" href="../style/modify.css">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div id="main_header" align="center">
			<jsp:include page="../Main/header.jsp" />
		</div>
	<br><br><br><br>
		<div id="modify">
		<h3 align="center">Modify</h3>
		<br><br><hr><br>
		
		<!-- 입력한 값을 전송하기 위해 form 태그를 사용한다 -->
		<!-- 값(파라미터) 전송은 POST 방식 -->
		<form method="post" action="update.admin" 
				name="userInfo">
				
			<table id="modify_table">
				<tr>
					<th>아이디</th>
					<td><%=session.getAttribute("mem_id")%></td>
				</tr>
				<tr>
					<th>새 비밀번호</th>
					<td>
						<input type="password" name="mem_pw" maxlength="50" 
							value="" placeholder="새 비밀번호를 입력하세요" >
					</td>
				</tr>
	
				<tr>
					<th>이메일</th>
					<td>
						<input type="text" name="e_mail1" maxlength="50"
						value="" placeholder="이메일 아이디" >
						@ &nbsp;
						<select name="e_mail2" id="e_mail2" >
							<option value="naver.com">naver.com</option>
							<option value="gmail.com">gmail.com</option>
							<option value="daum.net" >daum.net</option>
							<option value="nate.com">nate.com</option>						
						</select>
					</td>
				</tr>
					
				<tr>
					<th>휴대전화</th>
					<td>
						<input type="text" name="tel_no" size="50" placeholder="전화번호를 입력하세요"  />
					</td>
				</tr>
				<tr>
					<th>주소</th>
					<td>
						<input type="text" size="50" name="addr" placeholder="주소를 입력하세요" />
					</td>
				</tr>
			</table>
			<br><br>
			<div id="modify_btn">
			<input type="submit" value="수정"/>  
			<input type="button" value="취소" />
			
			</div>
			
		</form>
		</div>
		<br><br><br><br>
		
				<div id="main_footer">
				<jsp:include page="../Main/footer.jsp" />
			</div>
			
			</div>
</body>
</html>
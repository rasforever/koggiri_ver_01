<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../Main/header.jsp"></jsp:include>
	</div>
	<br><br><br><br><br>
		<br><br>
		<b><font>회원정보 수정</font></b>
		<br><br><br>
		
		<!-- 입력한 값을 전송하기 위해 form 태그를 사용한다 -->
		<!-- 값(파라미터) 전송은 POST 방식 -->
		<form method="post" action="update.admin" 
				name="userInfo">
				
			<table>
				<tr>
					<td id="title">아이디</td>
					<td id="title"><%=session.getAttribute("mem_id")%></td>
				</tr>
				<tr>
					<td id="title">새 비밀번호</td>
					<td>
						<input type="password" name="mem_pw" maxlength="50" 
							value="">
					</td>
				</tr>
			</table>	
			<br><br>	
			<table>
			
				<tr>
					<td id="title">이메일</td>
					<td>
						<input type="text" name="e_mail1" maxlength="50"
						value="">
						@
						<select name="e_mail2" id="e_mail2">
							<option value="naver.com">naver.com</option>
							<option value="gmail.com">gmail.com</option>
							<option value="daum.net" >daum.net</option>
							<option value="nate.com">nate.com</option>						
						</select>
					</td>
				</tr>
					
				<tr>
					<td id="title">휴대전화</td>
					<td>
						<input type="text" name="tel_no" />
					</td>
				</tr>
				<tr>
					<td id="title">주소</td>
					<td>
						<input type="text" size="50" name="addr" />
					</td>
				</tr>
			</table>
			<br><br>
			<input type="button" value="취소" />
			<input type="submit" value="수정"/>  
		</form>
		
		<jsp:include page="../Main/footer.jsp"></jsp:include>
</body>
</html>
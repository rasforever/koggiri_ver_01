<%@page import="koggiri.approval.model.AppType"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="script/approval.js"></script>

</head>
<body>
	<form action="approval_insertAction.approval" method="post">
		사&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;번 : <input
			type="text" id="draft_emp_id" name="draft_emp_id" value="${einfo.emp_id }" disabled>&nbsp;&nbsp;&nbsp;
		이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름 : <input
			type="text" name="emp_nm" value="${einfo.emp_nm }" disabled>
		<br> 소&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;속 : <input
			type="text" name="dept_nm" value="${einfo.dept_nm }" disabled>&nbsp;&nbsp;&nbsp;
		직&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;급 : <input
			type="text" name="pos_nm" value="${einfo.pos_nm }" disabled>
		<br> 기&nbsp;안&nbsp;일 : <input type="text" name="draft_dt"
			class="datepicker"><br> 신청종류 : <input type="text" name="app_type_nm"
			value= "${approval.app_context}">
		

		</select>&nbsp;&nbsp;&nbsp; 제목 : <input type="text" name="app_title" value ="${approval.app_title}"><br>
		내용 : <br>
		<textarea rows="20" cols="100" id="app_context" name="app_context">
	 	</textarea>
		<script type="text/javascript">
			CKEDITOR.replace('app_context', {
				'filebrowserUploadUrl' : '/ckeditor/upload.jsp?'
					+ 'realUrl=http://www.localhost.com/서버업로드될디렉토리명'
					+ '&realDir=서버업로드될디렉토리명'
			});
			CKEDITOR.instances.app_context.getData(${approval.app_context});
			function typesel(obj) {
				var text ="";
				if ($(obj).val() == "10"){
					text = "<p><strong><span style='font-size:26px'>비용 신청서</span></strong></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><table border='1' cellpadding='0' cellspacing='0' style='width:634px'><tbody><tr><td><p>비용신청자&nbsp;</p></td><td>&nbsp;김성준</td></tr><tr><p>신청액&nbsp;</p></td><td>신청일</td><td>&nbsp;2016.12.14 ~ 2016.12.15</td></tr><tr><td><p>&nbsp;비용신청자 내역</p></td><td><p>&nbsp;양학타운에서 쉬고자 합니다.</p><p>새벽 늦게 자니깐 많이 힘듭니다.</p></td></tr></tbody></table><p>&nbsp;</p><p>&nbsp;</p><p>상기 내용과 같이 휴가신청서를 상신하오니 재가 바랍니다.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016 년&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12&nbsp; 월&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;일</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 신청자&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;김성준&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>";
				} else if($(obj).val() == "20"){
					text = "<p><span style='font-size:26px'><strong>제안 신청서</strong></span></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><table border='1' cellpadding='0' cellspacing='0' style='width:634px'><tbody><tr><td><p>기안자&nbsp;</p></td><td>&nbsp;김성준</td></tr><tr><td><p>기안제목&nbsp;</p></td><td>&nbsp;김성준</td></tr><tr><td><p>&nbsp;기안내용</p></td><td><p>&nbsp;양학타운에서 쉬고자 합니다.</p><p>새벽 늦게 자니깐 많이 힘듭니다.</p></td></tr></tbody></table><p>&nbsp;</p><p>&nbsp;</p><p>상기 내용과 같이 제안신청서를 상신하오니 재가 바랍니다.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016 년&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12&nbsp; 월&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;일</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;bsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 신청자&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;김성준</p>";
				} else if($(obj).val() == "30"){
					text = "<p><span style='font-size:26px'><strong>휴가 신청서</strong></span></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><table border='1' cellpadding='0' cellspacing='0' style='width:634px'><tbody><tr><td><p>성명&nbsp;</p></td><td>&nbsp;김성준</td></tr><tr><td><p>&nbsp;휴가기간</p></td><td>&nbsp;2016.12.14 ~ 2016.12.15</td></tr><tr><td><p>&nbsp;휴가내용</p></td><td><p>&nbsp;양학타운에서 쉬고자 합니다.</p><p>새벽 늦게 자니깐 많이 힘듭니다.</p></td></tr></tbody></table><p>&nbsp;</p><p>&nbsp;</p><p>상기 내용과 같이 휴가신청서를 상신하오니 재가 바랍니다.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016 년&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12&nbsp; 월&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;일</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 신청자&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;김성준&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>";
				} else if($(obj).val() == "40"){
					text = "<p><strong><span style='font-size:26px'>출장 신청서</span></strong></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><table border='1' cellpadding='0' cellspacing='0' style='width:634px'><tbody><tr><td><p>출장자&nbsp;</p></td><td>유승현</td></tr><tr><td><p>&nbsp;출장기간</p></td><td>&nbsp;</td></tr><tr><td><p>&nbsp;출장장소</p></td><td><p>&nbsp;</p></td></tr><tr><td>&nbsp;출장목적</td><td><p>11111111111111111111111111111111111111111111111111111111111111</p><p>&nbsp;</p></td></tr><tr><td>&nbsp;출장 일정 &amp; 회의록</td><td><p>&nbsp;11111111111111111111111111111111111111111111111111111111111111</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p></td></tr></tbody></table><p>&nbsp;</p><p>상기 내용과 같이 출장신청서를 상신하오니 재가 바랍니다.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016 년&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12&nbsp; 월&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;일</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 신청자&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;김성준&nbsp;&nbsp;</p>";
				}
				CKEDITOR.instances.app_context.setData(text);
			}
		</script>
		<br> <input type="submit" value="등록"><input type="reset" value="취소">
	</form>
</body>
</html>
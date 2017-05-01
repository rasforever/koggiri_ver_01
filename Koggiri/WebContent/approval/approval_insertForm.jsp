<%@page import="koggiri.approval.model.AppType"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

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
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input
			type="text" name="emp_id" value="${einfo.emp_id }" disabled>&nbsp;&nbsp;&nbsp;
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input
			type="text" name="emp_nm" value="${einfo.emp_nm }" disabled>
		<br> ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input
			type="text" name="dept_nm" value="${einfo.dept_nm }" disabled>&nbsp;&nbsp;&nbsp;
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input
			type="text" name="pos_nm" value="${einfo.pos_nm }" disabled>
		<br> ��&nbsp;��&nbsp;�� : <input type="text" name="draft_dt"
			class="datepicker"><br> ��û���� : <select id="app_type"
			name="app_type" onchange="typesel(this)">
			<c:forEach var="apptype" items="${applist}">
				<option value="${apptype.app_type_cd}">${apptype.app_type_nm}
				</option>
			</c:forEach>

		</select>&nbsp;&nbsp;&nbsp; ���� : <input type="text" name="draft_title"><br>
		���� : <br>
		<textarea rows="20" cols="100" id="draft_content" name="draft_content">
	 	</textarea>
		<script type="text/javascript">
			CKEDITOR.replace('draft_content', {
				'filebrowserUploadUrl' : '/ckeditor/upload.jsp?'
					+ 'realUrl=http://www.localhost.com/�������ε�ɵ��丮��'
					+ '&realDir=�������ε�ɵ��丮��'
			});
			
			function typesel(obj) {
				alert($(obj).val());	
				var text ="";
				if ($(obj).val() == "10"){
					text = "<p><strong><span style='font-size:26px'>��� ��û��</span></strong></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><table border='1' cellpadding='0' cellspacing='0' style='width:634px'><tbody><tr><td><p>����û��&nbsp;</p></td><td>&nbsp;�輺��</td></tr><tr><p>��û��&nbsp;</p></td><td>��û��</td><td>&nbsp;2016.12.14 ~ 2016.12.15</td></tr><tr><td><p>&nbsp;����û�� ����</p></td><td><p>&nbsp;����Ÿ��� ������ �մϴ�.</p><p>���� �ʰ� �ڴϱ� ���� ����ϴ�.</p></td></tr></tbody></table><p>&nbsp;</p><p>&nbsp;</p><p>��� ����� ���� �ް���û���� ����Ͽ��� �簡 �ٶ��ϴ�.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016 ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12&nbsp; ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;��</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ��û��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�輺��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>";
				} else if($(obj).val() == "20"){
					text = "<p><span style='font-size:26px'><strong>���� ��û��</strong></span></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><table border='1' cellpadding='0' cellspacing='0' style='width:634px'><tbody><tr><td><p>�����&nbsp;</p></td><td>&nbsp;�輺��</td></tr><tr><td><p>�������&nbsp;</p></td><td>&nbsp;�輺��</td></tr><tr><td><p>&nbsp;��ȳ���</p></td><td><p>&nbsp;����Ÿ��� ������ �մϴ�.</p><p>���� �ʰ� �ڴϱ� ���� ����ϴ�.</p></td></tr></tbody></table><p>&nbsp;</p><p>&nbsp;</p><p>��� ����� ���� ���Ƚ�û���� ����Ͽ��� �簡 �ٶ��ϴ�.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016 ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12&nbsp; ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;��</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;bsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ��û��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�輺��</p>";
				} else if($(obj).val() == "30"){
					text = "<p><span style='font-size:26px'><strong>�ް� ��û��</strong></span></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><table border='1' cellpadding='0' cellspacing='0' style='width:634px'><tbody><tr><td><p>����&nbsp;</p></td><td>&nbsp;�輺��</td></tr><tr><td><p>&nbsp;�ް��Ⱓ</p></td><td>&nbsp;2016.12.14 ~ 2016.12.15</td></tr><tr><td><p>&nbsp;�ް�����</p></td><td><p>&nbsp;����Ÿ��� ������ �մϴ�.</p><p>���� �ʰ� �ڴϱ� ���� ����ϴ�.</p></td></tr></tbody></table><p>&nbsp;</p><p>&nbsp;</p><p>��� ����� ���� �ް���û���� ����Ͽ��� �簡 �ٶ��ϴ�.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016 ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12&nbsp; ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;��</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ��û��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�輺��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>";
				} else if($(obj).val() == "40"){
					text = "<p><strong><span style='font-size:26px'>���� ��û��</span></strong></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><table border='1' cellpadding='0' cellspacing='0' style='width:634px'><tbody><tr><td><p>������&nbsp;</p></td><td>������</td></tr><tr><td><p>&nbsp;����Ⱓ</p></td><td>&nbsp;</td></tr><tr><td><p>&nbsp;�������</p></td><td><p>&nbsp;</p></td></tr><tr><td>&nbsp;�������</td><td><p>11111111111111111111111111111111111111111111111111111111111111</p><p>&nbsp;</p></td></tr><tr><td>&nbsp;���� ���� &amp; ȸ�Ƿ�</td><td><p>&nbsp;11111111111111111111111111111111111111111111111111111111111111</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p></td></tr></tbody></table><p>&nbsp;</p><p>��� ����� ���� �����û���� ����Ͽ��� �簡 �ٶ��ϴ�.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016 ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12&nbsp; ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13&nbsp;&nbsp;��</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ��û��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�輺��&nbsp;&nbsp;</p>";
				}
				CKEDITOR.instances.draft_content.setData(text);
			}
		</script>
		<c:set var="age">15</c:set>
		<br> <input type="submit" value="���">
	</form>

</body>
</html>
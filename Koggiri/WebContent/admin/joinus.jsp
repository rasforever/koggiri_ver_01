<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript">
$(function(){

	$(".datepicker").datepicker({

	dateFormat : "yy/mm/dd"

	});

});


</script>

	<form action="join.admin" method="post" id="insertform">
		
		이름:  <input type="text" name="emp_nm"><br>
		직급: <select name="pos_id">
				<option value="">직급선택</option>
    			<option value="10">CEO</option>
   				<option value="11">이사</option>
    			<option value="12">부장</option>
    			<option value="13">차장</option>
				<option value="14">과장</option>
				<option value="15">대리</option>
				<option value="16">사원</option>
			</select><br>
		부서: <select name="dept_id">
				<option value="">부서선택</option>
    			<option value="MM">경영진</option>
   				<option value="PL">인사팀</option>
    			<option value="MT">관리팀</option>
    			<option value="SN">솔루션팀</option>
				<option value="BS">영업팀</option>
				<option value="SE">서비스팀</option>
				<option value="MG">마케팅팀</option>
			</select><br>
		입사일: <input type="text" class="datepicker" name="join_dt" /><br>
		성별: <select name="sex_id">
				<option value="">성별선택</option>
				<option value="M">남자</option>
				<option value="F">여자</option>
			</select><br>
		국적:<select name="nation_id">
				<option value="">국적선택</option>
				<option value="KR">한국</option>
				<option value="JP">일본</option>
				<option value="US">미국</option>
		</select>
		주민등록번호: <input type="text" name="res_no"><br>
		
		<input type="submit" value="추가">

		
	</form>

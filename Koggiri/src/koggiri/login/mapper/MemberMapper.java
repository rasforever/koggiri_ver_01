package koggiri.login.mapper;

import koggiri.login.model.Member;

public interface MemberMapper {
	Member login(Member member);
	
	String get_emp_nm(Member dbmember);
	
}

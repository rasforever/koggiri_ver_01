package koggiri.admin_emp.mapper;

import java.util.List;

import koggiri.admin_emp.model.Emp;
import koggiri.admin_emp.model.Admin_Member;
import koggiri.admin_emp.model.Search;
import koggiri.admin_emp.model.SearchedEmp;


public interface EmpMapper {
	List<SearchedEmp> selectList(Search search);
	int insertEmp(Emp emp);
	String findEmpid(Emp emp);
	int tempPass(Emp emp);
	int tempPassUpdate(Admin_Member member);
	int empUpdate(Emp emp);
	String passCheck(Emp emp);
	int memUpdate(Emp emp);
}

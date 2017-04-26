package koggiri.admin_emp.mapper;

import java.util.List;

import koggiri.admin_emp.model.Emp;
import koggiri.admin_emp.model.Search;
import koggiri.admin_emp.model.SearchedEmp;

public interface EmpMapper {
	List<SearchedEmp> selectList(Search search);
	
}

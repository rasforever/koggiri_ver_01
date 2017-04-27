package koggiri.admin_emp.action;


import java.sql.Date;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.admin_emp.model.Emp;
import koggiri.admin_emp.model.EmpDao;
import koggiri.admin_emp.model.Search;
import koggiri.admin_emp.model.SearchedEmp;

public class EmpInsertAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EmpDao dao = EmpDao.getInstance();
		int num = 0;
		Emp emp = new Emp();
		request.setCharacterEncoding("utf-8"); 
		System.out.println(request.getParameter("join_dt"));
		System.out.println(request.getParameter("emp_nm"));
		emp.setEmp_nm(request.getParameter("emp_nm"));
		emp.setDept_id(request.getParameter("dept_id"));
		emp.setPos_id(request.getParameter("pos_id"));
		//  2017/04/04 형식   -> 17/04/04
		String before = request.getParameter("join_dt");
		String join_dt = before.substring(2);
		emp.setJoin_dt(join_dt); 		
		
		String max_emp_id = dao.findEmpid(emp);// k17040401
		if(max_emp_id==null){ // 그날짜에 들어온 사람이 없으면
			String no = join_dt.replace("/", ""); // 170404
			max_emp_id = "k"+no+"00";
		}
		
		num = Integer.parseInt(max_emp_id.substring(1)) + 1; // 17040402
		// 17/04/04 -> 170404 변환
		//String no = join_dt.replace("/", "");
		String emp_id = "k"+String.valueOf(num); // k17040402
		System.out.println(emp_id);
		emp.setEmp_id(emp_id);
		emp.setRes_no(request.getParameter("res_no"));
		emp.setSex_id(request.getParameter("sex_id"));
		emp.setNation_id(request.getParameter("nation_id"));
		emp.setWstate_cd("0");
		emp.setInput_emp_id("master");
		System.out.println(emp.toString());
		dao.insertEmp(emp); 
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(true);
		forward.setPath("/Koggiri/admin/manager.jsp");
		
		return forward;
	}

}

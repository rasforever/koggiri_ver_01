package koggiri.admin_emp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.admin_emp.model.Emp;
import koggiri.admin_emp.model.EmpDao;

public class EmpUpdateAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EmpDao dao = EmpDao.getInstance();
		Emp emp = new Emp();
		String mem_pw = request.getParameter("mem_pw");
		String e_mail = request.getParameter("e_mail1") + "@" + request.getParameter("e_mail2");
		String tel_no = request.getParameter("tel_no");
		String addr = request.getParameter("addr");
		HttpSession session =request.getSession();
		String emp_id = (String) session.getAttribute("mem_id");
		emp.setEmp_id(emp_id);
		emp.setMem_pw(mem_pw);
		emp.setAddr(addr);
		emp.setE_mail(e_mail);
		emp.setTel_no(tel_no);
		System.out.println(emp.toString());
		
		
		
		
		
			dao.empUpdate(emp);
			dao.memUpdate(emp);
			System.out.println("수정 성공");
			ActionFoward forward = new ActionFoward();
			forward.setRedirect(false);
			forward.setPath("/Main/main.jsp");
			
			return forward;
	
		
		
	
	}

}

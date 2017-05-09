package koggiri.admin_emp.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.admin_emp.model.Emp;
import koggiri.admin_emp.model.EmpDao;

public class MempassCheckAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EmpDao dao = EmpDao.getInstance();
		Emp emp = new Emp();
		HttpSession session =request.getSession();
		String emp_id = (String) session.getAttribute("mem_id");
		String mem_pw = request.getParameter("mem_pw");
		
		emp.setEmp_id(emp_id);
		
		ActionFoward forward = new ActionFoward();
		if(dao.passCheck(emp).equals(request.getParameter("mem_pw"))){
			
			forward.setRedirect(false);
			forward.setPath("/modify/modify.jsp");
			
			return forward;
		}else{
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('비밀번호가 틀립니다.');");
			out.println("location.href='/Koggiri/Main/main.jsp';");
			out.println("</script>");
			out.close();
		}
		
		

		
		return null;
	}

}

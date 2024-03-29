package koggiri.approval.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.approval.model.AppType;
import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.Emp_infomation;

public class ApprovalInsertForm implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		

		HttpSession session = request.getSession(true); 
		String emp_id = (String) session.getAttribute("mem_id");		
		
		
		List<AppType> applist = dao.appty_select();		
		Emp_infomation einfo = dao.einfo_select(emp_id);
		
		request.setAttribute("einfo", einfo); //중요! 
	    request.setAttribute("applist", applist); //중요! 
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_insertForm.jsp");

		return forward;
	}

}

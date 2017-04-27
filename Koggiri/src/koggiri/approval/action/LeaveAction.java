package koggiri.approval.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.Emp_infomation;
import koggiri.approval.model.LeaveType;
import koggiri.approval.model.ReqType;

public class LeaveAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ApprovalDao dao = ApprovalDao.getInstance();
		List<LeaveType> leavelist = dao.leave_tyselect();	
		Emp_infomation einfo = dao.einfo_select();

	    request.setAttribute("leavelist", leavelist); //중요!
		request.setAttribute("einfo", einfo); //중요!  
		System.out.println("A");
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_leave.jsp");

		return forward;
	}

}

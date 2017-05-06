package koggiri.approval.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.AppType;
import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.Emp_infomation;

public class ApprovalUpdateForm implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		String num = request.getParameter("app_id");
		ApprovalDao dao = ApprovalDao.getInstance();	
		String emp_id = request.getParameter("emp_id");
		
		emp_id = "k15010201";
		
		Emp_infomation einfo = dao.einfo_select(emp_id);
		
		request.setAttribute("einfo", einfo); //중요! 
		
		ActionForward forward = new ActionForward();
		Approval approval = dao.detailSApproval(num);
		request.setAttribute("approval", approval);
		String draft_dt = approval.getDraft_dt();
		draft_dt = draft_dt.replace("-", "/").substring(0, 10);
		approval.setDraft_dt(draft_dt);
		System.out.println(approval.getApp_emp_id());
		System.out.println(approval.getDraft_dt());
		forward.setRedirect(false);
		forward.setPath("/approval/approval_updateForm.jsp");

		return forward;
	}

}

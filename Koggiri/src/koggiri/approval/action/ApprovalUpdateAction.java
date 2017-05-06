package koggiri.approval.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalDao;

public class ApprovalUpdateAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		Approval approval = new Approval();
		System.out.println(request.getParameter("app_id"));
		System.out.println(request.getParameter("app_emp_id"));
		System.out.println(request.getParameter("app_title"));
		System.out.println(request.getParameter("app_context"));
		System.out.println(request.getParameter("draft_dt"));
		System.out.println(request.getParameter("emp_id"));

		approval.setApp_id(request.getParameter("app_id"));
		approval.setApp_emp_id(request.getParameter("app_emp_id"));
		approval.setApp_title(request.getParameter("app_title"));
		approval.setApp_context(request.getParameter("app_context"));
		approval.setDraft_dt(request.getParameter("draft_dt"));
		approval.setChg_emp_id(request.getParameter("emp_id"));		
		dao.updateApproval(approval);		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("approval_list_s.approval?type=0");
		return forward;	
	}

}

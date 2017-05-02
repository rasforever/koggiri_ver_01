package koggiri.approval.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalDao;


public class ApprovalInsertAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		Approval approval = new Approval();

		System.out.println(request.getParameter("draft_emp_id"));
		System.out.println(request.getParameter("app_emp_id"));
		approval.setApp_type_cd(request.getParameter("app_type"));
		approval.setDraft_emp_id(request.getParameter("emp_id"));
		approval.setApp_emp_id(request.getParameter("app_emp_id"));
		approval.setApp_title(request.getParameter("app_title"));
		approval.setApp_context(request.getParameter("app_context"));
		approval.setDept_id(request.getParameter("dept_id"));
		approval.setDraft_dt(request.getParameter("draft_dt"));
		System.out.println(approval.getApp_type_cd());
		System.out.println(approval.getApp_emp_id());
		System.out.println(approval.getApp_title());
		System.out.println(approval.getApp_context());
		System.out.println(approval.getDept_id());
		System.out.println(approval.getDraft_dt());
		System.out.println(approval.getDraft_emp_id());
		dao.insertApproval(approval);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("approval_list_s.approval?type=0");
		return forward;	
	}

}

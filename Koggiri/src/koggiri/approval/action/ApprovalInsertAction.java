package koggiri.approval.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.ApprovalInsert;


public class ApprovalInsertAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		ApprovalInsert approvalInsert = new ApprovalInsert();
		
		approvalInsert.setApp_type_cd(request.getParameter("app_type"));
		approvalInsert.setApp_emp_id("k15010201");
		approvalInsert.setApp_title(request.getParameter("app_title"));
		approvalInsert.setApp_context(request.getParameter("app_context"));
		approvalInsert.setDpet_id("MT");
		approvalInsert.setDraft_dt(request.getParameter("draft_dt"));
		approvalInsert.setDraft_emp_id(request.getParameter("draft_emp_id"));
		System.out.println(approvalInsert.getApp_type_cd());
		System.out.println(approvalInsert.getApp_emp_id());
		System.out.println(approvalInsert.getApp_title());
		System.out.println(approvalInsert.getApp_context());
		System.out.println(approvalInsert.getDpet_id());
		System.out.println(approvalInsert.getDraft_dt());
		System.out.println(approvalInsert.getDraft_emp_id());
		dao.insertApproval(approvalInsert);
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(true);
		forward.setPath("approval_list_r.approval?type=0");
		return forward;	
	}

}

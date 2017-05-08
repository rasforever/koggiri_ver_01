package koggiri.approval.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalDao;

public class ApprovalUpdateAPP implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		Approval approval =  new Approval();
		String app_id = request.getParameter("app_id");
		String app_pro_cd = request.getParameter("app_pro_cd");
		String app_emp_id = request.getParameter("app_emp_id");
		
		approval.setApp_id(app_id);
		approval.setApp_pro_cd(app_pro_cd);	
		approval.setChg_emp_id(app_emp_id);
		
		System.out.println(approval.getApp_id());
		System.out.println(approval.getApp_pro_cd());
		System.out.println(approval.getChg_emp_id());
		
		dao.updateApproval_app(approval);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_list.jsp?type=0");

		return forward;
	}

}

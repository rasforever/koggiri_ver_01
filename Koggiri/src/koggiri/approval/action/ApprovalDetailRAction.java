package koggiri.approval.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalDao;

public class ApprovalDetailRAction implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		Approval Approval = dao.detailRApproval(request.getParameter("app_id"));
		

		request.setAttribute("approval", Approval); // 중요!
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_detail.jsp");

		return forward;
	}

}

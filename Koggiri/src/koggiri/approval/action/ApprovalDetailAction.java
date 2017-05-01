package koggiri.approval.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.ApprovalDetail;

public class ApprovalDetailAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		ApprovalDetail approvaldetail = dao.approval_detail(request.getParameter("app_id"));
		

		request.setAttribute("approvaldetail", approvaldetail); // 중요!
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_detail.jsp");

		return forward;
	}

}

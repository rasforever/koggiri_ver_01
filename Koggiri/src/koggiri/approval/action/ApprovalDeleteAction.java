package koggiri.approval.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.ApprovalDao;

public class ApprovalDeleteAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		dao.deleteApproval(request.getParameter("app_id"));
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("approval_list_s.approval?type=0");
		return forward;	
	}

}

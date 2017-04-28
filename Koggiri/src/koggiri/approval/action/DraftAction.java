package koggiri.approval.action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.Emp_infomation;

public class DraftAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ApprovalDao dao = ApprovalDao.getInstance();
		Emp_infomation einfo = dao.einfo_select();
		
		request.setAttribute("einfo", einfo); //중요!  
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_draft.jsp");

		return forward;
	}

}

package koggiri.approval.action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.Draft;

public class DraftAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();

		Draft draft = dao.draft_select();
		
		request.setAttribute("draft", draft); //중요!  
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_draft.jsp");

		return forward;
	}

}

package koggiri.approval.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.DraftType;

public class DraftTypeAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();

		List<DraftType> draftlist = dao.draft_tyselect();
		
		request.setAttribute("draftlist", draftlist); //중요!  
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_draft.jsp");

		return forward;
	}

}

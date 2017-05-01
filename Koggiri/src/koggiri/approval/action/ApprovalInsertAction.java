package koggiri.approval.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.ApprovalDao;


public class ApprovalInsertAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(true);
		forward.setPath("approval/approval_index.jsp?type=0");
		return forward;	
	}

}

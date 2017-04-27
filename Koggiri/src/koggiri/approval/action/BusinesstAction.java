package koggiri.approval.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BusinesstAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_businesst.jsp");

		return forward;
	}

}

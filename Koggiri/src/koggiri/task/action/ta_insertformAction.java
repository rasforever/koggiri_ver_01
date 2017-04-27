package koggiri.task.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ta_insertformAction implements ta_Action {
	
	@Override
	public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ta_ActionForward forward = new ta_ActionForward();
		forward.setRedirect(false);
		forward.setPath("ta_insertform.jsp");
		return forward;
	}
}

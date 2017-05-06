package koggiri.document.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Doc_Action {
	
	public Doc_ActionForward execute(HttpServletRequest request, HttpServletResponse response);

}

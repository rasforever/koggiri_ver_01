package koggiri.task.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface ta_Action {
	  public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}

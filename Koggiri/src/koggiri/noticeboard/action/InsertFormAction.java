package koggiri.noticeboard.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);//1.디스패처를 사용해서 보내겠다.
		forward.setPath("Noticeboard/insertForm.jsp");//2. 이 경로를 통해서 
		//forward객체에 1번과 2번 내용이 포함되어있음.
		
		return forward;
	}

}

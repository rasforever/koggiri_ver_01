package koggiri.task.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.task.model.Task;
import koggiri.task.model.TaskDao;

public class ta_insertAction implements ta_Action {

	@Override
	public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		TaskDao dao = TaskDao.getInstance();
	     Task task = new Task();
	     task.setTa_weekresult(request.getParameter("ta_weekresult"));
	     task.setTa_nextresult(request.getParameter("ta_nextresult"));
		
		dao.insertTask(task);
		
		ta_ActionForward forward = new ta_ActionForward();
	    forward.setRedirect(true); 
		forward.setPath("ta_listAction.do");
		
		return forward;
	}
	
	

}

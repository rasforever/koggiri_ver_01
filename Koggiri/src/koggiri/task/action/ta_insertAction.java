package koggiri.task.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.task.model.Task;
import koggiri.task.model.TaskDao;

public class ta_insertAction implements ta_Action {

	@Override
	public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaskDao dao = TaskDao.getInstance();
	     Task task = new Task();
	     HttpSession session = request.getSession(true); 
		 String emp_id = (String) session.getAttribute("mem_id");
		 task.setEmp_id(emp_id);
	     task.setTa_weekresult(request.getParameter("ta_weekresult"));
	     task.setTa_nextresult(request.getParameter("ta_nextresult"));
	     task.setTa_date(request.getParameter("ta_date"));
			   
	     
	     dao.insertTask(task);
		
		ta_ActionForward forward = new ta_ActionForward();
	    forward.setRedirect(true); 
		forward.setPath("ta_listAction.task");
		
		
		return forward;
	}
	
	

}

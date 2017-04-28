package koggiri.task.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.task.model.Task;
import koggiri.task.model.TaskDao;

public class ta_insertAction implements ta_Action {

	@Override
	public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dfjkjdkjkj");
		TaskDao dao = TaskDao.getInstance();
	     Task task = new Task();

	     task.setTa_weekresult(request.getParameter("ta_weekresult"));
	     task.setTa_nextresult(request.getParameter("ta_nextresult"));
	   
		
	     String result1 = request.getParameter("ta_startdate");
			String ta_startdate = result1.substring(2);
			task.setTa_startdate(ta_startdate);
			System.out.println(result1);
			
		  String result2 = request.getParameter("ta_enddate");
			String ta_enddate = result2.substring(2);
				task.setTa_enddate(ta_enddate);	
				System.out.println(result2);
				
	     
	     dao.insertTask(task);
		
		ta_ActionForward forward = new ta_ActionForward();
	    forward.setRedirect(true); 
		forward.setPath("ta_listAction.task");
		
		return forward;
	}
	
	

}

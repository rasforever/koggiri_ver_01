package koggiri.task.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.noticeboard.action.ActionForward;
import koggiri.noticeboard.model.Board;
import koggiri.noticeboard.model.BoardDao;
import koggiri.task.model.Task;
import koggiri.task.model.TaskDao;

public class ta_DeleteAction implements ta_Action {

	@Override
	public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response)  
	throws ServletException, IOException {
		
String num = request.getParameter("ta_seq");
		
		int ta_seq = 1;
		if(num != null){
			ta_seq = Integer.parseInt(num);	
		}
		TaskDao dao = TaskDao.getInstance();
		Task task = new Task();
		request.setAttribute("task", task);
		
		task.setTa_seq(ta_seq);
		
		dao.deleteTask(task);
		
		ta_ActionForward forward = new ta_ActionForward();
		forward.setRedirect(true);
		forward.setPath("ta_listAction.task");
		
		
		return forward;
	}

}

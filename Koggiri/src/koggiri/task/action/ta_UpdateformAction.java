package koggiri.task.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.task.model.Task;
import koggiri.task.model.TaskDao;


public class ta_UpdateformAction implements ta_Action {

	@Override
	public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String num = request.getParameter("ta_seq");
		
		int ta_seq = 1;
		if(num != null){
			ta_seq = Integer.parseInt(num);
		
		}
		ta_ActionForward forward = new ta_ActionForward();
		TaskDao dao = TaskDao.getInstance();
		Task task = dao.detailTask(ta_seq);
		request.setAttribute("task", task);
		forward.setRedirect(false);
		forward.setPath("ta_updateForm.jsp");
		
	     System.out.println("dfdfdf");
		return forward;
	}
}

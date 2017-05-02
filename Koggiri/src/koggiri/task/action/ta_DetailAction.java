package koggiri.task.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.task.model.Task;
import koggiri.task.model.TaskDao;

public class ta_DetailAction implements ta_Action {

	@Override
	public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String num = request.getParameter("ta_seq");
		
		int ta_seq = 1;
		if(num != null){
			ta_seq = Integer.parseInt(num);
		}
		
		
		TaskDao dao = TaskDao.getInstance();
		dao.updateTask_Hit(ta_seq);
		Task task = dao.detailTask(ta_seq);
		
		
		task.setTa_startdate(task.getTa_startdate().substring(0,10));
		task.setTa_enddate(task.getTa_enddate().substring(0,10));

		request.setAttribute("task", task);
	
		
		ta_ActionForward forward = new ta_ActionForward();
		forward.setRedirect(false);
		forward.setPath("ta_detail.jsp");

		return forward;
	}
}

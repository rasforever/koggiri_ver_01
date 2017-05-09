package koggiri.task.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.task.model.Task;
import koggiri.task.model.TaskDao;

public class ta_UpdateAction implements ta_Action {

	@Override
	public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num = request.getParameter("ta_seq");
		int ta_seq = 1;
		if (num != null) {
			ta_seq = Integer.parseInt(num);
		}

		TaskDao dao = TaskDao.getInstance();
		Task task = new Task();

		task.setTa_seq(ta_seq);
		task.setTa_date(request.getParameter("ta_date"));

	    task.setTa_weekresult(request.getParameter("ta_weekresult"));
	    task.setTa_nextresult(request.getParameter("ta_nextresult"));

		dao.updateTask(task);

		ta_ActionForward forward = new ta_ActionForward();
		
		forward.setRedirect(true);
		forward.setPath("ta_listAction.task");

		return forward;
	}

}

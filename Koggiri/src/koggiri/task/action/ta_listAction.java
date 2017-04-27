package koggiri.task.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.task.model.Task;
import koggiri.task.model.TaskDao;

public class ta_listAction implements ta_Action {

	@Override
	public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		TaskDao dao = TaskDao.getInstance();

		List<Task>list = dao.listTask();
		request.setAttribute("list", list);

		ta_ActionForward forward = new ta_ActionForward();
		forward.setRedirect(false);
		forward.setPath("/ta_list.jsp");

		return forward;

	}

}

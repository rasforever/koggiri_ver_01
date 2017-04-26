package koggiri.task.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.task.action.ta_Action;
import koggiri.task.action.ta_ActionForward;
import koggiri.task.action.ta_insertAction;
import koggiri.task.action.ta_insertformAction;


/**
 * Servlet implementation class BoardController
 */
@WebServlet("*.do")

public class TaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TaskController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse 

response)
			throws ServletException, IOException {
		doProcess(request, response);

	}

	private void doProcess(HttpServletRequest request, 

HttpServletResponse response)
			throws IOException, ServletException {
		// url을 식별해야 한다.
		String requestURI = request.getRequestURI();
		// System.out.println(requestURI);
		// 컨텍스트 경로
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 

1);
		System.out.println(command); // 원하는 url만 뽑아온다

		ta_ActionForward forward = null;
		ta_Action action = null;

		if (command.equals("insertForm.do")) {

			action = new ta_insertformAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {

			}

		} else if (command.equals("insertAction.do")) {
			action = new ta_insertAction();
			try {
				forward = action.execute(request, response);

			} catch (Exception e) {
			}
		}
	}
}

package koggiri.task.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.noticeboard.action.DeleteAction;
import koggiri.task.action.ta_Action;
import koggiri.task.action.ta_ActionForward;
import koggiri.task.action.ta_DeleteAction;
import koggiri.task.action.ta_DetailAction;
import koggiri.task.action.ta_UpdateAction;
import koggiri.task.action.ta_UpdateformAction;
import koggiri.task.action.ta_insertAction;
import koggiri.task.action.ta_insertformAction;
import koggiri.task.action.ta_listAction;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("*.task")

public class TaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TaskController() {
		super();
		// TODO Auto-generated constructor stub
	}

	private void doProcess(HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException {
		String requestURI = request.getRequestURI();
		System.out.println(requestURI);
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		String command = requestURI.substring(contextPath.length() +1);
		System.out.println(command); 

		ta_ActionForward forward = null;
		ta_Action action = null;

		if (command.equals("Task/ta_insertAction.task")) {
			action = new ta_insertAction();			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {

			}

		} else if (command.equals("Task/ta_insertformAction.task")) {
			action = new ta_insertformAction();
			try {
				forward = action.execute(request, response);

			} catch (Exception e) {
			}
		} else if (command.equals("Task/ta_listAction.task")) {
			action = new ta_listAction();
			try {
				forward = action.execute(request, response);

			} catch (Exception e) {
			}
		}
		
		else if (command.equals("Task/ta_detailAction.task")) { 
			action = new ta_DetailAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	    else if (command.equals("Task/ta_updateformAction.task")) {
		action = new ta_UpdateformAction();
		try {
			forward = action.execute(request, response);

		} catch (Exception e) {
		}
		
		
	} else if(command.equals("Task/ta_updateAction.task")){
			action = new ta_UpdateAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	else if(command.equals("Task/ta_deleteAction.task")){

		action = new ta_DeleteAction();
		try {
			forward = action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
		
		
		
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}
	
}

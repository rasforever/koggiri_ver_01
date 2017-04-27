
package koggiri.approval.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.admin_emp.action.EmpSearchAction;
import koggiri.approval.action.Action;
import koggiri.approval.action.ActionFoward;
import koggiri.approval.action.expensesTypeAction;

@WebServlet(urlPatterns = "*.approval")
public class ApprovalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ApprovalController() {
		super();

	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 1);
		request.setCharacterEncoding("UTF-8");

		ActionFoward forward = null;
		Action action = null;
		System.out.println(command);

		if (command.equals("approval/expensesAction.approval")) {
			 action = new expensesTypeAction();
	            
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


package koggiri.approval.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.action.Action;
import koggiri.approval.action.ActionFoward;
import koggiri.approval.action.ApprovalListAction;
import koggiri.approval.action.BusinesstAction;
import koggiri.approval.action.DraftAction;
import koggiri.approval.action.ExpensesTypeAction;
import koggiri.approval.action.LeaveAction;

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
			 action = new ExpensesTypeAction();	            
	            try {
	               forward = action.execute(request, response);
	           } catch (Exception e) {
	              e.printStackTrace();
	           }
		}
		else if (command.equals("approval/draftingAction.approval")) {
			 action = new DraftAction();	            
	            try {
	               forward = action.execute(request, response);
	           } catch (Exception e) {
	              e.printStackTrace();
	           }
		}
		else if (command.equals("approval/leaveAction.approval")) {
			 action = new LeaveAction();	            
	            try {
	               forward = action.execute(request, response);
	           } catch (Exception e) {
	              e.printStackTrace();
	           }
		}
		else if (command.equals("approval/businesstAction.approval")) {
			 action = new BusinesstAction();	            
	            try {
	               forward = action.execute(request, response);
	           } catch (Exception e) {
	              e.printStackTrace();
	           }
		}
		else if (command.equals("approval/test.approval")) {
			action = new ApprovalListAction();	            
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


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
import koggiri.approval.action.ApprovalInsertFormAction;
import koggiri.approval.action.ApprovalListAction;

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

		if (command.equals("approval/approval_list_r.approval")) {
			action = new ApprovalListAction("r");	
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
		}
		else if (command.equals("approval/approval_list_rw.approval")) {
			action = new ApprovalListAction("rw");	
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
		}
		else if (command.equals("approval/approval_list_rp.approval")) {
			action = new ApprovalListAction("rp");	
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
		}
		else if (command.equals("approval/approval_list_re.approval")) {
			action = new ApprovalListAction("re");	
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
		}
		else if (command.equals("approval/approval_list_rc.approval")) {
			action = new ApprovalListAction("rc");	
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
		}
		else if (command.equals("approval/approval_list_s.approval")) {
			action = new ApprovalListAction("s");	
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
		}
		else if (command.equals("approval/approval_list_sp.approval")) {
			action = new ApprovalListAction("sp");	
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
		}
		else if (command.equals("approval/approval_list_se.approval")) {
			action = new ApprovalListAction("se");	
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
		}
		else if (command.equals("approval/approval_list_sc.approval")) {
			action = new ApprovalListAction("sc");	
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
		}
		else if (command.equals("approval/approval_list_st.approval")) {
			action = new ApprovalListAction("st");	
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
		}
		else if (command.equals("approval/approval_insertForm.approval")) {
			action = new ApprovalInsertFormAction();	
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

package koggiri.important.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.important.action.Imp_Action;
import koggiri.important.action.Imp_ActionForward;
import koggiri.important.action.Imp_DeleteAction;
import koggiri.important.action.Imp_DetailAction;
import koggiri.important.action.Imp_InsertAction;
import koggiri.important.action.Imp_InsertFormAction;
import koggiri.important.action.Imp_ListAction;
import koggiri.important.action.Imp_UpdateAction;
import koggiri.important.action.Imp_UpdateFormAction;

/**
 * Servlet implementation class Imp_BoardController
 */
@WebServlet("*.importantboard")
public class Imp_BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Imp_BoardController() {
		super();

	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 1);
		int le = command.indexOf("/");
		String path = command.substring(le + 1, command.length());
		System.out.println("contextPath : " + contextPath);
		System.out.println("command : " + command);
		System.out.println("path : " + path);

		request.setCharacterEncoding("utf-8"); // 인코딩
		Imp_ActionForward imp_forward = null;
		Imp_Action imp_action = null;

		// insert
		if (path.equals("insertAction.importantboard")) {
		
			imp_action = new Imp_InsertAction();
			try {
				imp_forward = imp_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// list
		} 
		
		else if (path.equals("insertFormAction.importantboard")) {// 리스트액션인가?
			
			imp_action = new Imp_InsertFormAction();
			try {
				imp_forward = imp_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (path.equals("listAction.importantboard")) {// 리스트액션인가?
			System.out.println(" success!! list path가 정상적으로 비교됨.");
			imp_action = new Imp_ListAction();
			try {
				imp_forward = imp_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (path.equals("detailAction.importantboard")) {

			imp_action = new Imp_DetailAction();
			try {
				imp_forward = imp_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		else if (path.equals("updateFormAction.importantboard")) {
			imp_action = new Imp_UpdateFormAction();

			try {
				imp_forward = imp_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (path.equals("updateAction.importantboard")) {
			imp_action = new Imp_UpdateAction();

			try {
				imp_forward = imp_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		else if (path.equals("deleteAction.importantboard")) {
			imp_action = new Imp_DeleteAction();
			try {
				imp_forward = imp_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (imp_forward != null) {
			if (imp_forward.isRedirect()) {
				response.sendRedirect(imp_forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(imp_forward.getPath());
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

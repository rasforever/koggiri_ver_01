package koggiri.document.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.document.action.Doc_Action;
import koggiri.document.action.Doc_ActionForward;
import koggiri.document.action.Doc_DetailAction;
import koggiri.document.action.Doc_InsertAction;
import koggiri.document.action.Doc_ListAction;
import koggiri.document.action.Doc_UpdateAction;
import koggiri.document.action.Doc_UpdateFormAction;

@WebServlet("*.document")
public class Doc_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Doc_Controller() {
		super();

	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 1);
		int cut = command.indexOf("/");
		String path = command.substring(cut + 1, command.length());

		request.setCharacterEncoding("utf-8");

		Doc_ActionForward doc_forward = null;
		Doc_Action doc_action = null;

		if (path.equals("insertAction.document")) {
			doc_action = new Doc_InsertAction();
			System.out.println("sss");
			try {
				doc_forward = doc_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		else if (path.equals("listAction.document")) {
			doc_action = new Doc_ListAction();
			try {
				doc_forward = doc_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (path.equals("detailAction.document")) {
			doc_action = new Doc_DetailAction();
			try {
				doc_forward = doc_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (path.equals("updateFormAction.document")) {
			doc_action = new Doc_UpdateFormAction();
			try {
				doc_forward = doc_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (path.equals("updateAction.document")) {
			doc_action = new Doc_UpdateAction();
			try {
				doc_forward = doc_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if (doc_forward != null) {
			if (doc_forward.isRedirect()) {
				response.sendRedirect(doc_forward.getPath());
			} else {
				RequestDispatcher doc_dispatcher = request.getRequestDispatcher(doc_forward.getPath());
				doc_dispatcher.forward(request, response);
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

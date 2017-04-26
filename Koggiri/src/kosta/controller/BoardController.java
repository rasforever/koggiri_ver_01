package kosta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.Action;
import kosta.action.ActionForward;
import kosta.action.DeleteAction;
import kosta.action.DetailAction;
import kosta.action.InsertAction;
import kosta.action.InsertFormAction;
import kosta.action.ListAction;
import kosta.action.UpdateAction;
import kosta.action.UpdateFormAction;

@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardController() {
		super();

	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {// 새롭게 메서드 만들어줌
		// 요청 url에 대한 식별이 필요! -> 그 것에 맞는 액션을 호출하기 위함.
		String requestURI = request.getRequestURI();
		// System.out.println(requestURI);
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 1);
		System.out.println(command);
		System.out.println("aaaa");

		ActionForward forward = null;
		Action action = null;

		if (command.equals("insertForm.do")) {
			action = new InsertFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (command.equals("insertAction.do")) {
			action = new InsertAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("listAction.do")) {
			action = new ListAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}else if (command.equals("detailAction.do")){
			action = new DetailAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}else if (command.equals("updateFormAction.do")){
			action = new UpdateFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else if (command.equals("updateAction.do")){
			action = new UpdateAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else if (command.equals("deleteAction.do")){
			action = new DeleteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		if (forward != null) {// 한 번은 실행했다는 뜻
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());// 경로를 가져옴
			} else {// 디스패처시키겠다
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

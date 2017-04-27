package koggiri.noticeboard.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.noticeboard.action.Action;
import koggiri.noticeboard.action.ActionForward;
import koggiri.noticeboard.action.DeleteAction;
import koggiri.noticeboard.action.DetailAction;
import koggiri.noticeboard.action.InsertAction;
import koggiri.noticeboard.action.ListAction;
import koggiri.noticeboard.action.UpdateAction;
import koggiri.noticeboard.action.UpdateFormAction;


@WebServlet("*.noticeboard")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardController() {
		super();

	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청되는 URL이 무엇인지 확인해본다. getRequestURI메서드를 통해서
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 1);
		int le = command.indexOf("/");
		String path = command.substring(le + 1, command.length());
		System.out.println(contextPath);
		System.out.println(command);
		System.out.println(path);

		request.setCharacterEncoding("utf-8"); // 들어오는거 인코딩.
		ActionForward forward = null;
		Action action = null;

		if (path.equals("insertAction.noticeboard")) { //인설트액션인가?
			
			action = new InsertAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		else if (path.equals("listAction.noticeboard")) {//리스트액션인가?
			
			action = new ListAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		
		else if (path.equals("detailAction.noticeboard")) { //디테일액션인가?
	
			action = new DetailAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		else if (path.equals("updateFormAction.noticeboard")){
			
			action = new UpdateFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		else if(path.equals("updateAction.noticeboard")){
			action = new UpdateAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		else if(path.equals("deleteAction.noticeboard")){

			action = new DeleteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}
		
	/*	else if(path.equals("updateHit.noticeboard")){
			
			action = new UpdateHit();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}*/
		

		if (forward != null) {
			if (forward.isRedirect()) {
				// getPath로 setPath했던 경로를 얻어 올 수 있다.
				response.sendRedirect(forward.getPath());
			} else {
				// Dispathcer : 기존요청의 연장선 그 요청으로 jsp로 가겠다.
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

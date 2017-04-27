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
import koggiri.important.action.Imp_InsertAction;


/**
 * Servlet implementation class Imp_BoardController
 */
@WebServlet("*.importantboard")
public class Imp_BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Imp_BoardController() {
        super();
  
    }

    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	String requestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String command = requestURI.substring(contextPath.length() +1);
    	int le = command.indexOf("/");
    	String path = command.substring(le + 1, command.length());
    	System.out.println( "contextPath : " +  contextPath);
    	System.out.println( "command : " + command);
    	System.out.println( "path : " + path);
    	
    	request.setCharacterEncoding("utf-8"); //인코딩
    	Imp_ActionForward imp_forward = null;
    	Imp_InsertAction imp_action = null;
    	
    	
    	if(path.equals("insertAction.importantboard")){
    		System.out.println(" success!! path가 정상적으로 비교됨.");
    		imp_action = new Imp_InsertAction();
    		try {
				imp_forward = imp_action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	if(imp_forward != null){
    		if(imp_forward.isRedirect()){
    			response.sendRedirect(imp_forward.getPath());
    		} else {
    			RequestDispatcher dispatcher = request.getRequestDispatcher(imp_forward.getPath());
    			dispatcher.forward(request, response);
    		}
    	}
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		System.out.println("get으로 진입");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		System.out.println("post로 진입");
	}

}
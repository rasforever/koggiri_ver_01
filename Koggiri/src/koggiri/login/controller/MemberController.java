package koggiri.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.login.action.Action;
import koggiri.login.action.ActionFoward;
import koggiri.login.action.LoginAction;
import koggiri.login.action.LogoutAction;


@WebServlet("*.login")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MemberController() {
        super();

    }
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	
       String requestURI = request.getRequestURI();
       String contextPath = request.getContextPath();
       String command = requestURI.substring(contextPath.length()+1);

       request.setCharacterEncoding("utf-8"); 
       ActionFoward forward = null;
       Action action = null;
       
       if(command.equals("login/loginform.login")){
          
           action = new LoginAction();
           
           try {
              forward = action.execute(request, response);
          } catch (Exception e) {
             e.printStackTrace();
          }
          
        }
       
       else if(command.equals("logout/logoutform.login")){
       	action = new LogoutAction();
           
           try {
              forward = action.execute(request, response);
          } catch (Exception e) {
             e.printStackTrace();
          }
       }
      
       
       if(forward !=null){
           if(forward.isRedirect()){
              
              response.sendRedirect(forward.getPath());
           } else {
              
               RequestDispatcher dispatcher = 
                     request.getRequestDispatcher(forward.getPath());
               dispatcher.forward(request, response);
           }
        }
   }
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);
	}

}

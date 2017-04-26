package koggiri.admin_emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.admin_emp.action.Action;
import koggiri.admin_emp.action.ActionFoward;
import koggiri.admin_emp.action.EmpInsertAction;
import koggiri.admin_emp.action.EmpSearchAction;




@WebServlet(urlPatterns = "*.admin")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EmpController() {
        super();

    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String command = requestURI.substring(contextPath.length()+1);
        request.setCharacterEncoding("UTF-8");
        
        ActionFoward forward = null;
        Action action = null;
    	System.out.println(command);
        
        if(command.equals("searchEmp.admin")){
            
            action = new EmpSearchAction();
            
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
         
         }else if(command.equals("join.admin")){
        	 action = new EmpInsertAction();
        	 
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

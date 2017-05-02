package koggiri.calendar.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.calendar.action.Action;
import koggiri.calendar.action.ActionForward;
import koggiri.calendar.action.CountAction;
import koggiri.calendar.action.EventInsertAction;
import koggiri.calendar.action.EventListAction;


@WebServlet("*.cal")
public class CalendarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CalendarController() {
        super();

    }
public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String command = requestURI.substring(contextPath.length()+1);
        request.setCharacterEncoding("UTF-8");
        
        ActionForward forward = null;
        Action action = null;
        
    	System.out.println(command);
        
        if(command.equals("calendar/send.cal")){
            
            action = new EventInsertAction();
            
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
         
         }else if(command.equals("calendar/get.cal")){
             
             action = new EventListAction();
             
             try {
                forward = action.execute(request, response);
            } catch (Exception e) {
               e.printStackTrace();
            }
          
          }else if(command.equals("calendar/cnt.cal")){
              
              action = new CountAction();
              
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

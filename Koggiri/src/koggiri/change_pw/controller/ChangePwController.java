package koggiri.change_pw.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.chart.action.Action;
import koggiri.chart.action.ActionFoward;
import koggiri.chart.action.ChartAction;
import koggiri.chart.action.DetailAction;


@WebServlet(urlPatterns = "*.ch")
public class ChangePwController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ChangePwController() {
        super();

    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String command = requestURI.substring(contextPath.length()+1);
        request.setCharacterEncoding("utf-8"); 
        System.out.println(command);
        ActionFoward forward = null;
        Action action = null;
    	
        
      if(command.equals("member_chart/chart.ch")){
            
            action = new ChartAction();
            
            try {
               forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
         
         }else if(command.equals("member_chart/detail.ch")){
             
             action = new DetailAction();
             
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
               System.out.println(forward.getPath()+"fff");
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

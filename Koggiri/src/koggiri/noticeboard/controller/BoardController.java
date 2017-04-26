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
import koggiri.noticeboard.action.InsertAction;


@WebServlet("/BoardController")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BoardController() {
        super();
       
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
   	 //요청되는 URL이 무엇인지 확인해본다. getRequestURI메서드를 통해서
       String requestURI = request.getRequestURI();
       String contextPath = request.getContextPath();
       String command = requestURI.substring(contextPath.length()+1);
       System.out.println(command);
       System.out.println("sssdfsdfasdf");
       request.setCharacterEncoding("utf-8"); // 들어오는거 인코딩.
       ActionForward forward = null;
       Action action = null;

       
       if(command.equals("insertAction.do")){
           
           action = new InsertAction();
          System.out.println("testalert");
           try {
              forward = action.execute(request, response);
          } catch (Exception e) {
             e.printStackTrace();
          }
          //커맨드 값이 마으면 거기에 맞는 액션을 호출하면 된다.
        }
       
       if(forward !=null){
           if(forward.isRedirect()){
              //getPath로 setPath했던 경로를 얻어 올 수 있다.
              response.sendRedirect(forward.getPath());
           } else {
              //Dispathcer : 기존요청의 연장선 그 요청으로 jsp로 가겠다.
               RequestDispatcher dispatcher = 
                     request.getRequestDispatcher(forward.getPath());
               dispatcher.forward(request, response);
           }
        }
   }
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request,response);
	}

}

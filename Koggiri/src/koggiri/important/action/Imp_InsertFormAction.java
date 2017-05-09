package koggiri.important.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Imp_InsertFormAction implements Imp_Action{

	@Override
	public Imp_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String mem_id = (String) session.getAttribute("mem_id");
		
		
		Imp_ActionForward imp_forward = new Imp_ActionForward();
		
		if(mem_id.equals("master")){
		
		imp_forward.setRedirect(false);
		imp_forward.setPath("Imp_insertForm.jsp");
		
		}else{
			
			 response.setContentType("text/html;charset=utf-8");
				
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('글 작성 권한이 없습니다!');");
				out.println("location.href='/Koggiri/Importantboard/listAction.importantboard';");
				out.println("</script>");
				out.close();
			
		}
		
		return imp_forward;
	}


}

package koggiri.noticeboard.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InsertFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		String mem_id = (String) session.getAttribute("mem_id");
		ActionForward forward = new ActionForward();
		
		if (mem_id.equals("master")){			
			forward.setRedirect(false);//1.디스패처를 사용해서 보내겠다.
			forward.setPath("insertForm.jsp");//2. 이 경로를 통해서 
			//forward객체에 1번과 2번 내용이 포함되어있음.
			
		} else {
			
            response.setContentType("text/html;charset=utf-8");
			
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('글 작성 권한이 없습니다!');");
			out.println("location.href='/Koggiri/Noticeboard/listAction.noticeboard';");
			out.println("</script>");
			out.close();
			
		}

		return forward;
	}

}

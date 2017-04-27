package koggiri.login.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.login.model.Member;
import koggiri.login.model.MemberDao;



public class LoginAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao dao = MemberDao.getInstance();
		Member dbmember = null;
		Member member = new Member();
		
	 	member.setMem_id(request.getParameter("mem_id"));
	 	member.setMem_pw(request.getParameter("mem_pw"));
	 	
		dbmember = dao.login(member);
		
		
		ActionFoward forward = new ActionFoward();
		if(dbmember==null){ // 로그인 실패
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('로그인이 실패하였습니다.');");
			out.println("location.href='/Koggiri/login/loginform.jsp';");
			out.println("</script>");
			out.close();
		}else{ //성공
			
			forward.setRedirect(false);
			forward.setPath("/login/loginok.jsp");
		}
		return forward;
	}

}

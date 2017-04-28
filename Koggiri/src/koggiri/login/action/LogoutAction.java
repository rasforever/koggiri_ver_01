package koggiri.login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		session.invalidate();
		
		String message = "logoutOk";
		
		response.sendRedirect(request.getContextPath() + "/login/loginform.jsp?message=" + message);
		
		return null;
	}
}

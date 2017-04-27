package koggiri.important.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Imp_Action {
	
	public Imp_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException;

}

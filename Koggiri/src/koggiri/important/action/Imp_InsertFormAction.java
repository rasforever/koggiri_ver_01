package koggiri.important.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Imp_InsertFormAction implements Imp_Action{

	@Override
	public Imp_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Imp_ActionForward imp_forward = new Imp_ActionForward();
		imp_forward.setRedirect(false);
		imp_forward.setPath("Imp_insetForm");
		
		return imp_forward;
	}


}

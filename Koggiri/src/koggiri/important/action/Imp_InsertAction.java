package koggiri.important.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.important.model.Imp_Board;
import koggiri.important.model.Imp_BoardDao;

public class Imp_InsertAction implements Imp_Action{

	@Override
	public Imp_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Imp_BoardDao imp_dao = Imp_BoardDao.getInstance();
		Imp_Board imp_board = new Imp_Board();
		imp_board.setI_title(request.getParameter("i_title"));
		imp_board.setI_content(request.getParameter("i_content"));
		
		HttpSession session = request.getSession();
		
		String mem_id = (String) session.getAttribute("mem_id");
		imp_board.setI_emp_id(mem_id);
	
		
		
		imp_dao.imp_insertBoard(imp_board);

		Imp_ActionForward imp_forward = new Imp_ActionForward();
		
		imp_forward.setRedirect(true);
		imp_forward.setPath("listAction.importantboard");
		
		return imp_forward;
	}

}

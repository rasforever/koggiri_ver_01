package koggiri.important.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.important.model.Imp_Board;
import koggiri.important.model.Imp_BoardDao;

public class Imp_DeleteAction implements Imp_Action {

	@Override
	public Imp_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String num = request.getParameter("i_id");
		int seq = 1;
		if( num != null){
			seq = Integer.parseInt(num);
		}
		
		Imp_BoardDao imp_dao = Imp_BoardDao.getInstance();
		Imp_Board imp_board = new Imp_Board();
		request.setAttribute("imp_board", imp_board);		
		
		imp_board.setI_id(seq);
		
		imp_dao.imp_deleteBoard(imp_board);
		
		
		
		Imp_ActionForward imp_forward = new Imp_ActionForward();
		
		imp_forward.setRedirect(true);
		imp_forward.setPath("listAction.importantboard");
		return imp_forward;
	}

}

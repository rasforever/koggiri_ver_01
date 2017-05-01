package koggiri.important.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.important.model.Imp_Board;
import koggiri.important.model.Imp_BoardDao;

public class Imp_ListAction implements Imp_Action {

	@Override
	public Imp_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Imp_BoardDao imp_dao = Imp_BoardDao.getInstance();
		List<Imp_Board> list = imp_dao.imp_listBoard();
		request.setAttribute("list", list);
		
		Imp_ActionForward imp_forward = new Imp_ActionForward();
		imp_forward.setRedirect(false);
		imp_forward.setPath("Imp_list.jsp");
		return imp_forward;
	}

}

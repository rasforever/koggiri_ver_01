package koggiri.noticeboard.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import koggiri.noticeboard.model.Board;
import koggiri.noticeboard.model.BoardDao;

public class InsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao = BoardDao.getInstance();
		Board board = new Board();
		board.setN_title(request.getParameter("n_title"));
		board.setN_content(request.getParameter("n_content"));
		
		
		dao.insertBoard(board);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("listAction.noticeboard");
		return forward;	
	}

}

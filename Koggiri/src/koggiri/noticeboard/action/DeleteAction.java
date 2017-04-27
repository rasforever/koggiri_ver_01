package koggiri.noticeboard.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.noticeboard.model.Board;
import koggiri.noticeboard.model.BoardDao;

public class DeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String num = request.getParameter("n_id");
		
		int seq = 1;
		if(num != null){
			seq = Integer.parseInt(num);	
		}
		BoardDao dao = BoardDao.getInstance();
		Board board = new Board();
		request.setAttribute("board", board);
		
		board.setN_id(seq);
		
		dao.deleteBoard(board);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("listAction.noticeboard");
		
		
		return forward;
	}

}

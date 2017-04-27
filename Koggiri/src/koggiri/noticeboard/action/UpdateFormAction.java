package koggiri.noticeboard.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.noticeboard.model.Board;
import koggiri.noticeboard.model.BoardDao;

public class UpdateFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String num = request.getParameter("n_id");
		
		int seq = 1;
		if(num != null){
			seq = Integer.parseInt(num);
		
		}
		ActionForward forward = new ActionForward();
		BoardDao dao = BoardDao.getInstance();
		Board board = dao.detailBoard(seq);
		request.setAttribute("board", board);
		forward.setRedirect(false);
		forward.setPath("updateForm.jsp");
		
	
		return forward;
	}

}

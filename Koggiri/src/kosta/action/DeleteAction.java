package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.model.BoardDao;

public class DeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String num = request.getParameter("seq");

		int seq = 1;
		if (num != null) {
			seq = Integer.parseInt(num);
		}
		BoardDao dao = BoardDao.getInstance();
		Board board = new Board();
		request.setAttribute("board", board);
		board.setSeq(seq);
		dao.deleteBoard(board);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true); //새로운 요청이므로 dispatcher(이전 것의 연장선)가 아니라 redirect를 해야한다.
		forward.setPath("listAction.do");
		
		return forward;
	}

}

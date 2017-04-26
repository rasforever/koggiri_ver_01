package kosta.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.model.BoardDao;

public class DetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardDao dao = BoardDao.getInstance();

		String num = request.getParameter("seq");

		int seq = 1;
		if (num != null) {
			seq = Integer.parseInt(num);
		}

		Board board = dao.detailBoard(seq);

		request.setAttribute("board", board);

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);// 1.디스패처를 사용해서 보내겠다.
		forward.setPath("/detail.jsp");// 2. 이 경로를 통해서
		// forward객체에 1번과 2번 내용이 포함되어있음.
		return forward;
	}

}

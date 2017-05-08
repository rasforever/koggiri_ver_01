package koggiri.document.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_BoardDao;

public class Doc_UpdateFormAction implements Doc_Action {

	@Override
	public Doc_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String num = request.getParameter("f_id");
		int seq = 1;
		if (num != null) {
			seq = Integer.parseInt(num);
		}
		Doc_BoardDao doc_dao = Doc_BoardDao.getInstance();
		Doc_Board doc_board = doc_dao.doc_detailBoard(seq);
		
		request.setAttribute("doc_board", doc_board);
		
		Doc_ActionForward doc_forward = new Doc_ActionForward();
		
		doc_forward.setIsRedirect(false);
		doc_forward.setPath("Doc_updateForm.jsp");
		
		return doc_forward;
	}

}
